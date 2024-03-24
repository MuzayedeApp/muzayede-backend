package com.cengo.muzayedebackend.repository;

import com.cengo.muzayedebackend.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArtistRepository extends JpaRepository<Artist, Long>
{
    Optional<Artist> findByInfo(String info);
    Optional<Artist> findById(Long id);
    void deleteById(Long id);
    List<Artist> findAll();

}
