ALTER TABLE user
    ADD address varchar(255) DEFAULT NULL,
    ADD created_at datetime DEFAULT CURRENT_TIMESTAMP,
    ADD updated_at datetime DEFAULT NULL,
    ADD deleted_at datetime DEFAULT NULL;
