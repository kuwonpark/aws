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

import com.bdi.aws.vo.Aws;

import lombok.extern.slf4j.Slf4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class DBTest {
	
	@Autowired
	private SqlSession ss;
	
	@Test
	public void test() throws SQLException{
		List<Aws> atList = ss.selectList("com.bdi.sp.AWSMAPPER.selcetAwsList");
		
		assertEquals(1, atList.size());
		log.info("atList=>{}",atList);
		Aws aws = ss.selectOne("com.bdi.sp.AWSMAPPER.selcetAws",2);
		assertNotNull(aws);
		
		aws.setAtname("dko");
		aws.setAtdesc("확인a");	
		assertEquals(1, ss.update("com.bdi.sp.AWSMAPPER.updateAws",aws));
	
		aws =ss.selectOne("com.bdi.sp.AWSMAPPER.selcetAws",2);
		assertEquals("dko", aws.atname);
		
		assertEquals(1,ss.delete("com.bdi.sp.AWSMAPPER.deleteAws",2));
		assertEquals(1,ss.insert("com.bdi.sp.AWSMAPPER.insertAws",aws));
		
		List<Aws> awsList=  ss.selectList("com.bdi.sp.AWSMAPPER.selcetAwsList");
		
		assertEquals(1, atList.size());
		log.info("atList=>{}",atList);
	}

}
