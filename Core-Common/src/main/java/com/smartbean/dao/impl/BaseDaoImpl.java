package com.smartbean.dao.impl;

import com.smartbean.dao.BaseDao;
import com.smartbean.pagination.Page;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by felix on 9/20/15.
 */
public class BaseDaoImpl implements BaseDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List findBySql(String sql,String selectFields, List params) {
        return findBySql(String.format(sql, selectFields), params);
    }


    @Override
    public Page findBySql(Page page, String sql, String selectFields, List params) {
        page.setTotalCount(getTotalCount(sql, params));
        return findBySql(page, String.format(sql, selectFields), params);
    }

    @Override
    public Page findBySqlNoCount(Page page, String sql, String selectFields, List params) {
        return findBySql(page, String.format(sql, selectFields), params);
    }

    @Override
    public void setPageTotalCount(Page page, String sql, List params) {
        page.setTotalCount(getTotalCount(sql, params));
    }

    @Override
    public void executeSql(String sql, List params){
        Query query  = entityManager.createNativeQuery(sql);
        if (params != null) {
            for (int i = 0; i < params.size(); i++) {
                query.setParameter(i, params.get(i));
            }
        }
        query.executeUpdate();
    }



    /**
     * 设置分页参数到Query对象,辅助函数.
     */
    protected Query setPageParameter(final Query q, final Page page) {
        q.setFirstResult((page.getPageNo() - 1) * page.getPageSize());
        q.setMaxResults(page.getPageSize());
        return q;
    }

    protected int getTotalCount(String sql, List params){
        Query query = entityManager.createNativeQuery(String.format(sql," count(*) "));
        if (params != null) {
            for (int i = 0; i < params.size(); i++) {
                query.setParameter(i, params.get(i));
            }
        }
        return ((BigInteger)query.getSingleResult()).intValue();
    }


    private Page findBySql(Page page, String sql, List params) {
        Query query  = entityManager.createNativeQuery(sql);
        if (params != null) {
            for (int i = 0; i < params.size(); i++) {
                query.setParameter(i, params.get(i));
            }
        }
        if (page.getPageNo() != -1) {// -1表示不分页全部查出
            query.setFirstResult((page.getPageNo() - 1) * page.getPageSize());
            query.setMaxResults(page.getPageSize());
        }
        List list = query.getResultList();
        page.setResult(list);
        return page;
    }

    private List findBySql(String sql, List params) {
        Query query  = entityManager.createNativeQuery(sql);
        if (params != null) {
            for (int i = 0; i < params.size(); i++) {
                query.setParameter(i, params.get(i));
            }
        }

        return  query.getResultList();
    }

}
