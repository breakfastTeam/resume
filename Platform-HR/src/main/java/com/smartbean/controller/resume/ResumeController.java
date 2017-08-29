package com.smartbean.controller.resume;

import com.alibaba.fastjson.JSONObject;
import com.smartbean.entity.Resume;
import com.smartbean.entity.ResumeDetail;
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
    ResumeService resumeService;

    @Autowired
    ResumeDetailService resumeDetailService;

    /**
     * 获取4S店下所有活动信息
     * **/
    @ResponseBody
    @RequestMapping(value="/findAll", method = RequestMethod.POST)
    public JsonResult findAll(@FastJson Resume resume, @RequestParam Integer pageNo){
        JsonResult jsonResult = new JsonResult();
        Pageable pageable = new PageRequest(pageNo-1, 100, new Sort(new Sort.Order(Sort.Direction.ASC, "createTime")));
        if(resume==null)
            resume=new Resume();
        Page<Resume> page = resumeService.find(resume, pageable);

        List<Resume> list = page.getContent();
//        List<Resume> list = resumeService.findAll(resume);
        String mobileTemp = "";
        List<ResumeDetail> resumeDetails = new ArrayList<>();
        for(Resume r : list){
            r.getResumeId();
            String content = r.getContent();
            int jsonHtmlIndex = content.indexOf("jsonHtml");
            int isInvitationIndex = content.indexOf("is_invitation");
            if(jsonHtmlIndex > -1) {
                String oldHtml = content.substring(jsonHtmlIndex + 11, isInvitationIndex - 3);
                String newHtml = StringUtils.stringToAscii(oldHtml);
                content = content.replace(oldHtml, newHtml);
            }

            jsonHtmlIndex = content.indexOf("evaluate");
            isInvitationIndex = content.indexOf("hunyin");
            String content2 = r.getContent();
//            System.out.println(r.getResumeId()+"    "+content2);
            if(jsonHtmlIndex > -1 && isInvitationIndex > -1) {
                try {
                    String oldHtml = content2.substring(jsonHtmlIndex + 11, isInvitationIndex - 3);
                    String newHtml = StringUtils.stringToAscii(oldHtml);
                    content = content.replace(oldHtml, newHtml);
                }catch (Exception e){
                    System.out.println("----------------");
                }
            }

            try {
                JSONObject object = JSONObject.parseObject(content);
                if(object.getString("errorCode").equals("1")){
                    JSONObject resumeHtml = object.getJSONObject("resumeHtml");
                    String name = resumeHtml.getString("name");
                    String mobile = resumeHtml.getString("mobile");
                    String email = resumeHtml.getString("email");
                    String address = resumeHtml.getString("address");
                    String age = resumeHtml.getString("age");
                    String experience = resumeHtml.getString("experience");
                    String experienceYear = resumeHtml.getString("experienceYear");
                    String birthday = resumeHtml.getString("birthday");
                    String residence = resumeHtml.getString("residence");
                    String universityName = resumeHtml.getString("universityName");
                    String lastCompany = resumeHtml.getString("last_company");
                    String universityTime = resumeHtml.getString("universityTime");
                    String lastCompanyPname = resumeHtml.getString("last_company_pname");
                    String lastCompanyTime = resumeHtml.getString("last_company_time");
                    String weixin = resumeHtml.getString("weixin");
                    String QQ = resumeHtml.getString("QQ");
                    String jobState = resumeHtml.getString("jobState");
                    String hopePosition = resumeHtml.getString("hopePosition");
                    String hopeIndustry = resumeHtml.getString("hopeIndustry");
                    String hopeSalary = resumeHtml.getString("hopeSalary");
                    String hopeAddress = resumeHtml.getString("hopeAddress");
                    String arrivalTime = resumeHtml.getString("arrivalTime");
                    String skills = resumeHtml.getString("skills");
                    String worksLink = resumeHtml.getString("worksLink");
                    String nationality = resumeHtml.getString("nationality");
                    String IDcard = resumeHtml.getString("IDcard");
                    String nowSalary = resumeHtml.getString("nowSalary");
                    String otherInfo = resumeHtml.getString("otherInfo");
                    String hopeNature = resumeHtml.getString("hopeNature");
                    String hunyin = resumeHtml.getString("hunyin");
                    String face = resumeHtml.getString("face");
                    String jsonHtml = (String)object.get("jsonHtml");
                    String evaluate = resumeHtml.getString("evaluate");

                    ResumeDetail detail = new ResumeDetail();
                    detail.setName(name);
                    if(StringUtils.isNotBlank(mobile)){
                        mobile = mobile.trim();
                    }
                    detail.setMobile(mobile);
//                    detail.setAge(age);
//                    detail.setEvaluate(evaluate);
//                    detail.setBirthday(birthday);
//                    detail.setEmail(email);
//                    detail.setAddress(address);
//                    detail.setExperience(experience);
//                    detail.setLastCompanyTime(lastCompanyTime);
//                    detail.setLastCompanyPname(lastCompanyPname);
//                    detail.setUniversityTime(universityTime);
//                    detail.setGouId(r.getResumeId() + "");
//
//                    detail.setHopeAddressDesc(hopeAddress);
//                    detail.setHopeIndustryDesc(hopeIndustry);
//                    detail.setHopePositionDesc(hopePosition);
//                    detail.setHtml(jsonHtml);
//                    detail.setJobStateDesc(jobState);
//                    detail.setUniversityName(universityName);
//                    detail.setLastCompany(lastCompany);
//                    detail.setHopeSalary(hopeSalary);
//                    detail.setArrivalTime(arrivalTime);
//                    detail.setSkills(skills);
//                    detail.setWorksLink(worksLink);
//                    detail.setNationality(nationality);
//                    detail.setIDcard(IDcard);
//                    detail.setNowSalary(nowSalary);
//                    if(StringUtils.isNotBlank(otherInfo) && otherInfo.length()>1001){
//                        otherInfo = otherInfo.substring(0, 1000);
//                    }
//                    detail.setOtherInfo(otherInfo);
//                    detail.setHopeNature(hopeNature);
//                    detail.setResidence(residence);
//                    detail.setExperienceYear(experienceYear);
//                    detail.setQq(QQ);
//                    detail.setWeixin(weixin);
//                    detail.setHunyin(hunyin);
//                    detail.setFace(face);

                    resumeDetails.add(detail);
                }

            } catch (Exception e){
                e.printStackTrace();
                System.out.println(content);
            }
        }
        resumeDetailService.save(resumeDetails);
        jsonResult.setObj(page);
        return jsonResult;
    }
    /**
     * 通过id获取指定的活动详情
     *th
     * */
    @ResponseBody
    @RequestMapping(value = "/findOne")
    public JsonResult findOne(@RequestParam String id){
        JsonResult jsonResult=new JsonResult();
        Resume activity=resumeService.findOne(id);
        jsonResult.setObj(activity);
        return jsonResult;
    }


}
