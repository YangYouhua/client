/**
 * 
 */
package cn.net.easyunion.ws;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class MainTest {

	public static String loadxml(String fileid) {
		String path = MainTest.class.getResource("/" + fileid).getPath();
		BufferedReader br = null;
		StringBuffer ret = new StringBuffer();
		try {
			br = new BufferedReader(new FileReader(new File(path)));
			String line = null;
			while ((line = br.readLine()) != null) {
				ret.append(line);
			}
			br.close();
			return ret.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		TsmmsWebService tws = new TsmmsWebService();
		TsmmsWebServicePortType twspt = tws.getTsmmsWebServiceSOAP11PortHttp();
		// ��ѯ��˰�˵Ǽ����
		String xmlcontent = loadxml("tsm.fpbl.hxzgsj.fpdk.cxtsnsrdjxh.xml");
		System.out.println("���ͱ���:" + xmlcontent);
		String result = twspt.doService(xmlcontent);
		System.out.println("���ر���:" + result);

		// ѯ��˰��Ʊ�ֺ˶���Ϣ
		String xmlcontent1 = loadxml("tsm.fpbl.hxzgsj.fpff.cxnsrpzhdxx.xml");
		System.out.println("���ͱ���:" + xmlcontent1);
		String result1 = twspt.doService(xmlcontent1);
		System.out.println("���ر���:" + result1);

		// ��Ʊͣ����Ϣ��ѯ
		String xmlcontent2 = loadxml("tsm.fpbl.hxzgsj.fpff.fptgxxcx.xml");
		System.out.println("���ͱ���:" + xmlcontent2);
		String result2 = twspt.doService(xmlcontent2);
		System.out.println("���ر���:" + result2);
	}
}
