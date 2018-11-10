package com.bdi.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.aws.service.AwsTestService;
import com.bdi.aws.vo.Aws;

@Controller
public class AwsTestController {

	@Autowired
	private AwsTestService ats;
	
	@GetMapping("/awstests")
	public @ResponseBody List<Aws> getAwsTestLust(){
		return ats.selectAwsList();	
	}
}
