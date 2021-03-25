package web.prices.observatory.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)


public class NotAuthorized extends RuntimeException {

    public NotAuthorized() {super("401 - Not Authorized");}
}
