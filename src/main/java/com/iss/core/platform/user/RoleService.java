package com.iss.core.platform.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.core.platform.user.dao.RoleMapper;
import com.iss.core.platform.user.pojo.Role;

@Service
public class RoleService {

	@Autowired
	RoleMapper roleMapper;
	
	public void createRole(Role record) {
		roleMapper.insert(record);
	}
}
