CREATE SCHEMA hardware;
CREATE TABLE hardware.items (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    category VARCHAR(50) NOT NULL,
    manufacturer VARCHAR(100) NOT NULL,
    stock INT NOT NULL
);
CREATE TABLE hardware.customers (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
   customer_name VARCHAR(50) NOT NULL,
   mobile_number int 
  
);