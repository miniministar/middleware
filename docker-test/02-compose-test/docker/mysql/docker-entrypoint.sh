#!/bin/bash
#-u为数据库用户名 -p为密码如果数据库密码不是root记得修改这里
mysql -uroot -proot <<EOF
source /usr/local/db-schema.sql;
source /usr/local/db-data.sql;