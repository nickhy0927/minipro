package com.iss.core.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iss.core.platform.user.RoleService;
import com.iss.core.platform.user.pojo.Role;

@Controller
public class IndexController {
	@Autowired
	RoleService roleService;

	@RequestMapping(value = "/index")
	public String index(Model model) {
		Role role = new Role();
		role.setId(1);
		role.setName("管理员");
		role.setRemark("管理员配置");
		roleService.createRole(role);
		System.out.println("mini pro 首页方法...");
		model.addAttribute("info", "mini pro 首页方法...1234");
		return "index";
	}
}
