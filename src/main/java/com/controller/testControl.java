package com.controller;

import com.dao.employeeinfoMapper;
import com.entiy.administrator;
import com.entiy.employeeinfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import com.dao.administratorMapper;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 测试控制层
 */
@Controller
@RequestMapping("/test")
public class testControl {
    @Autowired
    private administratorMapper administratorMapper;
    @Autowired
    private employeeinfoMapper employeeinfoDao;

    @RequestMapping("/returnName")
    public void returnName(@RequestParam(name = "userName", required = false) String userName, @RequestParam(name = "password", required = false) String password, @RequestParam(name = "power", required = false) String permission, HttpServletResponse response) throws IOException {


        response.getWriter().print(1);
    }

/*
    @RequestMapping("/login")
    *//*@ResponseBody*//*
    @ResponseBody
    public String login(@ResponseBody ){

        System.out.println("用户登录："+userName+password+userType);

        *//*Map<String, String> map=new LinkedHashMap<String,String>();

        map.put("name", user.getName());
        map.put("password", user.getPassword());*//*

       *//* User user= userService.login(userName,password);
        String type=null;

        if(user==null){
            return "fail";
        }else{
            type=user.getUserType();
            System.out.println(user.getUserType());
        }
        if("2".equals(type)){
            return "index";
        }else {
        return "index2";
        }*/

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login")
    public String Login(@RequestBody employeeinfo employeeinfo, HttpServletResponse response, ModelMap modelMap) throws IOException {
        //user = userDao.loginSelect(userInfor);
        employeeinfo user = new employeeinfo();
        user = employeeinfoDao.login(employeeinfo);
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(user.toString());
        if (user.geteId() != null) {
            /*if(user.getPermission().equals("1")){
                return  "text";
            }*/
            modelMap.addAttribute("userInfor", user);
            System.out.println("成功获取");
            response.getWriter().print(objectMapper.writeValueAsString(user));
        } else {
            response.getWriter().print("{\"check\":\"false\"}");
        }
        return null;
    }
}

