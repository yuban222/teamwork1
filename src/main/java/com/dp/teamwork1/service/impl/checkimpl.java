package com.dp.teamwork1.service.impl;

import com.dp.teamwork1.entity.code;
import com.dp.teamwork1.service.check;
import org.springframework.stereotype.Service;


@Service
public class checkimpl implements check {

    @Override
    public boolean checkphonenumber(String phonenumber) {
        return phonenumber.matches(code.PHONENUMBER);
    }

    @Override
    public boolean checkemail(String email) {
        return email.matches(code.EMAIL);
    }

    @Override
    public boolean checkidperson(String idperson) {
        return idperson.matches(code.IDPERSON);
    }

    @Override
    public boolean checkusername(String username) {
        return username.matches(code.USERNAME);
    }

}
