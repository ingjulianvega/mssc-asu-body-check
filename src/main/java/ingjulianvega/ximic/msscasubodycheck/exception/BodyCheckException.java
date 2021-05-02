package ingjulianvega.ximic.msscasubodycheck.exception;

import lombok.Getter;

@Getter
public class BodyCheckException extends RuntimeException {

    private final String code;

    public BodyCheckException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}

