# nacos-simple
一个nacos注册中心和配置中心的示例


## 需要一个nacos  
建议使用 docker-compose 
下载nacos-docker 的 dockerfile  找到examples 目录下的 standalone-mysql.yaml文件
执行docker-compose -f standalone-mysql.yaml up -d  命令

可能第一次执行或者重启后会出现 nacos打不开的情况 可以down掉  重启一下 就ok
默认端口  ip:8848/nacos  用户名 nacos 密码 nacos  将confbak中 配置写入nacos中即可
