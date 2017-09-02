package com.smartbean.controller.resume;

import com.smartbean.service.ResumeDetailService;
import com.smartbean.service.ResumeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by qingfeilee on 2015/4/18.
 */
@Controller
@RequestMapping("/resume")
public class ResumeController {
    Logger logger = LoggerFactory.getLogger(ResumeController.class);

    @Autowired
    ResumeService resumeService;

    @Autowired
    ResumeDetailService resumeDetailService;

}
