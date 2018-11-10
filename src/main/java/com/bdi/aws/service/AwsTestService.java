package com.bdi.aws.service;

import java.util.List;

import com.bdi.aws.vo.Aws;

public interface AwsTestService {

	public List<Aws> selectAwsList();
	public Aws selectAws(int atnum);
	public Integer insertAws(Aws aws);
	public Integer updateAws(Aws aws);
	public Integer deleteAws(int atnum);
}
