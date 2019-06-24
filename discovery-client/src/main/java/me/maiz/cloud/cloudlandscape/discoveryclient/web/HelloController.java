package me.maiz.cloud.cloudlandscape.discoveryclient.web;

import me.maiz.cloud.cloudlandscape.common.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/say")
    public Result say(String name){
        return Result.success("你好"+name);
    }


}
