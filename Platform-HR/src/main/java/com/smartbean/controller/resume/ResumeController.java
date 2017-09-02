package com.smartbean.controller.resume;

import com.smartbean.dtos.SearchParam;
import com.smartbean.entity.ResumeDetail;
import com.smartbean.service.ResumeDetailService;
import com.smartbean.utils.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by qingfeilee on 2015/4/18.
 */
@Controller
@RequestMapping("/resume")
public class ResumeController {
    Logger logger = LoggerFactory.getLogger(ResumeController.class);

    @Autowired
    private ResumeDetailService resumeDetailService;

    @RequestMapping("/create")
    @ResponseBody
    public JsonResult create(@ModelAttribute ResumeDetail resumeDetail) {
        ResumeDetail saved = resumeDetailService.save(resumeDetail);
        return JsonResult.success(saved.getId());
    }

    @RequestMapping("/search")
    @ResponseBody
    public JsonResult search(@ModelAttribute SearchParam searchParam) {
        List<ResumeDetail> queryResult = resumeDetailService.query(searchParam);
        return JsonResult.success(queryResult);
    }

}