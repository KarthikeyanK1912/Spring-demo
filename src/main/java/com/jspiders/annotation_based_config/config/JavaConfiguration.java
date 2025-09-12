package com.jspiders.annotation_based_config.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.jspiders.annotation_based_config")
@PropertySource("META-INF/config.properties")
public class JavaConfiguration
{  
	

}
