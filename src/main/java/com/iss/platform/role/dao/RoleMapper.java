package com.iss.platform.role.dao;

import com.core.utils.MyMapper;
import com.iss.platform.role.pojo.Role;

public interface RoleMapper extends MyMapper<Role> {
	
	Role queryRoleByName(String name);
}