package net.easyunion.common.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class FwskDao extends JdbcDaoSupport implements IJdbcDao {

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
