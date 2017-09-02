package com.smartbean.service;

import com.smartbean.entity.Resume;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 *
 */
public interface ResumeService {

    public Resume findOne(Long id);
}
