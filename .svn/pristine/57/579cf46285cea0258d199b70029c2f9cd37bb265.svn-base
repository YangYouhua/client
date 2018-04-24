package net.easyunion.common.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextUtil implements ApplicationContextAware {
	private static ApplicationContext context;//声明一个静态变量保存    
    
    @SuppressWarnings("static-access")  
    @Override  
    public void setApplicationContext(ApplicationContext context)  
            throws BeansException {  
        this.context = context;  
    }  
  
    public static ApplicationContext getContext(){     
        return context;     
    }     
}
