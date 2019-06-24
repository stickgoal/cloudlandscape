package me.maiz.cloud.cloudlandscape.consumer.web;

import me.maiz.cloud.cloudlandscape.common.Result;
import me.maiz.cloud.cloudlandscape.consumer.integration.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SomeController1 {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HelloService helloService;


    @RequestMapping("doInvoke")
    public Result doInvoke(String name){
        return restTemplate.getForObject("http://eureka-client/say?name="+name,Result.class);
    }


    @RequestMapping("doInvokeFegin")
    public Result doInvokeByFeign(String name){
        return helloService.say(name);
    }
}
