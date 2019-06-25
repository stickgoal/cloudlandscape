package me.maiz.cloud.cloudlandscape.consul.apigateway.integration;

import me.maiz.cloud.cloudlandscape.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("rating-service")
public interface RatingService {
    @RequestMapping("rating/{movieName}")
    public Result rate(@PathVariable("movieName")String movieName);
}
