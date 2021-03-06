CREATE TABLE `t_p_user` (
	`id` VARCHAR(50) NOT NULL COMMENT '主键ID',
	`login_name` VARCHAR(50) NULL DEFAULT NULL COMMENT '登录账号',
	`password` VARCHAR(50) NULL DEFAULT NULL COMMENT '登录密码',
	`status` INT(11) NULL DEFAULT NULL COMMENT '有效状态 1 有效，0 无效',
	`email` VARCHAR(50) NULL DEFAULT NULL COMMENT '用户邮箱',
	`remark` VARCHAR(50) NULL DEFAULT NULL COMMENT '用户备注',
	`last_login_time` DATETIME NULL DEFAULT NULL COMMENT '最后一次登录时间',
	`create_time` DATETIME NULL DEFAULT NULL COMMENT '创建时间',
	`update_time` DATETIME NULL DEFAULT NULL COMMENT '修改时间',
	`delete_time` DATETIME NULL DEFAULT NULL COMMENT '删除时间'
)
COMMENT='系统平台用户表';

CREATE TABLE `t_p_role` (
	`id` VARCHAR(50) NOT NULL COMMENT '主键ID',
    `name` VARCHAR(50) NULL DEFAULT NULL COMMENT '角色名称',
    `remark` VARCHAR(50) NULL DEFAULT NULL COMMENT '角色备注',
    `p_id` VARCHAR(50) NULL DEFAULT NULL COMMENT '父级角色ID',
	`status` INT(11) NULL DEFAULT NULL COMMENT '有效状态 1 有效，0 无效',
	`create_time` DATETIME NULL DEFAULT NULL COMMENT '创建时间',
	`update_time` DATETIME NULL DEFAULT NULL COMMENT '修改时间',
	`delete_time` DATETIME NULL DEFAULT NULL COMMENT '删除时间'
)
COMMENT='系统平台角色表';

CREATE TABLE `t_p_menu` (
	`id` VARCHAR(50) NOT NULL COMMENT '主键ID',
	`name` VARCHAR(50) NULL DEFAULT NULL COMMENT '菜单名称',
	`url` VARCHAR(200) NULL DEFAULT NULL COMMENT '菜单地址',
	`alias` VARCHAR(200) NULL DEFAULT NULL COMMENT '菜单别名',
	`remark` VARCHAR(200) NULL DEFAULT NULL COMMENT '菜单备注',
	`p_id` VARCHAR(50) NULL DEFAULT NULL COMMENT '上级菜单ID',
	`status` INT(11) NULL DEFAULT NULL COMMENT '有效状态 1 有效 0 无效',
	`create_time` DATETIME NULL DEFAULT NULL COMMENT '创建时间',
	`update_time` DATETIME NULL DEFAULT NULL COMMENT '修改时间',
	`delete_time` DATETIME NULL DEFAULT NULL COMMENT '删除时间'
)
COMMENT='系统平台菜单表';

