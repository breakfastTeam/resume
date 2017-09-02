package com.smartbean.controller.resume;

import com.alibaba.fastjson.JSONObject;
import com.smartbean.entity.Resume;
import com.smartbean.entity.ResumeDetail;
import com.smartbean.entity.SysDynamic;
import com.smartbean.entity.SysResumeCount;
import com.smartbean.fastjson.FastJson;
import com.smartbean.fastjson.JsonResult;
import com.smartbean.service.ResumeDetailService;
import com.smartbean.service.ResumeService;
import com.smartbean.utils.StringUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by qingfeilee on 2015/4/18.
 */
@Controller
@RequestMapping("/resume")
public class ResumeController {
    Logger logger = LoggerFactory.getLogger(ResumeController.class);

    @Autowired
    ResumeDetailService resumeDetailService;






}
