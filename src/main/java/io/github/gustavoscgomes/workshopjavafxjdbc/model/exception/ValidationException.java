package io.github.gustavoscgomes.workshopjavafxjdbc.model.exception;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {

    private Map<String, String> errors = new HashMap<>();

    public ValidationException(String message) {
        super(message);
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void addErrors(String fieldName, String errorMessage) {
        errors.put(fieldName, errorMessage);
    }
}
