package co.d3vlin.elementalmonsterduel.mapper;

import co.d3vlin.elementalmonsterduel.dto.WhatsNewEntryDTO;
import co.d3vlin.elementalmonsterduel.entity.WhatsNewEntryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface WhatsNewEntryMapper {
    WhatsNewEntryDTO fromEntity(WhatsNewEntryEntity entity);
}
