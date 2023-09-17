package com.rick.eruekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 可以打包成不同端口在外面使用，构成微服务
 */

@SpringBootApplication
public class Cloud01EruekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cloud01EruekaProviderApplication.class, args);
	}

}
