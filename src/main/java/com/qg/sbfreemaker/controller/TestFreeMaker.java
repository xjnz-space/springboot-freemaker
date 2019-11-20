package com.qg.sbfreemaker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestFreeMaker {
    /**
     * javax.servlet.ServletException: Circular view path [test]
     * 请求路劲不能和返回参数相同
     * @return
     */
    @RequestMapping("/sbftl")
    public ModelAndView test(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("test");
        mav.addObject("test","testFreeMaker");
        return mav;
    }
    //测试修改文件提交到git
}
