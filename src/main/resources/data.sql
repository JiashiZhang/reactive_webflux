# -- 创建数据库（如果不存在）
# # CREATE DATABASE IF NOT EXISTS testdb;
#
# -- 使用数据库
# USE testdb;
#
# -- 创建表
# CREATE TABLE IF NOT EXISTS users (
#                                      id INT AUTO_INCREMENT PRIMARY KEY,    -- 主键，自增
#                                      name VARCHAR(50) NOT NULL,            -- 用户名
#     email VARCHAR(100) UNIQUE NOT NULL,   -- 邮箱（唯一）
#     age INT NOT NULL,                     -- 年龄
#     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP -- 创建时间
#     );
#
# -- 初始化数据
# INSERT INTO users (name, email, age) VALUES
#                                          ('John Doe', 'john.doe@example.com', 30),
#                                          ('Jane Smith', 'jane.smith@example.com', 25),
#                                          ('Alice Johnson', 'alice.johnson@example.com', 35);
