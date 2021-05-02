package ingjulianvega.ximic.msscasubodycheck.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BodyCheckEntity extends BaseEntity {

    private UUID visitId;
    private UUID bodyPartId;
    private String observations;
}
