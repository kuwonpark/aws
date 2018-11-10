package com.bdi.aws;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SQLTest {

	@Autowired
	private DataSource ds;
	
	@Test
	public void test() {
		Connection con;
		try {
			con = ds.getConnection();
			con.createStatement().executeQuery("select * from aws_Test");
			assertNotNull(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
