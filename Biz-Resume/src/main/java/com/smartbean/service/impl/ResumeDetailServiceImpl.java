package com.smartbean.service.impl;

import com.smartbean.dtos.SearchParam;
import com.smartbean.entity.ResumeDetail;
import com.smartbean.enums.CreditOperate;
import com.smartbean.repository.*;
import com.smartbean.service.CreditRecordService;
import com.smartbean.service.ResumeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service("resumeDetailService")
public class ResumeDetailServiceImpl implements ResumeDetailService {

    @Autowired
    private ResumeDetailRepository resumeDetailRepository;
    @Autowired
    private ResumeDetailEducationExperienceRepository resumeDetailEducationExperienceRepository;
    @Autowired
    private ResumeDetailProjectExperienceRepository resumeDetailProjectExperienceRepository;
    @Autowired
    private ResumeDetailSkillsRepository resumeDetailSkillsRepository;
    @Autowired
    private ResumeDetailWorkExperienceRepository resumeDetailWorkExperienceRepository;
    @Autowired
    private CreditRecordService creditRecordService;


    @Override
    @Transactional
    public ResumeDetail save(ResumeDetail resumeDetail) {
        ResumeDetail saved = resumeDetailRepository.findFirstByUserIdOrMobile(resumeDetail.getUserId(), resumeDetail.getMobile());

        if (saved == null) {
            saved = resumeDetailRepository.save(resumeDetail);
        }
        final Long resumeDetailId = saved.getId();
        resumeDetail.getResumeDetailEducationExperiences().stream()
                .forEach(entity -> {
                    entity.setResumeDetailId(resumeDetailId);
                    resumeDetailEducationExperienceRepository.save(entity);
                });
        resumeDetail.getResumeDetailProjectExperiences().stream()
                .forEach(entity -> {
                    entity.setResumeDetailId(resumeDetailId);
                    resumeDetailProjectExperienceRepository.save(entity);
                });
        resumeDetail.getResumeDetailSkills().stream()
                .forEach(entity -> {
                    entity.setResumeDetailId(resumeDetailId);
                    resumeDetailSkillsRepository.save(entity);
                });
        resumeDetail.getResumeDetailWorkExperiences().stream()
                .forEach(entity -> {
                    entity.setResumeDetailId(resumeDetailId);
                    resumeDetailWorkExperienceRepository.save(entity);
                });
        if (resumeDetail.getUserId() != null) {
            creditRecordService.save(resumeDetail.getUserId(), CreditOperate.CREATE);
        }
        return saved;
    }

    @Override
    @Transactional
    public List<ResumeDetail> save(List<ResumeDetail> resumeDetails) {
        return resumeDetails.stream()
                .map(resumeDetail -> this.save(resumeDetail))
                .collect(Collectors.toList());
    }

    @Override
    public List<ResumeDetail> query(SearchParam searchParam) {
        return resumeDetailRepository.findByNameOrMobileOrEmailOrderByCreateTimeDesc(searchParam.getName(), searchParam.getMobile(), searchParam.getEmail());
    }

}
