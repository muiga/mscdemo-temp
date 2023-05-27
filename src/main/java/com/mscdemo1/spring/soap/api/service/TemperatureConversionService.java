package com.mscdemo1.spring.soap.api.service;

import org.springframework.stereotype.Service;

import com.mscdemo1.spring.soap.api.temp.Acknowledgement;
import com.mscdemo1.spring.soap.api.temp.UserRequest;

@Service
public class TemperatureConversionService {

	public Acknowledgement convertTemperature(UserRequest request) {
		Acknowledgement acknowledgement = new Acknowledgement();
		String units = request.getTempUnits();
		float temp = request.getTemp();
	
//		 System.out.println(units );

				
		if (units.equalsIgnoreCase("celsius")) {			
			  float Fahrenheit =((temp*9)/5)+32;  
			   
			  acknowledgement.setTemp(Fahrenheit);
			  acknowledgement.setTempUnits("degrees fahrenheit");			
		}
		
		if(units.equalsIgnoreCase("fahrenheit")){
			float Celsius  = ((temp-32)*5)/9;  	
			
			acknowledgement.setTemp(Celsius);
			acknowledgement.setTempUnits("degrees celsius");
		}
		
		return acknowledgement;

	}
	
}
