package com.revature;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import com.revature.service.AccountService;

@Configuration
public class ClientConfiguration {
	
	
	@Bean
	public JaxWsPortProxyFactoryBean serviceProxy() {
		JaxWsPortProxyFactoryBean proxyFactory = new JaxWsPortProxyFactoryBean();
		
		try {
			proxyFactory.setWsdlDocumentUrl(new URL("http://localhost:7070/soap-service/account-service?wsdl"));
			proxyFactory.setServiceInterface(AccountService.class);
			proxyFactory.setServiceName("AccountServiceService");
			proxyFactory.setPortName("AccountServicePort");
			proxyFactory.setNamespaceUri("http://service.revature.com/");
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		return proxyFactory;
	}
	////
	
	
	


}