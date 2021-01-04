// add your own endpoint
package com.abdoulc.health.actuatorexample.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Endpoint(id="abdelc", enableByDefault = true)
public class MyEndpoint {
	
	@ReadOperation
	public MyEndPointResponse features() {
		return new MyEndPointResponse(444,"Abdel Channel","active");
	}
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class MyEndPointResponse{
	
	private int id;
	private String name;
	private String status;
}