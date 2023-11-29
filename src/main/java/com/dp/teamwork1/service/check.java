package com.dp.teamwork1.service;

import org.springframework.stereotype.Service;

@Service
public interface check {
    boolean checkphonenumber(String phonenumber);
    boolean checkemail(String email);
    boolean checkidperson(String idperson);
    boolean checkusername(String username);
}
