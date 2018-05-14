package com.iss.platform.role.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.platform.role.mapper.RoleMapper;
import com.iss.platform.role.mapper.RoleMapperCustom;
import com.iss.platform.role.pojo.Role;

@Service
public class RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Autowired
	private RoleMapperCustom roleMapperCustom;

	public int insert(Role role) {
		return roleMapper.insert(role);
	}

	public long queryCount() {
		int size = roleMapper.selectAll().size();
		return size;
	}

	public Map<String, Object> queryRoleByName(String name) {
		Map<String, Object> map = roleMapper.queryRoleByName(name);
		return map;
	}

	public Map<String, Object> queryRoleId(String id) {
		Map<String, Object> map = roleMapperCustom.queryRoleById(id);
		return map;
	}
}
