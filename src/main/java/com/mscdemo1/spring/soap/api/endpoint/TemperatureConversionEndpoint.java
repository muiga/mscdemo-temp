package com.mscdemo1.spring.soap.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.mscdemo1.spring.soap.api.service.TemperatureConversionService;
import com.mscdemo1.spring.soap.api.temp.Acknowledgement;
import com.mscdemo1.spring.soap.api.temp.UserRequest;

@Endpoint
public class TemperatureConversionEndpoint {
	
	private static final String NAMESPACE ="http://www.mscdemo1.com/spring/soap/api/temp";
	
	@Autowired
	private TemperatureConversionService service;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "UserRequest")
	@ResponsePayload
	public Acknowledgement convertTemperature(@RequestPayload UserRequest request) {
		return service.convertTemperature(request);
		
	}

}
