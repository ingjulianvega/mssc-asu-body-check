package ingjulianvega.ximic.msscasubodycheck.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BodyCheckList implements Serializable {

    static final long serialVersionUID = 7833010278870371579L;

    public ArrayList<BodyCheckDto> bodyCheckDtoList;
}
