package com.cengo.muzayedebackend.controller.contract;

import com.cengo.muzayedebackend.dto.ArtistDTO;
import com.cengo.muzayedebackend.request.ArtistSaveRequest;

import java.util.List;

public interface ArtistControllerContract {
    ArtistDTO saveArtist(ArtistSaveRequest artistSaveRequest);
    List<ArtistDTO> getAllArtists();
    ArtistDTO getArtistById(Long id);
    void deleteArtist(Long id);
}
