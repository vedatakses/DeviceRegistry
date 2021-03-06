package com.deviceregistry.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class HealthController.
 */
@RestController
public class HealthController {
	
	/** The service name. */
	@Value(("${service.name}"))
	private String serviceName;
	
	/**
	 * Custom.
	 *
	 * @return the string
	 */
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String custom() {
        return this.serviceName + " is running...";
    }

}
