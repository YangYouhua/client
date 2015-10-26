package net.easyunion.biz;

/**
 * 返回码 respcode
 * @author lipenghui
 *
 * @version 创建时间：2015年4月10日  下午1:25:50
 */
public class BizMsgCodeConst {

	/**
	 * 返回码常量
	 * @author lipenghui
	 *
	 * @version 创建时间：2015年4月10日  下午1:38:06
	 */
	public static enum ResCode{
		success(100),//成功
		reqeustDocIsNull(201),//请求报文为空
		reqeustParamIsNull(202),//请求参数为空
		parseXmlErr(301),//解析xml错误
		innerInterfaceErr(401),//内部接口错误
		authNone(501);//内部接口错误
		public int value;
		public String toString(){
			return String.valueOf(value);
		}
		private ResCode(int value) {
			this.value = value;
		}
	}
}
