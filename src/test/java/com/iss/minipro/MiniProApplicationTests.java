package com.iss.minipro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.iss.platform.role.pojo.Role;
import com.iss.platform.role.service.RoleService;

import tk.mybatis.spring.annotation.MapperScan;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.iss.core.platform.user.dao")
public class MiniProApplicationTests {

	@Autowired
	private RoleService roleService;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void queryRoleId() {
	}
	
	@Test
	public void queryRoleByName() {
		Role role = roleService.queryRoleByName("管理员444250892221284352");
		System.out.println(role);
		
		
	}
	

}
