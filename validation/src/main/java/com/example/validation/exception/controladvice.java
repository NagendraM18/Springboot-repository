package com.example.validation.exception;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@ControllerAdvice
public class controladvice
{
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> invalid(MethodArgumentNotValidException e)
    {
        Map<String,String> errormessage=new HashMap<>();
        List<FieldError> error=e.getBindingResult().getFieldErrors();
        for(FieldError er:error){
            String fields=er.getField();
            String message=er.getDefaultMessage();
            errormessage.put(fields,message);
        }
        return errormessage;

    }
}
