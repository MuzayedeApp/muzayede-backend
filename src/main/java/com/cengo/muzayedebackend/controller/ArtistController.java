package com.cengo.muzayedebackend.controller;

import com.cengo.muzayedebackend.dto.addArtistRequest;
import com.cengo.muzayedebackend.model.Artist;
import com.cengo.muzayedebackend.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/artist")
public class ArtistController {
    private final ArtistService artistService;

    @PostMapping("/")
    public void addArtist(@RequestBody addArtistRequest artistInfo) {
        artistService.addArtist(artistInfo);
    }

    @DeleteMapping("/")
    public void deleteArtist(@RequestBody Long id) {
        artistService.deleteArtist(id);
    }

    @GetMapping("/")
    public List<Artist> getArtists() {
        return artistService.getArtists();
    }
    @GetMapping("/{id}")
    public Artist getArtist(@PathVariable(name = "id") Long id) {
        return artistService.getArtist(id);
    }
}
