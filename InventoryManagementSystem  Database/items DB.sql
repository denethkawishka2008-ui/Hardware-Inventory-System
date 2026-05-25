-- 1. මුලින්ම inventory_db කියලා ඩේටාබේස් එකක් හදනවා
CREATE DATABASE IF NOT EXISTS `inventory_db`;


USE `inventory_db`;


-- 3. දැන් items කියන ටේබල් එක හදනවා (Selling Price එකත් එක්කම)
CREATE TABLE IF NOT EXISTS `items` (
  `item_code` VARCHAR(50) NOT NULL,
  `item_name` VARCHAR(100) NOT NULL,
  `category` VARCHAR(50) NOT NULL,
  `qty` INT NOT NULL DEFAULT 0,
  `price` DOUBLE NOT NULL DEFAULT 0.0,
  `selling_price` DOUBLE NOT NULL DEFAULT 0.0, -- 🌟 අලුතෙන් එකතු කල පේළිය
  PRIMARY KEY (`item_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- dthe inventory database primary key int change in varchar  now primarykey is It1001 
USE `inventory_db`;


ALTER TABLE `items` MODIFY `item_code` INT NOT NULL;


ALTER TABLE `items` DROP PRIMARY KEY;

ALTER TABLE `items` MODIFY `item_code` VARCHAR(10) NOT NULL, ADD PRIMARY KEY (`item_code`);


USE `inventory_db`;

ALTER TABLE items ADD COLUMN barcode VARCHAR(50) UNIQUE;