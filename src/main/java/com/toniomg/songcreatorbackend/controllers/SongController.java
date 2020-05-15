package com.toniomg.songcreatorbackend.controllers;

import com.toniomg.songcreatorbackend.model.Song;
import com.toniomg.songcreatorbackend.model.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {

    @Autowired
    SongRepository songRepository;

    @GetMapping("/songs")
    public Iterable<Song> getAllSongs() {
        return songRepository.findAll();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songRepository.save(song);
    }

}
