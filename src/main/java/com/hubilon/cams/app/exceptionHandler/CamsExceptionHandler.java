package com.hubilon.cams.app.exceptionHandler;

import com.hubilon.cams.app.exception.BusinessRuleViolationException;
import com.hubilon.cams.app.exception.FieldValidationException;
import com.hubilon.cams.app.exception.NoResourcesException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CamsExceptionHandler {
    @ExceptionHandler
    public ModelAndView handelNotFoundException(Exception ex){
        ModelAndView modelAndView = new ModelAndView();
        if (ex instanceof BusinessRuleViolationException) {
            modelAndView.addObject("message", ex.getMessage());
            modelAndView.setViewName("error");
        } else if (ex instanceof FieldValidationException) {
            modelAndView.addObject("message", ex.getMessage());
            modelAndView.setViewName("error");
        } else if (ex instanceof NoResourcesException) {
            modelAndView.addObject("message", ex.getMessage());
            modelAndView.setViewName("error");
        } else {
            modelAndView.addObject("message", "예기치 못한 에러가 발생했습니다.");
            modelAndView.setViewName("error");
            //responseEntity = new ResponseEntity(createErrorEntity(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return modelAndView;

    }

}
