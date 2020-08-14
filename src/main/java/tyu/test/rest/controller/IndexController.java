package tyu.test.rest.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {return "Hello from IndexController";}

    @PostMapping("/echo")
    @ResponseBody
    public String echo(HttpEntity<String> httpEntity){
//        System.out.println(httpEntity.getBody());
        Logger logger = LoggerFactory.getLogger(IndexController.class);
        logger.info("Receive post" + httpEntity.getBody());
        return httpEntity.getBody();
    }
}
