package am.kanachsnund.kanachsnund.controller.advice;

import am.kanachsnund.kanachsnund.Exception.EntityNotFoundException;
import am.kanachsnund.kanachsnund.Exception.FileNotExistException;
import am.kanachsnund.kanachsnund.Exception.UserNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {
            EntityNotFoundException.class,
            FileNotExistException.class,
            UserNotFoundException.class,
            RuntimeException.class,
            Exception.class
    })
    public String handleEntityNotFoundException() {
        return "view/404";
    }
}
