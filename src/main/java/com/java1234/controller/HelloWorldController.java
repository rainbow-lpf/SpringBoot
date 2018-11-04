package com.java1234.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "欢迎信息 ", produces = MediaType.APPLICATION_JSON)
@RestController
@RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON)
public class HelloWorldController {

    @ApiOperation(value = "说hello", notes = "查hello")
	@RequestMapping(value="/say",method=RequestMethod.GET)
	public String say() {
		
		return "hello Spring boot";
	}
}
