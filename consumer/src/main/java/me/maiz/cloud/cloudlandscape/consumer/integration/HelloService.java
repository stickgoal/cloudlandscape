package me.maiz.cloud.cloudlandscape.consumer.integration;

import me.maiz.cloud.cloudlandscape.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("EUREKA-CLIENT")
public interface HelloService {


    @RequestMapping("say")
    public Result say(@RequestParam("name") String name);

}
