package com.bdi.aws.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.aws.dao.AwsTestDAO;
import com.bdi.aws.vo.Aws;

@Repository
public class AwsTestDAOImpl implements AwsTestDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Aws> selectAwsList() {
		
		return ss.selectList("com.bdi.sp.AWSMAPPER.selcetAwsList");
	}

	@Override
	public Aws selectAws(int atnum) {
	
		return ss.selectOne("com.bdi.sp.AWSMAPPER.selcetAws",atnum);
	}

	@Override
	public Integer insertAws(Aws aws) {
		
		return ss.insert("com.bdi.sp.AWSMAPPER.insertAws",aws);
	}

	@Override
	public Integer updateAws(Aws aws) {
	
		return ss.update("com.bdi.sp.AWSMAPPER.updateAws",aws);
	}

	@Override
	public Integer deleteAws(int atnum) {
	
		return ss.delete("com.bdi.sp.AWSMAPPER.deleteAws",atnum);
	}

}
