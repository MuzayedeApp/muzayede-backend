package com.cengo.muzayedebackend.mapper;

import com.cengo.muzayedebackend.dto.ArtistDTO;
import com.cengo.muzayedebackend.model.Artist;
import com.cengo.muzayedebackend.request.ArtistSaveRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ArtistMapper {
    ArtistMapper INSTANCE = Mappers.getMapper(ArtistMapper.class);

    @Mapping(target = "fullName", source = "request.fullName")
    @Mapping(target = "info", source = "request.info")
    Artist convertToArtist(ArtistSaveRequest request);

    @Mapping(target = "fullName", source = "artist.fullName")
    @Mapping(target = "info", source = "artist.info")
    ArtistDTO convertToArtistDTO(Artist artist);

    List<ArtistDTO> convertToArtistDTOs(List<Artist> artists);
}
