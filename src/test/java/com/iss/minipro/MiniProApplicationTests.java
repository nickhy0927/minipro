package com.iss.minipro;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.iss.core.platform.user.RoleService;
import com.iss.core.platform.user.dao.RoleMapper;
import com.iss.core.platform.user.pojo.Role;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.iss.core.platform.user.dao")
public class MiniProApplicationTests {

	@Autowired
	RoleService roleService;
	@Autowired
	RoleMapper roleMapper;
	@Test
	public void contextLoads() {
		Role role = new Role();
		role.setId(1);
		role.setName("管理员");
		role.setRemark("管理员配置");
//		roleService.createRole(role);
		List<Role> list = roleMapper.selectByExample(role);
		System.out.println(list != null ? list.size() : -1);
		System.out.println(roleService);
	}

}
