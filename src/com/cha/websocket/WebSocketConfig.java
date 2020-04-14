package com.cha.websocket;

import java.util.Set;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;

public class WebSocketConfig implements ServerApplicationConfig {
	
	//注解方式，扫描src下所有类@ServerEndPoint注解的类
	@Override
	public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> scanned) {
		// TODO Auto-generated method stub
		System.err.println("START CONFIG:" + scanned.size());
        return scanned;
	}

	@Override
	public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
