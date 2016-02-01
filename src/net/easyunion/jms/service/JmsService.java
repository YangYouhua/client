package net.easyunion.jms.service;

import net.easyunion.app.jms.JmsServer;
import net.easyunion.app.jms.MessageHandler;
import net.easyunion.biz.BizMsgCodeConst;
import net.easyunion.biz.IBiz;
import net.easyunion.common.model.ResponseVo;
import net.easyunion.common.spring.SpringContextUtil;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.util.PropertiesUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.w3c.dom.Document;

public class JmsService implements ApplicationListener<ContextRefreshedEvent>{
	
	private final static Logger logger = LoggerFactory
			.getLogger(JmsService.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		logger.error("启动jms服务开始。。。。。。");
		if(event.getApplicationContext().getParent() == null){
			String queue = PropertiesUtil.getInstance().getProperties("jms.queue");
			String url = PropertiesUtil.getInstance().getProperties("jms.url");
			
			logger.error("监听队列"+queue+",地址："+url);
			
			JmsServer server = new JmsServer(new MessageHandler() {
				
				ApplicationContext scu = SpringContextUtil.getContext();
				
				public String handleMessage(String msg) {
					
					String result = "";
					ResponseVo vo = new ResponseVo();
					logger.error("INFO============xmlString密文=" + msg);
					// TODO 解密 reqJson = Base64Util.decode(reqJson);
					logger.error("INFO============xmlString明文=" + msg);
					if (null == msg || "".equals(msg)) {
						logger.error("INFO============报文参数为空！");
						vo.setResCode(BizMsgCodeConst.ResCode.reqeustDocIsNull.toString());
						vo.setResMsg("请求报文为空");
						return vo.getDoc();
					}
					String tran_id = "";
					try {
						Document doc = DocTool.getDocument(msg);
						tran_id = DocTool.getChildValue(doc, 0, "tran_id");
						String beanName = (tran_id.split("\\."))[tran_id.split("\\.").length - 1];
						IBiz work = (IBiz) scu.getBean(beanName);
						result = work.doWrok(doc);
					} catch (Exception e) {
						logger.error("ERR[" + tran_id + "]============解析报文xml或查询发生错误！"
								+ e.toString());
						vo.setResCode(BizMsgCodeConst.ResCode.parseXmlErr.toString());
						vo.setResMsg("解析报文xml或查询发生错误！");
						e.printStackTrace();
					}
					
					return result;
				}
			}, queue, url);
			server.start();
		}
		logger.error("启动jms服务结束。。。。。。");
	}

}
