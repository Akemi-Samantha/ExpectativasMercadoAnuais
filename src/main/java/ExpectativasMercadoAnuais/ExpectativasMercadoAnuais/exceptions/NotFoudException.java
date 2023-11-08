package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoudException extends RuntimeException{
    public NotFoudException(String message) {
        super(message);
    }
}
