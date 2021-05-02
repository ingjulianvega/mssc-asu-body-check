package ingjulianvega.ximic.msscasubodycheck.services;


import ingjulianvega.ximic.msscasubodycheck.web.model.BodyCheck;
import ingjulianvega.ximic.msscasubodycheck.web.model.BodyCheckDto;
import ingjulianvega.ximic.msscasubodycheck.web.model.BodyCheckList;

import java.util.UUID;

public interface BodyCheckService {
    BodyCheckList get();

    BodyCheckDto getById(UUID id);

    BodyCheckList getByVisitId(UUID patientId);

    void create(BodyCheck bodyCheck);

    void updateById(UUID id, BodyCheck bodyCheck);

    void deleteById(UUID id);


}
