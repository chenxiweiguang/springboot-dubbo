1.zookeeper官网的下载*.tar.gz只是源代码，而-bin.tar.gz才包含编译后的二进制文件

2.把 zoo_sample.cfg 文件复制一份改名为 zoo.cfg

3.双击 zkServer.cmd，发现dos框一闪而过，无法正确启动zookeeper，在末尾输入pause ，保存退出

4.如果本地zk的地址为192.168.0.1端口为默认端口2181。
进入bin，sh zkCli.sh -server 192.168.0.1:2181
ls /dubbo 查看到许多服务其中有com.app.interface
ls /dubbo/com.app.interface/consuemrs 查看注册的消费者
ls /dubbo/com.app.interface/providers 查看注册的生产者
本地windows的zk bin目录有个zkCli.cmd双击进入，上述ls同样适用
[zk: localhost:2181(CONNECTED) 0] ls /
[dubbo, services, zookeeper]
[zk: localhost:2181(CONNECTED) 1] ls /dubbo
[com.test.service.CityDubboService, config, mapping, metadata, org.apache.dubbo.metadata.MetadataService]

5.整合dubbo参考https://cn.dubbo.apache.org/zh-cn/overview/quickstart/java/spring-boot/
https://www.w3cschool.cn/springboot/springboot-37z424l7.html

