package com.learning.search.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author test
 *
 */
@RestController
public class SearchController {
	
	@RequestMapping("/search")
	public String hello() {
		return "This is Search Flow.";
	}
	
}
