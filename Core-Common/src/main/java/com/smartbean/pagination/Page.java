package com.smartbean.pagination;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by admin on 2015/5/20.
 */
public class Page<T> {
    //分页参数
    protected int pageNo = 1;//当前页数
    protected int prePage = 1;//上一页
    protected int nextPage = 1;//下一页

    protected int pageSize = 15;//每页多少条

    protected int totalPages = 1;//页数

    //返回结果
    protected List<T> result = Lists.newArrayList();
    protected int totalCount = 0;


    // 构造函数

    public Page() {
        super();
    }

    public Page(int pageSize) {
        setPageSize(pageSize);
    }

    public Page(int pageNo, int pageSize){
        setPageNo(pageNo);
        setPageSize(pageSize);
    }


    //查询参数函数

    /**
     * 获得当前页的页号,序号从1开始,默认为1.
     */
    public int getPageNo() {
        return pageNo;
    }

    /**
     * 设置当前页的页号,序号从1开始,低于1时自动调整为1.
     */
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;

        if (pageNo < 1) {
            this.pageNo = 1;
        }
    }

    /**
     * 获得每页的记录数量,默认为1.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置每页的记录数量,低于1时自动调整为1.
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;

        if (pageSize < 1) {
            this.pageSize = 1;
        }
    }

    /**
     * 根据pageNo和pageSize计算当前页第一条记录在总结果集中的位置,序号从1开始.
     */
    public int getPageFirstOfAllElements() {
        return ((pageNo - 1) * pageSize) + 1;
    }



    // 查询结果函数

    /**
     * 取得页内的记录列表.
     */
    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    /**
     * 取得总记录数,默认值为-1.
     */
    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 根据pageSize与totalCount计算总页数,默认值为-1.
     */
    public int getTotalPages() {
        if (totalCount < 0)
            return -1;

        int count = totalCount / pageSize;
        if (totalCount % pageSize > 0) {
            count++;
        }
        this.totalPages = count;
        return count;
    }

    /**
     * 是否还有下一页.
     */
    public boolean isHasNext() {
        return (pageNo + 1 <= getTotalPages());
    }

    /**
     * 取得下页的页号,序号从1开始.
     * 当前页为尾页时仍返回尾页序号.
     */
    public int getNextPage() {
        if (isHasNext())
            this.nextPage = pageNo + 1;
        else
            this.nextPage = pageNo;

        return this.nextPage;
    }

    /**
     * 是否还有上一页.
     */
    public boolean isHasPre() {
        return (pageNo - 1 >= 1);
    }

    /**
     * 取得上页的页号,序号从1开始.
     * 当前页为首页时返回首页序号.
     */
    public int getPrePage() {
        if (isHasPre())
            this.prePage = pageNo - 1;
        else
            this.prePage = pageNo;

        return this.prePage;
    }
}
