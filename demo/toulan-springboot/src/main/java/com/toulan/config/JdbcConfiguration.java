package com.toulan.config;



/**
 * @author loltoulan
 * @version 1.0.0
 * @time 2020/3/14 10:19
 * @message
 */
/*
@Configuration //声明一个类是一个Java配置类，相当于一个xml文件
public class JdbcConfiguration {

    @Bean
    public DataSource dataSource() {

        Properties properties = new Properties();

        InputStream is = JdbcConfiguration.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        */
/**
         * 我们知道在配置文件时代，我们想要将datasource注入到spring容器中时，
         * 我们也需要进行一系列的配置，如我们需要引入c3p0的的数据库连接池，
         * 我们需要导入c3p0相应的jar包，所以我们在类中也同样要进行相应的操作，
         * 这次，我们将使用德鲁伊的数据库连接池，此时我们需要在pom.xml中配置
         * 德鲁伊相关的依赖。
         *//*



        DruidDataSource dataSource = new DruidDataSource();
        //连接池驱动类
        dataSource.setDriverClassName((String) properties.get("jdbc.driverClassName"));
        //连接url
        dataSource.setUrl((String) properties.get("jdbc.url"));
        //数据库用户名
        dataSource.setUsername((String) properties.get("jdbc.username"));
        //数据库密码
        dataSource.setPassword((String) properties.get("jdbc.password"));

        return dataSource;
    }
}
*/
