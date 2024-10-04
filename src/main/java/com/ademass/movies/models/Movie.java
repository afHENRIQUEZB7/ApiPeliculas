package com.ademass.movies.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movies")
    private Long idMovie;
    private String title;
    private String description;
    private Integer year;
    private Integer votes;
    private Double rating;
    @Column(name = "image_url")
    private String imageUrl;
    
    
}
