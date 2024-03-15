CREATE SCHEMA hardware;
CREATE TABLE hardware.items (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    category VARCHAR(50) NOT NULL,
    manufacturer VARCHAR(100) NOT NULL,
    stock INT NOT NULL
);
CREATE TABLE hardware.customers (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255),
    mobileNo VARCHAR(15)
);
CREATE TABLE `hardware`.`login` (
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`username`));
