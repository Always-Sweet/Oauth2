create table bcl_user
(
	user_id varchar(64) not null comment '用户唯一标识',
	name varchar(255) null comment '用户名',
	password varchar(255) null comment '密码',
	role_id varchar(64) null comment '角色',
	constraint bcl_user_user_id_uindex
		unique (user_id)
)
comment '用户表';

alter table bcl_user
	add primary key (user_id);

