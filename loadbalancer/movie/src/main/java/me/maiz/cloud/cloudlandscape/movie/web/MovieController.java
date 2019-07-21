package me.maiz.cloud.cloudlandscape.movie.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MovieController {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("listReviewsOfMovie")
    public List listReviews(int movieId){

        final List reviews = restTemplate.getForObject("http://review/getReviewOfMovie?movieId="+movieId, List.class);

        return reviews;
    }

}
