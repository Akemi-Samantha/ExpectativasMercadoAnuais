package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.exceptions;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
public class ResponseExceptionDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private int status;
    private String details;
    private String developerMessage;
    private LocalDateTime timestamp;
}
