package com.hubilon.cams.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;



public class LdapService {
    @Value("${host}")
    private String host;
    private static final Logger log = LoggerFactory.getLogger(LdapService.class);
    public Boolean ldapCheck(String ldapType,String userid,String pwd){

        return true;
    }
}
