package net.easyunion.common.model;

import java.util.Date;

import net.easyunion.common.util.DateUtils;

/**
 * 返回报文公用部分
 * @author lipenghui
 *
 * @version 创建时间：2015年4月10日  下午1:13:47
 */
public class ResponseVo {

	private String tran_id, tran_seq, tran_time, res_time, resCode, resMsg, result,record_id, channel;
	
	
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getTran_id() {
		return tran_id;
	}

	public String getRes_time() {
		return res_time;
	}

	public void setRes_time(String res_time) {
		this.res_time = res_time;
	}

	public void setTran_id(String tran_id) {
		this.tran_id = tran_id;
	}

	public String getTran_seq() {
		return tran_seq;
	}

	public void setTran_seq(String tran_seq) {
		this.tran_seq = tran_seq;
	}

	public String getTran_time() {
		return tran_time;
	}

	public void setTran_time(String tran_time) {
		this.tran_time = tran_time;
	}



	public String getResCode() {
		return resCode;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}

	public String getResMsg() {
		return resMsg;
	}

	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getRecord_id() {
		return record_id==null?"":record_id;
	}

	public void setRecord_id(String record_id) {
		this.record_id = record_id;
	}

	/**
	 * 返回报文
	 * @return
	 */
	public String getDoc(){
		String docXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" 
				+ "<response>"
				+ "      <head>"
				+ "			<tran_id>"+this.getTran_id()+"</tran_id>"
				+ "			<tran_seq>"+this.getTran_seq()+"</tran_seq>"
				+ "			<tran_time>"+this.getTran_time()+"</tran_time>"
				+ "			<res_date>"+DateUtils.getLongDay(new Date())+"</res_date>"
				+ "			<record_id>"+this.getRecord_id()+"</record_id>"
				+ "			<channel>"+this.getChannel()+"</channel>"
				+ "		</head>"
				+ "		<body>"
				+ "			<resCode>"+this.getResCode()+"</resCode>"
				+ "			<resMsg>"+this.getResMsg()+"</resMsg>"
				+ "			<result>"
				+ 				result
				+ "			</result>"
				+ "		</body>"
				+ "	</response>";
		return docXml;
	}
	
}
