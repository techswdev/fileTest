package com.example.filetest;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;


@Api(value = "MainController V1")
@Controller
public class MainController {

    @Autowired
    CustomerService customerService;

    @ApiOperation(value = "exam", notes = "예제입니다.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK !!"),
            @ApiResponse(code = 500, message = "Internal Server Error !!"),
            @ApiResponse(code = 404, message = "Not Found !!")
    })
    @GetMapping("/test")
    public String firstView(){
        System.out.println("출력완료");

        customerService.test11();
        return "test";
    }
}
