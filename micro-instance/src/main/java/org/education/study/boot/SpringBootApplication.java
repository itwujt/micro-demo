package org.education.study.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <br>
 *
 * @author Best Wu
 * @date 2020/8/16 20:10 <br>
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableDiscoveryClient
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }
}
