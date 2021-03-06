package com.yywl.projectT.bean.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@EnableCaching
public class Config {

	@Bean(destroyMethod="close")
	@ConfigurationProperties(prefix = "db") // 在application.properties中注册keys.db前缀，可设置属性
	public DataSource dataSource()  {
		BasicDataSource db=new BasicDataSource();
		return db;
	}
}
