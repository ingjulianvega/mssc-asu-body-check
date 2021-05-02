package ingjulianvega.ximic.msscasubodycheck.web.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiError {

    private String code;
    private String description;
}
