package com.bdi.aws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.aws.dao.AwsTestDAO;
import com.bdi.aws.service.AwsTestService;
import com.bdi.aws.vo.Aws;

@Service
public class AwsTestServiceImpl implements AwsTestService {

	@Autowired
	private AwsTestDAO atdao;
	
	@Override
	public List<Aws> selectAwsList() {
	
		return atdao.selectAwsList();
	}

	@Override
	public Aws selectAws(int atnum) {
		
		return atdao.selectAws(atnum);
	}

	@Override
	public Integer insertAws(Aws aws) {
		
		return atdao.insertAws(aws);
	}

	@Override
	public Integer updateAws(Aws aws) {
		
		return atdao.updateAws(aws);
	}

	@Override
	public Integer deleteAws(int atnum) {
	
		return atdao.deleteAws(atnum);
	}

}
