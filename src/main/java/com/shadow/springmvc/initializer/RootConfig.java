package com.shadow.springmvc.initializer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by yanqp on 2017/3/31.
 */
@Configuration
@ComponentScan(basePackages = {"com.shadow.springmvc"},
    excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {

}
