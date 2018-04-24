package net.easyunion.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProxyServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8006837826701837498L;
	
	private String url;

	/**
	 * 对servlet进行请求处理，并将结果在指定输出流中输出
	 * 
	 * @param os
	 * @param servletName
	 * @param parm
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	private void process(HttpServletRequest req, HttpServletResponse resp,
			String[] target) throws MalformedURLException, IOException {
		// 取得连接
		HttpURLConnection huc = (HttpURLConnection) new URL(url + target[0])
				.openConnection();

		// 设置连接属性
		huc.setDoOutput(true);
		huc.setRequestMethod("POST");
		huc.setUseCaches(false);
		huc.setInstanceFollowRedirects(true);
		huc.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");
		huc.connect();

		// 往目标servlet中提供参数
		OutputStream targetOS = huc.getOutputStream();
		targetOS.write(target[1].getBytes());
		targetOS.flush();
		targetOS.close();

		// 取得页面输出,并设置页面编码及缓存设置
		resp.setContentType(huc.getContentType());
		resp.setHeader("Cache-Control", huc.getHeaderField("Cache-Control"));
		resp.setHeader("Pragma", huc.getHeaderField("Pragma"));
		resp.setHeader("Expires", huc.getHeaderField("Expires"));
		OutputStream os = resp.getOutputStream();

		// 将目标servlet的输入流直接往页面输出
		InputStream targetIS = huc.getInputStream();
		int r;
		while ((r = targetIS.read()) != -1) {
			os.write(r);
		}
		targetIS.close();
		os.flush();
		os.close();

		huc.disconnect();
	}

	/**
	 * 将参数中的目标分离成由目标servlet名称和参数组成的数组
	 * 
	 * @param queryString
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private String[] parse(Map map) throws UnsupportedEncodingException {
		String[] arr = { "", "" };
		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry me = (Entry) iter.next();
			String[] varr = (String[]) me.getValue();
			if ("servletName".equals(me.getKey())) {
				// 取出servlet名称
				arr[0] = varr[0];
			} else {
				// 重新组装参数字符串
				for (int i = 0; i < varr.length; i++) {
					// 参数需要进行转码，实现字符集的统一
					arr[1] += "&" + me.getKey() + "="
							+ URLEncoder.encode(varr[i], "utf-8");
				}
			}
		}
		arr[1] = arr[1].replaceAll("^&", "");
		return arr;
	}

	@Override
	public void init() throws ServletException {
		// 设置目标服务器地址
		url = this.getInitParameter("url");
		if (!url.endsWith("/"))
			url = url + "/";
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String[] target = parse(req.getParameterMap());
		process(req, resp, target);
	}
}