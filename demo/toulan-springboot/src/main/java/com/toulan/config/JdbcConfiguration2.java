package com.toulan.config;

/**
 * @author loltoulan
 * @version 1.0.0
 * @time 2020/3/14 11:02
 * @message jdbc连接池的配置类
 *
 * 这是spring方式将对象注入spring容器中
 * 这样写虽然我们的目的达到了，也就是我们将该类作为一个配置类，并且成功的把
 * 返回值datasource注入到spring中，但是，这样写的代码过于冗余，原因是，如果我们
 * 在其他的配置类中也想使用，我们就有需要重新写一遍相同的代码，不利于开发和维护。
 */
//声明一个类是Java配置类，相当于一个xml配置文件
/*@Configuration
//将配置文件加载到该类中
@PropertySource("classpath:db.properties")
public class JdbcConfiguration2 {

    *//**
     * 我们已经将配置文件加载到该类中了，
     * 我们需要对配置文件中的数据进行接收
     *//*
    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    //把方法的返回值注入到spring容器
    @Bean
    public DataSource dataSource() {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}*/
