# MYSQL 初始化
+ 使用brew 安装MySQL
```shell script
brew install mysql
```

+ 启动MySQL 
```shell script
mysql.server start 
```
+ 登陆MySQL
```shell script
mysql -uroot
# 第一次登陆无需密码
```
+ 初始化MySQL的用户名密码
```shell script
mysql_secure_installation
# 根据提示设置密码
```
