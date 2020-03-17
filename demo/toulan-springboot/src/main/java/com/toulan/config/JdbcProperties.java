package com.toulan.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author loltoulan
 * @version 1.0.0
 * @time 2020/3/14 16:21
 * @message
 *
 * 在spring官网，也就是 https://spring.io/projects/spring-boot 我们了解到
 * springboot项目是没有xml配置文件的，但是有一些配置我们还是要配置，所以spring官方
 * 就将springboot的配置文件命名为 application.properties 我们一般会将所有的配置项
 * 以 key=value 形式写到该文件中，springboot会将一些这写key=value形式的数据自动加载，
 * ConditionalOnProperty 注解就是加载application.properties 文件，并取出我们需要的配置
 * 但是，我们在这个配置文件中不可能只写一点的配置项，所以我们需要让系统认出我们需要那些值
 * 我们我们加上前缀，等到程序在application.properties时只取前缀一样的配置项，比如，系统加载该注解时，就会在配置文件
 * 会只取出以jdbc为前缀的配置项。
 * 该配置项和 Configuration 不同的时，Configuration时spring框架提供的，而 ConditionalOnProperty 是由springboot
 * 提供，将Configuration的功能进一步加强，
 *
 */
@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {

    /**
     * 我们需要注意的是，虽然我们不用写value注解，但是我们在此类中的属性名要和
     * 配置文件中 jdbc.driverClassName 的后缀一样，比如我们定义了一个
     * example.username = loltoulan
     * 我们在@ConditionalOnProperty(prefix = "example")注解中写的前缀是
     * 那么我们对应的属性名就必须为 username ，不可以为 name ，也不可以为 user，等其他的，
     * 否则系统无法识别并进行注入操作，且我们需要对属性名添加getter setter 方法，因为系统会自动调用
     * set方法，并进行赋值操作
     */
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
