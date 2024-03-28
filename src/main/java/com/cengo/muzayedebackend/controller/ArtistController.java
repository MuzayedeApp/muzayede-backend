package com.cengo.muzayedebackend.controller;

import com.cengo.muzayedebackend.controller.contract.ArtistControllerContract;
import com.cengo.muzayedebackend.dto.ArtistDTO;
import com.cengo.muzayedebackend.request.ArtistSaveRequest;
import com.cengo.muzayedebackend.response.RestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/artists")
public class ArtistController {
    private final ArtistControllerContract artistControllerContract;

    public ArtistController(ArtistControllerContract artistControllerContract){
        this.artistControllerContract = artistControllerContract;
    }

    @GetMapping
    public ResponseEntity<RestResponse<List<ArtistDTO>>> findAll() {
        List<ArtistDTO> artists = artistControllerContract.getAllArtists();
        return ResponseEntity.ok(RestResponse.of(artists));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<ArtistDTO>> findById(@PathVariable Long id) {
        ArtistDTO artist = artistControllerContract.getArtistById(id);
        return ResponseEntity.ok(RestResponse.of(artist));
    }

    @PostMapping
    public ResponseEntity<RestResponse<ArtistDTO>> save(@RequestBody ArtistSaveRequest artistSaveRequest) {
        ArtistDTO artist = artistControllerContract.saveArtist(artistSaveRequest);
        return ResponseEntity.ok(RestResponse.of(artist));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<Object>> delete(@PathVariable Long id) {
        artistControllerContract.deleteArtist(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
}
