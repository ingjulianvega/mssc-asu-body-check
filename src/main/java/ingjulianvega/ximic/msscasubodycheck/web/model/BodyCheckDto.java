package ingjulianvega.ximic.msscasubodycheck.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BodyCheckDto implements Serializable {

    static final long serialVersionUID = 961684447057864220L;

    private UUID id;
    private UUID visitId;
    private UUID bodyPartId;
    private String observations;

}
