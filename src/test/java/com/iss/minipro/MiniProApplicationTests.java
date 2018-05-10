package com.iss.minipro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.iss.core.platform.user.dao")
public class MiniProApplicationTests {

	@Test
	public void contextLoads() {
	}

}
