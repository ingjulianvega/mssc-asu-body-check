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
public class BodyCheck implements Serializable {

    static final long serialVersionUID = -8125266865453086623L;

    private UUID visitId;
    private UUID bodyPartId;
    private String observations;

}
