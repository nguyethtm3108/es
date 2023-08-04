CREATE TABLE IF NOT EXISTS `service`
(
    `id`         BIGINT  NOT NULL AUTO_INCREMENT,
    `user_id`    integer null,
    `service_id` integer null,
    `status`     integer     DEFAULT 0,
    `created_at` DATETIME    DEFAULT CURRENT_TIMESTAMP,
    `created_by` VARCHAR(36) DEFAULT NULL,
    `updated_at` DATETIME    DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
    `updated_by` VARCHAR(36) DEFAULT NULL,
    PRIMARY KEY (`id`)
);