package net.easyunion.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpToolKit {

	public static String doPost(String postUrl, String postData) {
		String result = "";
		
		try {
            URL url = new URL(postUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setUseCaches(false);
            conn.setDoOutput(true);

            conn.setRequestProperty("Content-Length", "" + postData.length());
            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            out.write(postData);
            out.flush();
            out.close();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                System.out.println("connect failed!");
                result = "";
            }
            String line = "";
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "GBK"));
            while ((line = in.readLine()) != null) {
                result += line + "\n";
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return result;
	}
	public static void main(String[] args) throws UnsupportedEncodingException {
		String fwskUrl = PropertiesUtil.getInstance().getProperties("fwsk.url");
        fwskUrl = fwskUrl + "/FpfsJoin?rkdj=0.0&fsdj=0.0&gpfs=NET";
        System.out.println("fwskUrl : " + fwskUrl);
        
        String sCzymc = "ctais";
        String sFpzl = "";
        
        //防伪税控发票种类   P1 普通发票 YB 专票
        	sFpzl = "P1";
        
        String postData = "1AND1309033202788101AND1300144320AND11309030000AND01086001AND01086003AND3AND" + sCzymc + "AND" + sFpzl;
        
        System.out.println("postData: " + postData);
        
        String retFwsk = HttpToolKit.doPost(fwskUrl, postData);
        System.out.println(retFwsk);
	}
}
