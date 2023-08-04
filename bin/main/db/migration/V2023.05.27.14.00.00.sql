DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`         int          NOT NULL AUTO_INCREMENT
    ,`first_name` varchar(255) NOT NULL
    ,`last_name`  varchar(255) NOT NULL
    ,`account`  varchar(255) NOT NULL
    ,`phone`  varchar(255) NULL
    ,`gender`  integer (1) NULL
    ,PRIMARY KEY (`id`)
);