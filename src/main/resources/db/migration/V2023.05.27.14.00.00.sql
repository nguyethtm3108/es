CREATE TABLE IF NOT EXISTS `users`
(
    `id`         varchar(36)          NOT NULL
    ,username VARCHAR(255) NOT NULL
    ,password VARCHAR(255) NOT NULL
    ,email VARCHAR(255) NOT NULL UNIQUE
    ,address VARCHAR(255)
    ,PRIMARY KEY (`id`)
);