package ingjulianvega.ximic.msscasubodycheck.web.Mappers;


import ingjulianvega.ximic.msscasubodycheck.domain.BodyCheckEntity;
import ingjulianvega.ximic.msscasubodycheck.web.model.BodyCheckDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface BodyCheckMapper {
    BodyCheckDto bodyCheckEntityToBodyCheckDto(BodyCheckEntity bodyCheckEntity);

    BodyCheckEntity bodyCheckDtoToBodyCheckEntity(BodyCheckDto bodyCheckDto);

    ArrayList<BodyCheckDto> bodyCheckEntityListToBodyCheckDtoList(List<BodyCheckEntity> bodyCheckEntityList);
}
