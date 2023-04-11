package com.movieExample.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
    //Optional<Movie> findMovieByImdbId(String imdbId);
}
