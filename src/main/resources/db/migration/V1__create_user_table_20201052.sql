DROP table IF exists USER;
CREATE table USER
(
    id bigint(64) not null comment '用户id',
    name varchar(32) null comment '用户名',
    age int(11) null comment '年龄',
    birth_day date null comment '出生日期',
    create_time datetime null DEFAULT current_timestamp  comment '创建时间',
    update_time datetime null DEFAULT current_timestamp ON UPDATE current_timestamp comment '更新时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;