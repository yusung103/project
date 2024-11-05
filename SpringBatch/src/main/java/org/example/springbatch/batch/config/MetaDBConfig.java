package org.example.springbatch.batch.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
public class MetaDBConfig {

    @Bean
    @Primary // DB 충돌방지
    @ConfigurationProperties(prefix = "spring.datasource-meta")
    public DataSource MetaDBSource() {

        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary // 충돌방지
    public PlatformTransactionManager metaTransactionManager() {

        return new DataSourceTransactionManager(MetaDBSource());
    }
}
