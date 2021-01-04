//customize *healthe endpoint
package com.abdoulc.health.actuatorexample.health;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternetHealthMetrics implements HealthIndicator {

	@Override
	public Health health() {
		
		return checkInternet()==true? Health.up().withDetail("202", "Active internet Connection")
				.build(): Health.down().withDetail("error code", "Inactive internet Connection")
				.build();

	}
	
	private boolean checkInternet() {
		boolean flag = false;	
		try {
			URL url = new URL("https://www.google.com");
			URLConnection connection = url.openConnection();
			connection.connect();
			flag = true;
		}catch(Exception e) {
			flag = false;
		}
		return flag;
	}

}
