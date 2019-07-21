package me.maiz.cloud.cloudlandscape.reviewservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    private int reviewId;

    private int movieId;

    private String movieName;

    private String content;

    private int userId;

    private String username;




}
