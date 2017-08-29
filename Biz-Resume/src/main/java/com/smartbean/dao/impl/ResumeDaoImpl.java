package com.smartbean.dao.impl;

import com.google.common.collect.Lists;
import com.smartbean.dao.ResumeDao;

import com.smartbean.entity.Resume;
import com.smartbean.repository.ResumeRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Repository("resumeDao")
@Transactional
public class ResumeDaoImpl implements ResumeDao {

    @Autowired
    ResumeRepository resumeRepository;

    @Override
    public Page<Resume> findAll(final Resume resume, Pageable pageable) {
        return resumeRepository.findAll(new Specification<Resume>() {
            @Override
            public Predicate toPredicate(Root<Resume> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<Predicate>();

//                list.add(cb.equal(root.get("id").as(String.class), resume.getId()));
                Predicate[] p = new Predicate[list.size()];
                return cb.and(list.toArray(p));
            }
        },pageable);
    }


    @Override
    public Resume findOne(String id) {
        return resumeRepository.findOne(id);
    }

    @Override
    public List<Resume> findAll(Resume resume) {
        return resumeRepository.findAll(new Specification<Resume>() {
            @Override
            public Predicate toPredicate(Root<Resume> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<Predicate>();

                Predicate[] p = new Predicate[list.size()];
                return cb.and(list.toArray(p));
            }
        });
    }
}
