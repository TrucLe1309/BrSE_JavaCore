DROP DATABASE IF EXISTS final_exam1;
CREATE DATABASE final_exam1;
USE final_exam1;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
    id                  TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    full_name           VARCHAR(50) NOT NULL,
    email               VARCHAR(50) UNIQUE KEY NOT NULL,
    `password`          VARCHAR(12) NOT NULL DEFAULT '123456',
    pro_skill           VARCHAR(50) ,
    exp_in_year         TINYINT UNSIGNED,
    project_id			TINYINT UNSIGNED UNIQUE KEY NOT NULL,
    `role`              ENUM('EMPLOYEE', 'MANAGER') NOT NULL DEFAULT 'EMPLOYEE'
);
INSERT INTO `user`  (full_name, email, `password`, exp_in_year, project_id, `role`)
VALUES              ('Le', 'Le.nv@gmail.com', 'root', 5,1, 'MANAGER');
INSERT INTO `user`  (full_name, email,  project_id)
VALUES              ('Linh', 'Linh.nv@gmail.com', 2);
