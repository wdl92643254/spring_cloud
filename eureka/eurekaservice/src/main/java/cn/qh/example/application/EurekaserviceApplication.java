package cn.qh.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: wdl
 * @Date: 2019/11/25 22:59
 * @Version: V1.0
 * @描述：服务中心启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaserviceApplication.class, args);
    }

}
