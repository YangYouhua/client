package net.easyunion.common.annotation;

import java.lang.reflect.Method;

public class ParseAnnotation {
	
	public static String getActionName(Method method) {
		String name = "";
		try{
			
			LogAction action = method.getAnnotation(LogAction.class);
			if(action != null) {
				name = action.name();
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		 return name; 
	}
	
    @SuppressWarnings("unchecked")
    public static String getController(Class clazz){
    	String name = "";
    	try{
    		LogController controller = (LogController) clazz.getAnnotation(LogController.class);
    		if(controller != null){
    			name = controller.name();
    		}
    	} catch(Exception e){	
    		e.printStackTrace();
    	}
    	return name;
    }

}
