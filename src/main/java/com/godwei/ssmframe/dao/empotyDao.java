package com.godwei.ssmframe.dao;

import com.godwei.ssmframe.Enity.empotybean;
import org.apache.ibatis.annotations.Param;

/**
 * 传入多个值时，需要为每个参数添加@Param注解
 */
public interface empotyDao {

    public empotybean selectById(int id);
    public void reg(@Param("name")String name,@Param("pwd")String pwd);//注册
    public empotybean login(@Param("name")String name,@Param("pwd")String pwd);//登录

}
