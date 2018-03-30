/**
 * 
 */
package com.pradeep.echo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sripr
 *
 */

@RestController
@RequestMapping("/echo")
public class EchoApplicationController {

	/**
	 * 
	 */
	public EchoApplicationController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping
	public String echo() {
		
		return "echo world!!!";
		
	}
	@GetMapping("/stranger")
	public String echoStranger() {
		
		return "echo world STranger!!!";
		
	}
}
