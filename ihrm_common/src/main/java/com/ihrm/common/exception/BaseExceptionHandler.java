package com.ihrm.common.exception;

import com.ihrm.common.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: lsm
 * @description:
 * @create: 2019-11-07 23:19
 */
@ControllerAdvice
public class BaseExceptionHandler {

    @ResponseBody
    @ExceptionHandler
    public Result error(HttpServletRequest request, HttpServletResponse response,
                        Exception e) throws IOException {

        if (e.getClass() == CommonException.class) {
            CommonException ce = (CommonException) e;
            return new Result(ce.getCode());
        } else {
            return Result.ERROR();
        }

    }
}
