SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS t_baidu_insight;
DROP TABLE IF EXISTS t_crowd;
DROP TABLE IF EXISTS t_crowd_keywords;
DROP TABLE IF EXISTS t_monthly_active_user;
DROP TABLE IF EXISTS t_monthly_mac_duplicate_removal;
DROP TABLE IF EXISTS t_other_app_account;
DROP TABLE IF EXISTS t_user;
DROP TABLE IF EXISTS t_weekly_mac_duplicate_removal;




/* Create Tables */

CREATE TABLE t_baidu_insight
(
	id int NOT NULL AUTO_INCREMENT,
	crowd_id int,
	schedule_id int,
	schedule_status int,
	json_result varchar(2000) BINARY,
	excel_result varchar(2000) BINARY,
	user_id int,
	PRIMARY KEY (id)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;


CREATE TABLE t_crowd
(
	id int NOT NULL AUTO_INCREMENT,
	-- 创建时间
	-- 
	create_time datetime COMMENT '创建时间
',
	crowd_name varchar(255) BINARY,
	crowd_source int,
	query_type varchar(10) BINARY,
	app_name varchar(255) BINARY,
	mobile_brand varchar(255) BINARY,
	quantity bigint(20),
	vitality int,
	time_begin datetime,
	time_end datetime,
	description varchar(255) BINARY,
	upload_file varchar(2000) BINARY,
	user_id int,
	generate_file varchar(2000) BINARY,
	crowd_status int,
	PRIMARY KEY (id)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;


CREATE TABLE t_crowd_keywords
(
	crowd_id int NOT NULL,
	keyword varchar(255) NOT NULL,
	PRIMARY KEY (crowd_id, keyword)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;


CREATE TABLE t_monthly_active_user
(
	id int NOT NULL AUTO_INCREMENT,
	year int,
	month int,
	user_count bigint(20),
	PRIMARY KEY (id)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;


CREATE TABLE t_monthly_mac_duplicate_removal
(
	id int NOT NULL AUTO_INCREMENT,
	year int,
	month int,
	mac_count bigint(20),
	PRIMARY KEY (id)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;


CREATE TABLE t_other_app_account
(
	id int NOT NULL AUTO_INCREMENT,
	app_name varchar(255) BINARY,
	total_account bigint(20),
	PRIMARY KEY (id)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;


CREATE TABLE t_user
(
	id int NOT NULL AUTO_INCREMENT,
	username varchar(255) BINARY,
	password varchar(255) BINARY,
	nickname varchar(255) BINARY,
	gender int,
	company varchar(255) BINARY,
	email varchar(255) BINARY,
	birth_year int,
	birth_month int,
	birth_day int,
	PRIMARY KEY (id)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;


CREATE TABLE t_weekly_mac_duplicate_removal
(
	id bigint(20) NOT NULL,
	count_date datetime,
	mac_count bigint(20),
	PRIMARY KEY (id)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;



