package ingjulianvega.ximic.msscasubodycheck.domain.repositories;

import ingjulianvega.ximic.msscasubodycheck.domain.BodyCheckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.UUID;

public interface BodyCheckRepository extends JpaRepository<BodyCheckEntity, UUID>, JpaSpecificationExecutor<BodyCheckEntity> {
    List<BodyCheckEntity> findByVisitId(UUID visitId);
}
