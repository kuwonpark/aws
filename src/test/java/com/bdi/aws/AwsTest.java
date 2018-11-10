package com.bdi.aws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bdi.aws.dao.AwsTestDAO;
import com.bdi.aws.vo.Aws;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class AwsTest {

	@Autowired
	private AwsTestDAO ad;
	
	
	@Test
	public void test() throws SQLException{
		assertEquals(1, ad.selectAwsList().size());

		
	}

}
