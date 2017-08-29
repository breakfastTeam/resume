package com.smartbean.service.impl;

import com.smartbean.entity.SysDynamic;
import com.smartbean.entity.SysResumeCount;
import com.smartbean.repository.DynamicRepository;
import com.smartbean.service.DynamicService;
import com.smartbean.service.ResumeCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 手机端应用登录调用内部处理接口实现类
 * Created by Administrator on 2015/9/13.
 */
@Service("dynamicService")
@Transactional
public class DynamicServiceImpl implements DynamicService {

    @Autowired(required = false)
    private DynamicRepository dynamicRepository;

    @Override
    public List<SysDynamic> getRecentDynamics() {
        Pageable pageable = new PageRequest(0, 15, new Sort(new Sort.Order(Sort.Direction.DESC, "createTime")));
        return dynamicRepository.findAll(pageable).getContent();
    }
}
