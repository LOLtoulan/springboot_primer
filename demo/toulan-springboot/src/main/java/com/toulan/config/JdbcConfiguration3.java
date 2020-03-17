package com.toulan.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author loltoulan
 * @version 1.0.0
 * @time 2020/3/14 17:53
 * @message
 */

@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration3 {

    //我们需要将我们的配置类注入到这里
    //方法一
 /*   @Autowired
    private JdbcProperties jdbcProperties;
    @Bean
    public DataSource dataSource() {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(this.jdbcProperties.getDriverClassName());
        dataSource.setUrl(this.jdbcProperties.getUrl());
        dataSource.setUsername(this.jdbcProperties.getUsername());
        dataSource.setPassword(this.jdbcProperties.getPassword());
        return dataSource;
    }*/

    //方法二
    /*private JdbcProperties jdbcProperties;

    public JdbcConfiguration3(JdbcProperties jdbcProperties) {
        this.jdbcProperties = jdbcProperties;
    }

    @Bean
    public DataSource dataSource() {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(this.jdbcProperties.getDriverClassName());
        dataSource.setUrl(this.jdbcProperties.getUrl());
        dataSource.setUsername(this.jdbcProperties.getUsername());
        dataSource.setPassword(this.jdbcProperties.getPassword());
        return dataSource;
    }
    */


    //方法三
    /*@Bean
    public DataSource dataSource(JdbcProperties jdbcProperties) {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());
        return dataSource;
    }*/

    //方法四
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {

        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
