package com.paperwork.config.props;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by yuwhuawang on 17/7/4.
 */
@ConfigurationProperties(prefix = "mongodb")
public class MultipleMongoProperties {
    private MongoProperties account = new MongoProperties();
    private MongoProperties math= new MongoProperties();

    @Override
    public String toString() {
        return "MultipleMongoProperties{" +
                "account=" + account +
                ", math=" + math +
                '}';
    }

    public MongoProperties getAccount() {
        return account;
    }

    public void setAccount(MongoProperties account) {
        this.account = account;
    }

    public MongoProperties getMath() {
        return math;
    }

    public void setMath(MongoProperties math) {
        this.math = math;
    }
}
