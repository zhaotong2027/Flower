package fun.zhaotong.flower.config;

import com.jolbox.bonecp.BoneCPDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.sql.SQLException;

@Configuration
//@ComponentScan(basePackages = "fun.zhaotong.server")
@PropertySource(value = {"classpath:jdbc.properties", "xxx"}, ignoreResourceNotFound = true)
public class SpringConfig {
    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean(destroyMethod = "close")
    public BoneCPDataSource getBoneCPDataSource() throws SQLException {
        BoneCPDataSource boneCPDataSource = new BoneCPDataSource();
        boneCPDataSource.setDriverClass(driverClassName);
        boneCPDataSource.setJdbcUrl(url);
        boneCPDataSource.setUsername(username);
        boneCPDataSource.setPassword(password);
        System.out.println(boneCPDataSource);
        return boneCPDataSource;
    }
}
