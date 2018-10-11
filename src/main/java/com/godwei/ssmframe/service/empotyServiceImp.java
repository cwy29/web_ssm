package com.godwei.ssmframe.service;


import com.godwei.ssmframe.Enity.empotybean;
import com.godwei.ssmframe.dao.empotyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empotyServiceImp implements empotyService{

    //service依赖于dao!!!哈哈
@Autowired
    private  empotyDao mapper;

    public void setMapper(empotyDao mapper) {
        this.mapper = mapper;
    }

    /**
     * 通过ID查询信息
     * @param id
     * @return
     */
    @Override
    public empotybean selectById(int id) {
        empotybean bean=mapper.selectById(id);
        return bean;
    }

    /**
     * 注册
     * @param bean
     */
    @Override
    public void reg(empotybean bean) {
      mapper.reg(bean.getName(),bean.getPwd());
    }

    /**
     *登录
     * @param name
     * @param pwd
     * @return
     */
    @Override
    public empotybean login(String name, String pwd) {

       empotybean bean=mapper.login(name,pwd);
       if(bean!=null&&bean.getName().equals(name)&&bean.getPwd().equals(pwd))
       {
           return bean;
       }

        return null ;
    }


}
