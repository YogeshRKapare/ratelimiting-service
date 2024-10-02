package com.yogesh.microservices.ratelimiting.myclasses;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class MyConfigurations {
	
	String maxRate;
	String minRate;

	
	public MyConfigurations() {
		// TODO Auto-generated constructor stub
	}
	
	public MyConfigurations(String maxRate, String minRate) {
		super();
		this.maxRate = maxRate;
		this.minRate = minRate;
	}
	
	public String getMaxRate() {
		return maxRate;
	}
	public void setMaxRate(String maxRate) {
		this.maxRate = maxRate;
	}
	public String getMinRate() {
		return minRate;
	}
	public void setMinRate(String minRate) {
		this.minRate = minRate;
	}

	@Override
	public String toString() {
		return "MyConfigurations [maxRate=" + maxRate + ", minRate=" + minRate + "]";
	}

	
}
