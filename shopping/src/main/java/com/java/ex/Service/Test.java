package com.java.ex.Service;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class Test {
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	UserService userService;
	
	@org.junit.Test
	@Ignore
	public void test() {
		System.out.println(sqlSessionFactory);
	}
	
	@org.junit.Test
	public void test2() throws Exception {
		System.out.println(userService.selectNow());
	}
}
