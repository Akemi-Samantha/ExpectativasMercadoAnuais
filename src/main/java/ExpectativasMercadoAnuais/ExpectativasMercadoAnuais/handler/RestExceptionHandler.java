package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.handler;

import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.exceptions.BadRequestException;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.exceptions.NotFoudException;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.exceptions.ResponseExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler {
    //Pode haver varios tipos de exceptions dentro desta classe...
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ResponseExceptionDetails> handlerBadRequestExceptionDetails(BadRequestException badRequestException){
       return new ResponseEntity<>(
               ResponseExceptionDetails.builder()
               .timestamp(LocalDateTime.now())
               .status(HttpStatus.BAD_REQUEST.value())
               .title("Bad Request Exception")
               .details(badRequestException.getMessage())
               .developerMessage(badRequestException.getClass().getName())
               .build(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(NotFoudException.class)
    public ResponseEntity<ResponseExceptionDetails> handlerRequestExceptionDetails(NotFoudException notFoudException){
        return new ResponseEntity<>(
                ResponseExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.NOT_FOUND.value())
                        .title("Not Found Exception")
                        .details(notFoudException.getMessage())
                        .developerMessage(notFoudException.getClass().getName())
                        .build(), HttpStatus.NOT_FOUND);
    }

}
