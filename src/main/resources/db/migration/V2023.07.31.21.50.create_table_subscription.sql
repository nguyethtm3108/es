CREATE TABLE IF NOT EXISTS `user_service`
(
    `id`         BIGINT  NOT NULL AUTO_INCREMENT
    ,`user_id`    integer null
    ,`service_id` integer null
    ,`status`     tinyint(1)     DEFAULT 0
    ,`quantity`     integer(1)     DEFAULT 1
    ,`created_at` DATETIME    DEFAULT CURRENT_TIMESTAMP
    ,`created_by` VARCHAR(36) DEFAULT NULL
    ,`updated_at` DATETIME    DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
    ,`updated_by` VARCHAR(36) DEFAULT NULL
    ,`approved_at` DATETIME    DEFAULT NULL
    ,`approved_by` VARCHAR(36) DEFAULT NULL
    ,`rejected_at` DATETIME    DEFAULT NULL
    ,`rejected_by` VARCHAR(36) DEFAULT NULL
    ,PRIMARY KEY (`id`)
);