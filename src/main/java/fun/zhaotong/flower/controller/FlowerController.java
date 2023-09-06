package fun.zhaotong.flower.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class FlowerController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello world!";
    }
}
