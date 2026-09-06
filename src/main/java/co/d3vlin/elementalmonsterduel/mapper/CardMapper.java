package co.d3vlin.elementalmonsterduel.mapper;

import co.d3vlin.elementalmonsterduel.dto.CardDTO;
import co.d3vlin.elementalmonsterduel.entity.CardEntity;
import co.d3vlin.elementalmonsterduel.enums.Element;
import co.d3vlin.elementalmonsterduel.enums.Group;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CardMapper {
    @Mapping(target = "elementGroup", source = "element")
    CardDTO fromEntity(CardEntity cardEntity);

    CardEntity fromDTO(CardDTO cardDTO);

    default Group elementGroup(Element element) {
        return element == null ? null : element.group();
    }
}
