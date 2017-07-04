package com.paperwork.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by yuwhuawang on 17/7/4.
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.paperwork.repositories.math",
                mongoTemplateRef = MathMongoConfig.MONGO_TEMPLATE)
public class MathMongoConfig {
    public static final String MONGO_TEMPLATE = "mathMongoTemplate";
}
