package com.cengo.muzayedebackend.service;

import com.cengo.muzayedebackend.dto.addArtistRequest;
import com.cengo.muzayedebackend.model.Artist;
import com.cengo.muzayedebackend.repository.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtistService {
    private final ArtistRepository artistRepository;

    public void addArtist(addArtistRequest artistInfo) {
        Artist artist = new Artist();
        artist.setInfo(artistInfo.getInfo());
        artistRepository.save(artist);
    }

    public void deleteArtist(Long id) {
        artistRepository.deleteById(id);
    }

    public List<Artist> getArtists() {
        return artistRepository.findAll();
    }

}
