USE `inventory_db`;

ALTER TABLE `items` ADD `selling_price` DOUBLE NOT NULL DEFAULT 0.0 AFTER `price`;


USE `inventory_db`;

CREATE TABLE IF NOT EXISTS `suppliers` (
    `supplier_id` INT NOT NULL AUTO_INCREMENT,
    `company_name` VARCHAR(150) NOT NULL,
    `phone` VARCHAR(20) NOT NULL,
    `email` VARCHAR(100),
    PRIMARY KEY (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

USE `inventory_db`;


ALTER TABLE `suppliers` MODIFY `supplier_id` INT NOT NULL;


ALTER TABLE `suppliers` DROP PRIMARY KEY;

ALTER TABLE `suppliers` MODIFY `supplier_id` VARCHAR(10) NOT NULL, ADD PRIMARY KEY (`supplier_id`);

