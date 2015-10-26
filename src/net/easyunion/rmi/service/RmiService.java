/**
 * 
 */
package net.easyunion.rmi.service;

import java.util.HashMap;
import java.util.Map;

import net.easyunion.biz.BizMsgCodeConst;
import net.easyunion.biz.IBiz;
import net.easyunion.common.model.ResponseVo;
import net.easyunion.common.spring.SpringContextUtil;
import net.easyunion.common.util.DocTool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.w3c.dom.Document;


/**
 * @author Administrator
 * 
 */

public class RmiService implements IRmiService {
	private final static Logger logger = LoggerFactory
			.getLogger(RmiService.class);

	public String getName() {
		return "ajun";
	}

	public Map<String, Object> getMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("1", 10);
		m.put("2", 10.0);
		m.put("3", 10L);
		m.put("4", 12.36655);
		return m;
	}

	@Override
	public String doService(String reqJson) {
		String result = "";
		ResponseVo vo = new ResponseVo();
		logger.info("INFO============xmlString密文=" + reqJson);
		// TODO 解密 reqJson = Base64Util.decode(reqJson);
		logger.info("INFO============xmlString明文=" + reqJson);
		if (null == reqJson || "".equals(reqJson)) {
			logger.info("INFO============报文参数为空！");
			vo.setResCode(BizMsgCodeConst.ResCode.reqeustDocIsNull.toString());
			vo.setResMsg("请求报文为空");
			return vo.getDoc();
		}
		String tran_id = "";
		try {
			Document doc = DocTool.getDocument(reqJson);
			tran_id = DocTool.getChildValue(doc, 0, "tran_id");
			String beanName = (tran_id.split("\\."))[tran_id.split("\\.").length - 1];
			ApplicationContext scu = SpringContextUtil.getContext();
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

	@Override
	public String doFile(UploadInfo uploadInfo) {
		//
		String res = "";
//		try {
//			String url = "/"+uploadInfo.getDir()+"/"+uploadInfo.getNewName();
//			String type = uploadInfo.getFileName().substring(uploadInfo.getFileName().indexOf(".")+1,uploadInfo.getFileName().length());
//			String path = ConfigKit.getStr("file.path")+url;
//			File file = new File(path);
//			if(!file.getParentFile().exists()){
//				file.getParentFile().mkdirs();
//			}
//			FileOutputStream fos = new FileOutputStream(file);
//			fos.write(uploadInfo.getData());
//			fos.flush();
//			fos.close();
//			//'gif,jpg,jpeg,bmp,png'
//			//如果是图片，返回img标签，如果是附件，返回下载的a标签
//			String showContent=".PNG.png.JPG.jpg.jpeg.JPEG.png.PNG.bmp.BMP";
//			if(showContent.indexOf(type)>-1){
//				res = "<a href=\""+ConfigKit.getStr("file.url")+url+"\" target=\"_blank\">"+uploadInfo.getFileName()+"</a>";
//			}else{
//				res = "<a href=\""+ConfigKit.getStr("file.down.url")+"?file="+path+"\" target=\"_blank\">"+uploadInfo.getFileName()+"</a>";
//			}
//			
//			res = Base64Util.encode(res);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return res;
	}

}