package com.ihrm.common.exception;

import com.ihrm.common.entity.ResultCode;
import lombok.Getter;

/**
 * @author: lsm
 * @description:
 * @create: 2019-11-07 23:18
 */
@Getter
public class CommonException extends RuntimeException {


    private ResultCode code = ResultCode.SERVER_ERROR;

    public CommonException() {
    }

    public CommonException(ResultCode resultCode) {
        super(resultCode.message());
        this.code = resultCode;
    }

}

