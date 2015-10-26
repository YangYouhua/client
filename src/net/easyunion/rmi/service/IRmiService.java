/**
 * 
 */
package net.easyunion.rmi.service;

import java.util.Map;

/**
 * @author Administrator
 * 
 */
public interface IRmiService {

	public String getName();

	public Map<String, Object> getMap();

	public String doService(String reqJson);

	public String doFile(UploadInfo file);
}
