package com.swo.cosmos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AzureCosmosdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureCosmosdbApplication.class, args);
    }
}
