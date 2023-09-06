package fun.zhaotong.flower.config;

import fun.zhaotong.flower.dao.FlowerDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "fun.zhaotong.flower.service")
public class FlowerConfig {

    @Bean  // 通过该注解来表明是一个Bean对象，相当于xml中的<bean>
    public FlowerDAO getFlowerDAO() {
        return new FlowerDAO();
    }
}
