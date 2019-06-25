package me.maiz.cloud.cloudlandscape.consul.apigateway.web;

import me.maiz.cloud.cloudlandscape.common.Result;
import me.maiz.cloud.cloudlandscape.consul.apigateway.integration.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @RequestMapping("r")
    public Result doRating(String name) {
        final Result result = ratingService.rate(name);
        return result;
    }

}
