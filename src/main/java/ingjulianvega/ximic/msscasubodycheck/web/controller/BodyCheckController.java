package ingjulianvega.ximic.msscasubodycheck.web.controller;


import ingjulianvega.ximic.msscasubodycheck.services.BodyCheckService;
import ingjulianvega.ximic.msscasubodycheck.web.model.BodyCheck;
import ingjulianvega.ximic.msscasubodycheck.web.model.BodyCheckDto;
import ingjulianvega.ximic.msscasubodycheck.web.model.BodyCheckList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class BodyCheckController implements BodyCheckI {

    private final BodyCheckService bodyCheckService;

    @Override
    public ResponseEntity<BodyCheckList> get() {
        return new ResponseEntity<>(bodyCheckService.get(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BodyCheckDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(bodyCheckService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BodyCheckList> getByVisittId(UUID visitId) {
        return new ResponseEntity<>(bodyCheckService.getByVisitId(visitId), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid BodyCheck bodyCheck) {
        bodyCheckService.create(bodyCheck);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid BodyCheck bodyCheck) {
        bodyCheckService.updateById(id, bodyCheck);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        bodyCheckService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
