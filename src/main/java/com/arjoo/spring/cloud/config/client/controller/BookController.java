package com.arjoo.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Value("${book.name}")
	private String bookName;
	
	
	@RequestMapping(value = "/name")
	public String getName() {
		return this.bookName;
	}
}
