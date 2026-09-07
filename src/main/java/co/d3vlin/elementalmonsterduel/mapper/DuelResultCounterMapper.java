package co.d3vlin.elementalmonsterduel.mapper;

import co.d3vlin.elementalmonsterduel.dto.DuelResultCounterDTO;
import co.d3vlin.elementalmonsterduel.entity.DuelResultCounterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DuelResultCounterMapper {

    DuelResultCounterDTO fromEntity(DuelResultCounterEntity duelResultCounterEntity);

    DuelResultCounterEntity fromDTO(DuelResultCounterDTO duelResultCounterDTO);
}
