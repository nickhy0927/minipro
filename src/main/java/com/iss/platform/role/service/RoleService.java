package com.iss.platform.role.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.platform.role.dao.RoleMapper;
import com.iss.platform.role.pojo.Role;

@Service
public class RoleService {
	
	@Autowired
	private RoleMapper roleMapper;
	
	public Role queryRoleByName(String name) {
		Role role = roleMapper.queryRoleByName(name);
		return role;
	}
}
