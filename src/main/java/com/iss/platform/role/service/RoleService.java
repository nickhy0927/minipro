package com.iss.platform.role.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.platform.role.mapper.RoleMapper;
import com.iss.platform.role.pojo.Role;

@Service
public class RoleService {

	@Autowired
	private RoleMapper roleMapper;

	public int insert(Role role) {
		return roleMapper.insert(role);
	}

	public long queryCount() {
		int size = roleMapper.selectAll().size();
		return size;
	}
}
