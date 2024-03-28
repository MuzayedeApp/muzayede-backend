package com.cengo.muzayedebackend.service;

import com.cengo.muzayedebackend.model.Artist;
import com.cengo.muzayedebackend.repository.ArtistRepository;
import com.cengo.muzayedebackend.service.base.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends BaseEntityService<Artist, ArtistRepository> {
    protected ArtistService(ArtistRepository repository) {
        super(repository);
    }
}
