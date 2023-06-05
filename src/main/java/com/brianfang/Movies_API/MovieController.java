package com.brianfang.Movies_API;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/movie")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;
    
    @GetMapping("/all")
    public @ResponseBody Iterable<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/tconst/{tconst}")
    @ResponseBody
    public Optional<Movie> getMovie(@PathVariable("tconst")String tconst) {
        return movieRepository.findById(tconst);
    }
    
}
