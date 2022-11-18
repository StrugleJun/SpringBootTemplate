package cn.seem.springboottemplate.controller;

import cn.seem.springboottemplate.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @PostMapping("/hello")
    public Result detailHello(@RequestParam("name")String name){
        Result ok = Result.ok();
        ok.setData("key","value");
        return ok;
    }
}
