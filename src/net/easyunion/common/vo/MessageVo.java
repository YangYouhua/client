package net.easyunion.common.vo;

import java.util.Map;

/**
 * 报文
 * @author lipenghui
 *
 * @version 创建时间：2013年11月26日  上午11:39:50
 */
public class MessageVo {

	private long messageId;
	private String serverName;
    private Map<String, Object> args;
	private String date;
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
    public Map<String, Object> getArgs() {
        return args;
    }
    public void setArgs(Map<String, Object> args) {
        this.args = args;
    }



}
