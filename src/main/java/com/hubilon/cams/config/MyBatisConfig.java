package com.hubilon.cams.config;

import com.hubilon.cams.CamsApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackageClasses = CamsApplication.class)
public class MyBatisConfig {
}
