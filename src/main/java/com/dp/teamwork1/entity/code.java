package com.dp.teamwork1.entity;

public class code {

    public static final String USERNAME="^[a-zA-Z][a-zA-Z0-9_]{4,15}$";

    public static final String EMAIL="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

    public static final String IDPERSON="\\d{15}|\\d{18}$";

    public static final String PHONENUMBER="^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";

}
