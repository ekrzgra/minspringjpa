# minspringjpa
repository that contains minimum spring project integrated with jpa with example

It uses mysql db with development setup:
username: minspringjpa
password: minspringjpa
db_name: minspringjpa

to start with docker can be used with the following container:
docker run --name mysql-minspringjpa -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=minspringjpa -e MYSQL_USER=minspringjpa -e MYSQL_PASSWORD=minspringjpa -p 3306:3306 -d mysql:5.7 