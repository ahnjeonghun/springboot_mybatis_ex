package com.hubilon.cams;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class JasyptTest{
    public static void main(String[] args) {
        StandardPBEStringEncryptor jasypt = new StandardPBEStringEncryptor();
        jasypt.setPassword("m2sj");      //암호화 키(password)
        jasypt.setAlgorithm("PBEWithMD5AndDES");


        String encryptedText = jasypt.encrypt("tiger");    //암호화
        String plainText = jasypt.decrypt(encryptedText);  //복호화

        System.out.println("encryptedText:  " + encryptedText); //암호화된 값
        System.out.println("plainText:  " + plainText);         //복호화된 값
    }
}
