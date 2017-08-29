package com.smartbean.dao;

import com.smartbean.entity.Resume;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ResumeDao{
    Page<Resume> findAll(Resume resume, Pageable pageable);

    Resume findOne(String id);


    List<Resume> findAll(Resume resume);
}
