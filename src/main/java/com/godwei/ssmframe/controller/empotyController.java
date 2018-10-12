package com.godwei.ssmframe.controller;

import com.godwei.ssmframe.Enity.empotybean;
import com.godwei.ssmframe.service.empotyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;
@Controller//控制器
@RequestMapping("controller")//处理请求映射，定义控制器名称
@SessionAttributes("bean")//当需要跨页面使用的时候，将moddle中想要保存的数据保存在session中
public class empotyController {

    //控制层依赖service,注入service
    @Autowired//根据类型自动装配，当需要按名字进行装配的时候，需要与@Qualifier配合使用
    @Qualifier("empotyService")//这里填写service名称
    private empotyService empotyservice;

    public void setEmpotyservice(empotyService empotyservice) {
        this.empotyservice = empotyservice;
    }

    @RequestMapping("selectById/{id}")//把某个请求映射到特定的方法上面
    public String selectById(@PathVariable("id")Integer id,Map<String,Object> map)
    {
        empotybean bean=empotyservice.selectById(id);
        map.put("bean",bean);
        return "result";//新的jsp路径
    }

    @RequestMapping("/reg")//定义方法名
    public  String reg(empotybean bean, Model model){

        empotyservice.reg(bean);
        return "login";//新的jsp路径
    }
    @RequestMapping("/login")//定义方法名
    public  String login(empotybean bean,Model model){
       bean=empotyservice.login(bean.getName(),bean.getPwd());
       if (bean!=null)
       {
           model.addAttribute("bean",bean);//将数据添加到模型中，当需要跨页面使用的时候保存在session
           return "welcome";//新的jsp路径
       }
     return "fail";//新的jsp路径
    }
    @RequestMapping("/toReg")//定义方法名
    public String toReg(){
        return "reg";//新的jsp路径
    }
    @RequestMapping("/toLogin")//定义方法名
    public String toLogin(){
        return "login";//新的jsp路径
    }

}
