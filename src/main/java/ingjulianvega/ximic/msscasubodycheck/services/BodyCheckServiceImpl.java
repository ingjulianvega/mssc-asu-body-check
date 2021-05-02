package ingjulianvega.ximic.msscasubodycheck.services;


import ingjulianvega.ximic.msscasubodycheck.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasubodycheck.domain.BodyCheckEntity;
import ingjulianvega.ximic.msscasubodycheck.domain.repositories.BodyCheckRepository;
import ingjulianvega.ximic.msscasubodycheck.exception.BodyCheckException;
import ingjulianvega.ximic.msscasubodycheck.web.Mappers.BodyCheckMapper;
import ingjulianvega.ximic.msscasubodycheck.web.model.BodyCheck;
import ingjulianvega.ximic.msscasubodycheck.web.model.BodyCheckDto;
import ingjulianvega.ximic.msscasubodycheck.web.model.BodyCheckList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class BodyCheckServiceImpl implements BodyCheckService {

    private final BodyCheckRepository bodyCheckRepository;
    private final BodyCheckMapper bodyCheckMapper;

    @Cacheable(cacheNames = "bodyCheckListCache")
    @Override
    public BodyCheckList get() {
        log.debug("get()...");
        return BodyCheckList
                .builder()
                .bodyCheckDtoList(bodyCheckMapper.bodyCheckEntityListToBodyCheckDtoList(bodyCheckRepository.findAll()))
                .build();
    }

    @Cacheable(cacheNames = "bodyCheckCache")
    @Override
    public BodyCheckDto getById(UUID id) {
        log.debug("getById()...");
        return bodyCheckMapper.bodyCheckEntityToBodyCheckDto(
                bodyCheckRepository.findById(id)
                        .orElseThrow(() -> new BodyCheckException(ErrorCodeMessages.BODY_CHECK_NOT_FOUND, "")));
    }

    @Override
    public BodyCheckList getByVisitId(UUID visitId) {
        log.debug("getByVisitId()...");
        return BodyCheckList
                .builder()
                .bodyCheckDtoList(bodyCheckMapper.bodyCheckEntityListToBodyCheckDtoList(bodyCheckRepository.findByVisitId(visitId)))
                .build();
    }

    @Override
    public void create(BodyCheck bodyCheck) {
        log.debug("create()...");
        bodyCheckMapper.bodyCheckEntityToBodyCheckDto(
                bodyCheckRepository.save(
                        bodyCheckMapper.bodyCheckDtoToBodyCheckEntity(
                                BodyCheckDto
                                        .builder()
                                        .visitId(bodyCheck.getVisitId())
                                        .bodyPartId(bodyCheck.getBodyPartId())
                                        .observations(bodyCheck.getObservations())
                                        .build())));
    }

    @Override
    public void updateById(UUID id, BodyCheck bodyCheck) {
        log.debug("updateById...");
        BodyCheckEntity bodyCheckEntity = bodyCheckRepository.findById(id)
                .orElseThrow(() -> new BodyCheckException(ErrorCodeMessages.BODY_CHECK_NOT_FOUND, ""));

        bodyCheckEntity.setVisitId(bodyCheck.getVisitId());
        bodyCheckEntity.setBodyPartId(bodyCheck.getBodyPartId());
        bodyCheckEntity.setObservations(bodyCheck.getObservations());

        bodyCheckRepository.save(bodyCheckEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        bodyCheckRepository.deleteById(id);
    }
}
