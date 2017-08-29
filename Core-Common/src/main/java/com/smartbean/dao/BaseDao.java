package com.smartbean.dao;



import com.smartbean.pagination.Page;

import java.io.Serializable;
import java.util.List;

/**
 * Created by felix on 9/20/15.
 */
public interface BaseDao<T, PK extends Serializable> {

    public List findBySql(String sql,String selectFields, List params);

    public Page<T> findBySql(Page<T> page, String sql, String selectFields, List<String> params);

    public void executeSql(String sql, List<String> params);

    public Page findBySqlNoCount(Page page, String sql, String selectFields, List params);

    public void setPageTotalCount(Page page, String sql, List params);


}
