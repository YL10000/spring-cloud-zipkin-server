package com.beifeng.hadoop.spring.cloud.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

import zipkin.server.EnableZipkinServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableZipkinServer  //zipkin服务器 默认使用http进行通信
@EnableZipkinStreamServer //采用stream方式启动zipkin server ,也支持http通信 包含了@EnableZipkinServer,同时创建了rabbit-mq消息队列监听器
public class ZipkinServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApp.class, args);
    }
}
