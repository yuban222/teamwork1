package com.dp.teamwork1.controller;

import com.dp.teamwork1.dao.userdao;
import com.dp.teamwork1.entity.ResponseResult;
import com.dp.teamwork1.entity.commom;
import com.dp.teamwork1.entity.user;
import com.dp.teamwork1.service.check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class register {
    @Autowired
    check check;
    @Autowired
    userdao userdao;

    @RequestMapping("/rigister")
    @ResponseBody
    @CrossOrigin
    public ResponseResult ac(@RequestBody commom m)
    {
        System.out.println(m);
        boolean checkphonenumber = check.checkphonenumber(m.getPhonenumber());
        boolean checkidperson = check.checkidperson(m.getIdperson());
        boolean checkemail = check.checkemail(m.getEmail());
        boolean checkusername = check.checkusername(m.getUsername());

        if(checkphonenumber&&checkidperson&&checkemail&&checkusername)
            return new ResponseResult<>(100,"检查成功");
        else return new ResponseResult<>(200,"检查失败");
    }

    @RequestMapping("/register")
    @ResponseBody
    @CrossOrigin
    public ResponseResult register1(@RequestBody user user)
    {
        System.out.println(user);
        userdao.add(user);
        return new ResponseResult<>(200,"注册成功");
    }

    @RequestMapping("/login")
    @ResponseBody
    @CrossOrigin
    public ResponseResult login(@RequestBody user user)
    {
        if (userdao.login(user)) {
            return new ResponseResult<>(200,"登入成功");
        }else return new ResponseResult<>(200,"登入失败");

    }
}
