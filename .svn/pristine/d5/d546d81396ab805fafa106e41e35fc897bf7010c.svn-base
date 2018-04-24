/**
 * 文件名：BaseService.java
 * 版权：Copyright 2014 EasyUnion
 * 描述：<描述>
 * 修改人：bony
 * 修改时间：2014年6月15日
 * 修改内容：<修改内容>
 */
package net.easyunion.common.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;



import net.easyunion.common.dao.FwskDao;
import net.easyunion.common.dao.JdbcDao;

/**
 * @author bony
 *
 */
public class BaseService {
	@Resource
    private JdbcDao jdbcDao;
	@Resource
	private FwskDao fwskDao;
    
	protected JdbcDao getJdbcDao(){
        return this.jdbcDao;
    }
	
	protected FwskDao getFwskDao(){
        return this.fwskDao;
    }

	
	public static void main(String[] args) {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("1", 1L);
		m.put("2", 2.222);
		m.put("3", 11);
		m.put("4", "123123123");
		m.put("5", null);
		
		for (String key : m.keySet()) {
			if (m.get(key) instanceof Long || m.get(key) instanceof Double || m.get(key) instanceof Integer) {
				System.out.println(m.get(key).toString());
			}
		}
		
	}
    
	
}


