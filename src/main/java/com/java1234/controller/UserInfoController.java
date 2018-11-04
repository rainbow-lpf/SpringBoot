package com.java1234.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java1234.model.UserInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;


@Api(value = "用户信息", produces = MediaType.APPLICATION_JSON)
@RestController
@RequestMapping(value = "/userInfo", produces = MediaType.APPLICATION_JSON)
public class UserInfoController {

	@RequestMapping(value="getUserInfos",method=RequestMethod.GET)
    @ApiOperation(value = "查询所有的人员信息并展示", notes = "查询所有的人员信息并展示")
	public List<UserInfo> getUserInfos(){
		
		List<UserInfo> userInfos=new ArrayList<UserInfo>();
		
		userInfos.add(new UserInfo("001","王大仙","123456","18721009462"));
		userInfos.add(new UserInfo("002","李逵","123454","18721009463"));
		userInfos.add(new UserInfo("003","松江","123453","18721009464"));
		userInfos.add(new UserInfo("004","武松","123452","18721009465"));
		userInfos.add(new UserInfo("005","瘪三","123451","18721009466"));
		
		return userInfos;
	}
	
	
	@RequestMapping(value="getUserInfo",method=RequestMethod.GET)
    @ApiOperation(value = "查询所有的人员信息并展示", notes = "查询所有的人员信息并展示")
	@ApiImplicitParam(name = "user", value = "用户姓名")
	public UserInfo getUserInfoByuserName(@RequestParam("name") String name){
		
		return new UserInfo("005","瘪三","123451","18721009466");
	}
	
	@RequestMapping(value="create",method=RequestMethod.POST)
	@ApiOperation(value="创建用户",notes="创建一个用户")
	@ApiImplicitParam(name="userInfo",value="创建用户信息")
	public  UserInfo CreateUserInfo(UserInfo user) {
		
		return user;
	}
}
