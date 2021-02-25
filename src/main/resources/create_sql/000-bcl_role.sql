create table bcl_role
(
	role_id varchar(64) not null comment '角色唯一标识',
	`key` varchar(64) null comment '角色编码',
	name varchar(255) null comment '角色名称',
	constraint bcl_role_role_id_uindex
		unique (role_id)
)
comment '角色表';

alter table bcl_role
	add primary key (role_id);

