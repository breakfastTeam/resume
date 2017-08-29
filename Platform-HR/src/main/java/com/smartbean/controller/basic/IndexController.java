package com.smartbean.controller.basic;

import com.smartbean.entity.SysDynamic;
import com.smartbean.entity.SysResumeCount;
import com.smartbean.fastjson.JsonResult;
import com.smartbean.service.DynamicService;
import com.smartbean.service.ResumeCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by felix on 8/27/17.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    private DynamicService dynamicService;

    @Autowired
    private ResumeCountService resumeCountService;

    @RequestMapping(value = {"/", "/index"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        List<SysDynamic> sysDynamics = dynamicService.getRecentDynamics();

        SysResumeCount resumeCount = resumeCountService.getResumeTotalCount();

        mv.addObject("dynamics", sysDynamics);
        mv.addObject("resumeCount", resumeCount);
        mv.setViewName("index");
        return mv;
    }

}
