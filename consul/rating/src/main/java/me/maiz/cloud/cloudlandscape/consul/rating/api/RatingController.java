package me.maiz.cloud.cloudlandscape.consul.rating.api;

import lombok.extern.slf4j.Slf4j;
import me.maiz.cloud.cloudlandscape.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RatingController {
    @Autowired
    Environment environment;

    @RequestMapping("rating/{movieName}")
    public Result rate(@PathVariable("movieName")String movieName){
        log.info("调用评分服务：{}",movieName);
        return Result.success(environment.getProperty("local.server.port"));
    }
}
