package com.cengo.muzayedebackend.controller.contract.impl;

import com.cengo.muzayedebackend.controller.contract.ArtistControllerContract;
import com.cengo.muzayedebackend.dto.ArtistDTO;
import com.cengo.muzayedebackend.mapper.ArtistMapper;
import com.cengo.muzayedebackend.model.Artist;
import com.cengo.muzayedebackend.request.ArtistSaveRequest;
import com.cengo.muzayedebackend.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArtistControllerContractImpl implements ArtistControllerContract {
    private final ArtistService artistService;
    @Override
    public ArtistDTO saveArtist(ArtistSaveRequest artistSaveRequest) {
        Artist artist = ArtistMapper.INSTANCE.convertToArtist(artistSaveRequest);
        artist = artistService.save(artist);

        return ArtistMapper.INSTANCE.convertToArtistDTO(artist);
    }

    @Override
    public List<ArtistDTO> getAllArtists() {
        List<Artist> artistList = artistService.findAll();
        return ArtistMapper.INSTANCE.convertToArtistDTOs(artistList);

    }

    @Override
    public ArtistDTO getArtistById(Long id) {
        Artist artist = artistService.getById(id);
        return ArtistMapper.INSTANCE.convertToArtistDTO(artist);

    }

    @Override
    public void deleteArtist(Long id) {
        artistService.delete(id);
    }
}
