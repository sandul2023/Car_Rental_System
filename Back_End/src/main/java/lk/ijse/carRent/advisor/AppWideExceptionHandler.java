package lk.ijse.carRent.advisor;

import akka.http.scaladsl.model.HttpResponse;
import com.ubirch.util.http.response.ResponseUtil;
import com.ubirch.util.model.JsonErrorResponse;
import com.ubirch.util.model.JsonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler{
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({RuntimeException.class})
    public ResponseUtil handleRuntimeExceptions(RuntimeException e){
        System.out.println(e.getMessage());
        return new ResponseUtil() {
            @Override
            public HttpResponse response(String s) {
                return null;
            }

            @Override
            public HttpResponse response(JsonResponse jsonResponse) {
                return null;
            }

            @Override
            public HttpResponse requestErrorResponse(String s, String s1) {
                return null;
            }

            @Override
            public HttpResponse requestErrorResponse(JsonErrorResponse jsonErrorResponse) {
                return null;
            }

            @Override
            public HttpResponse serverErrorResponse(String s, String s1) {
                return null;
            }

            @Override
            public HttpResponse serverErrorResponse(JsonErrorResponse jsonErrorResponse) {
                return null;
            }
        };
    }
}
