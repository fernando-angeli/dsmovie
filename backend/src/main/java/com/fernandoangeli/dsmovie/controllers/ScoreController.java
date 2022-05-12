package com.fernandoangeli.dsmovie.controllers;

import com.fernandoangeli.dsmovie.dto.MovieDTO;
import com.fernandoangeli.dsmovie.dto.ScoreDTO;
import com.fernandoangeli.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping()
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){
        MovieDTO movieDTO = scoreService.saveScore(dto);
        return movieDTO;
    }

}
