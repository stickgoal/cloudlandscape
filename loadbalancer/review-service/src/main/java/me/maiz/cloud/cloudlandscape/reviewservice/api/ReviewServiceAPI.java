package me.maiz.cloud.cloudlandscape.reviewservice.api;

import lombok.extern.slf4j.Slf4j;
import me.maiz.cloud.cloudlandscape.reviewservice.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class ReviewServiceAPI {

    @Autowired
    private Environment environment;


    @RequestMapping("getReviewOfMovie")
    public List<Review> getReviewsOfMovie(int movieId){
        log.info("收到请求：{}",movieId);
        //模拟数据
        List<Review> reviews = new ArrayList<>();
        reviews.add(new Review(1,movieId,"端口："+environment.getProperty("local.server.port"),"真男人！！！",1,"王二"));
        reviews.add(new Review(1,movieId,"肖申克的救赎","真男人！！！",1,"王二"));
        reviews.add(new Review(1,movieId,"肖申克的救赎","帅呆了",2,"张三"));
        reviews.add(new Review(1,movieId,"肖申克的救赎","敲喜欢",2,"张三"));
        reviews.add(new Review(1,movieId,"肖申克的救赎","男人必看的电影",3,"李四"));
        return reviews;
    }



}
