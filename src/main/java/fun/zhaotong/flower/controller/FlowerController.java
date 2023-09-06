package fun.zhaotong.flower.controller;

import fun.zhaotong.flower.config.FlowerConfig;
import fun.zhaotong.flower.dao.Flower;
import fun.zhaotong.flower.service.FlowerService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class FlowerController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello world!";
    }

    @RequestMapping("flowers")
    public String getFlowers() {
        String results = "";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FlowerConfig.class);
        FlowerService flowerService = context.getBean(FlowerService.class);

        List<Flower> flowers = flowerService.queryFlowerList();
        for (Flower flower: flowers) {
            results += flower.getName() + flower.getRemark();
            System.out.println();
        }
        context.destroy();
        return results;

    }
}
