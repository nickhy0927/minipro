package com.iss.platform.role.mapper;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.core.utils.MyMapper;
import com.iss.platform.role.pojo.Role;

@Repository
public interface RoleMapper extends MyMapper<Role> {
	
	Map<String, Object> queryRoleByName(String name);
}