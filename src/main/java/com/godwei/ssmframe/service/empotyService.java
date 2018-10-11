package com.godwei.ssmframe.service;

import com.godwei.ssmframe.Enity.empotybean;
import org.apache.ibatis.annotations.Param;

public interface empotyService {

    public empotybean selectById(int id);
    public void reg(empotybean bean);//注册
    public empotybean login(String name,String pwd);//登录
}
