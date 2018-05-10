package com.iss.platform.index;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.utils.IdWorker;
import com.iss.platform.role.pojo.Role;
import com.iss.platform.role.service.RoleService;

@Controller
public class IndexController {

	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "/index")
	public String index(Model model) {
		for (int i = 0; i < 10000; i++) {
			String seqId = IdWorker.getSeqId();
			Role role = new Role();
			role.setCreateTime(new Date());
			role.setName("管理员" + seqId);
			role.setStatus(1);
			role.setRemark("备注-" + seqId);
			role.setId(seqId);
			roleService.insert(role);
		}
		System.out.println("mini pro 首页方法...");
		model.addAttribute("info", "mini pro 首页方法...1234");
		return "index";
	}
}
