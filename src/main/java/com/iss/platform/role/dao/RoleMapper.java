package com.iss.platform.role.dao;

import com.core.orm.mapper.BaseMapper;
import com.iss.platform.role.pojo.Role;

public interface RoleMapper extends BaseMapper<Role> {
	
	Role queryRoleByName(String name);
	Role queryRoleById(String id);
	
	void update(Role role);
}