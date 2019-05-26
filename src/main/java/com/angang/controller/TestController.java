package com.angang.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@Api(description = "测试controller")
@RestController
public class TestController {


//    @ApiOperation(value = "测试方法", notes = "测试犯法")
    @RequestMapping(value = "/test",method = {RequestMethod.GET,RequestMethod.POST})
    public Map<String, Object> testMethod(@RequestBody(required = false) String ss ){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result","success");
        return resultMap;
    }
}
