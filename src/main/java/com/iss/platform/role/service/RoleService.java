package com.iss.platform.role.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.platform.role.dao.RoleMapper;
import com.iss.platform.role.pojo.Role;

@Service
public class RoleService  {

	@Autowired
	private RoleMapper roleMapper;

	public int insert(Role role) {
		return roleMapper.insert(role);
	}
	
	public Role queryRoleByName(String name) {
		Role role = roleMapper.queryRoleByName(name);
		return role;
	}
	
	public Role queryRoleById(String id) {
		Role role = roleMapper.queryRoleById(id);
		return role;
	}
	
	public void update(Role role) {
		roleMapper.update(role);
	}
	
	public Role selectOneByExample(String id) {
		Role role = roleMapper.selectByPrimaryKey(id);
		return role;
	}
}
