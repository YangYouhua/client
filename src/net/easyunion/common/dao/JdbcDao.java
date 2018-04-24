/**
 * 文件名：BaseDao.java
 * 版权：Copyright 2014 EasyUnion
 * 描述：<描述>
 * 修改人：bony
 * 修改时间：2014年6月15日
 * 修改内容：<修改内容>
 */
package net.easyunion.common.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.record.Record;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author bony
 *
 */
public class JdbcDao extends JdbcDaoSupport implements IJdbcDao{

    @Override
    public List<Map<String, Object>> find(String sql, Object... args) {
		List<Map<String, Object>> tmp = getJdbcTemplate().queryForList(sql, args);
		for(Map<String, Object> m:tmp){
			for(String key : m.keySet()){
				try{
					Date str = (Date)m.get(key);
				}catch(Exception ex){
					m.put(key, m.get(key) == null ? "" : m.get(key).toString());
				}
			}
		}
		return tmp;
    }
    
    @Override
    public List<Map<String, Object>> find(String sql) {
    	List<Map<String, Object>> tmp = getJdbcTemplate().queryForList(sql);
    	for(Map<String, Object> m:tmp){
			for(String key : m.keySet()){
				try{
					Date str = (Date)m.get(key);
				}catch(Exception ex){
					m.put(key, m.get(key) == null ? "" : m.get(key).toString());
				}
				
				
			}
		}
		return tmp;
    }
    
}
