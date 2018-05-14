package com.iss.minipro;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.core.utils.IdWorker;
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
	public void insert() {
		Role role = new Role();
		String id = IdWorker.getSeqId();
		role.setId(IdWorker.getSeqId());
		role.setName("abc");
		int i = roleService.insert(role);
		System.out.println(i + "--->" + id);
		
	}
	@Test
	public void update() {
		Role role = new Role();
		String id = "445732083092946944";
		Role role2 = roleService.queryRoleById(id);
		System.out.println(role2);
		role.setId(id);
		role.setUpdateTime(new Date());
		roleService.update(role);
		Role role3 = roleService.queryRoleById(id);
		System.out.println(role3);
	}
	
	@Test
	public void queryRoleByName() {
		Role role = roleService.queryRoleByName("管理员444250892221284352");
		System.out.println(role);
		
		
	}
	

}
