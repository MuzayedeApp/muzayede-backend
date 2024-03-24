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

    @PostMapping("/add")
    public void addArtist(@RequestBody addArtistRequest artistInfo) {
        artistService.addArtist(artistInfo);
    }

    @PostMapping("/delete")
    public void deleteArtist(@RequestBody Long id) {
        artistService.deleteArtist(id);
    }

    @GetMapping("/get-artists")
    public List<Artist> getArtists() {
        return artistService.getArtists();
    }
}
