package com.giroux.kevin.dofustuff.commons.security;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordAlgo {

    private static MessageDigest messageDigest;

    public static String encryptSHA512(final String rawPassword){
        try {
            messageDigest = MessageDigest.getInstance("SHA-512");
            byte []result = messageDigest.digest(rawPassword.getBytes());
            BigInteger intNumber = new BigInteger(1, result);
            StringBuilder strHashCode = new StringBuilder(intNumber.toString(16));

            while (strHashCode.length() < 128) {
                strHashCode.insert(0, "0");
            }

            return strHashCode.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
