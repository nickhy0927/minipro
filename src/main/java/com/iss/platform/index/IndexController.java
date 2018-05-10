package com.iss.platform.index;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iss.platform.role.pojo.Role;
import com.iss.platform.role.service.RoleService;

@Controller
public class IndexController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value = "/index")
	public String index(Model model) {
		Role role = new Role();
		role.setCreateTime(new Date());
		role.setName("管理员");
		role.setId(UUID.randomUUID().toString());
		System.out.println(roleService);
		roleService.insert(role);
		System.out.println("mini pro 首页方法...");
		model.addAttribute("info", "mini pro 首页方法...1234");
		return "index";
	}
}
