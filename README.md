1该项目后期考虑做成分布式服务，欢迎大家一起学习，共勉。

项目说明:该项目主要做了后台管理系统。对接了聚合数据的天气预报，万年历，星座运势，周公解梦，笑话大全，股票数据等多个接口。采用Aspect切面技术保存系统操作日志。集成FTP实现文件上传下载。Swagger文档提供api管理。<br/>
前端技术：bootstarp+jquery+framaker模板<br/>
后端技术：springboot+Mybatis+（redis+Cache）缓存+shiro权限控制<br/>
数据库：mysql <br/>

功能结构:<br/>
>系统管理<br/>
>>用户管理<br/>
>>角色管理<br/>
>>菜单管理<br/>
>>部门管理<br/>

>基础数据管理<br/>
>>数据字典管理<br/>
>>定时器管理<br/>

>系统监控<br/>
>>服务监控<br/>
>>系统日志<br/>
>>API监控<br/>

>文件管理<br/>
>>文件列表<br/>

部署说明：<br/>
一. 环境要求<br/>
mysql 5.7，JDK8，Maven，FTP，redis
<br/>
二. 操作步骤<br/>
1.下载项目到本地后，查看application.properties（spring.profiles.active=test，其中test对应的表示application-test.properties映射文件），application-dev.properties（本地开发库），application-test.properties(线上测试库)文件，修改对应配置。<br/>
2.数据库初始数据见目录doc/sql/product.sql<br/>
3.运行StartApplication启动类。<br/>
4.注：若需要redis，则需本地运行redis,对应修改application.properties文件中的redis配置，另外将spring.redis.isopen=false设置为true.<br/>
5.访问地址为 http://localhost:9009/  
<br/>
系统管理员角色：sys_admin(123456)<br/>      
超级管理员角色：admin(123456)<br/>
普通用户自己登录页注册即可
<br/>
FTP服务器部署:<br/>
参考前辈经验：https://www.cnblogs.com/popfisher/p/7992036.html
<br/>
三. 测试地址<br/>
http://47.112.26.69:9009/   <br/>
sys_admin(123456) <br/>
**演示效果图：**
<br/>
1.首页
![首页](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/index.png)
<br/>
2.系统管理---用户管理
![用户管理](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/0.png)
<br/>
3.系统管理---角色管理
![角色管理](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/1.png)
<br/>
4.系统管理---部门管理
![部门管理](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/2.png)
<br/>
5.系统管理---部门管理---分配用户
![分配用户](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/21.png)
<br/>
6.系统管理---菜单管理
![菜单管理](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/8.jpg)
<br/>
7.系统管理---菜单管理---编辑菜单
![编辑菜单](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/81.jpg)
<br/>
8.基础数据管理---数据字典管理
![数据字典管理](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/6.jpg)
<br/>
9.基础数据管理---定时任务管理
![定时任务管理](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/7.jpg)
<br/>
10.系统监控---服务监控
![服务监控](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/server.png)
<br/>
11.系统监控---系统日志
![系统日志](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/log.png)
<br/>
12.系统监控---API管理
![API管理](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/swagger.png)
<br/>
13.文件管理---文件列表
![文件列表](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/文件列表.png)
<br/>
14.文件管理---文件上传
![文件上传](https://gitee.com/qinjianping/springboot0601/raw/master/doc_img/文件上传.png)
<br/>

部署文档<br>
# 部署
1. 停止应用<br>

# 命令，查询pid
ps aux |grep 9009<br>

# 找到对应的pid，然后kill掉
kill -9 xxx<br>

# 例子
[root@cqydtest web]# ps aux |grep 9009<br>
root     22277  2.9 14.5 5170228 1193768 pts/1 Sl   15:27   2:02 java -jar springboot0601-0.0.1-SNAPSHOT.jar<br>
root     22537  0.0  0.0 103268   856 pts/1    S+   16:36   0:00 grep 9091<br>
[root@cqydtest web]# kill -9 22277<br>

2. 启动应用<br>
# 命令
nohup java -jar springboot0601-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod --server.port=9009 &<br>
