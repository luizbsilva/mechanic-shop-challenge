package com.mechanicshop.challenge.util;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Util {

    public static String encriptSHA256(String valor) {
        return encript(valor, "SHA-256");
    }

    public static String encript(String valor, String algorithm) {
        final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("desafio123"));
        return Hex.encodeHexString(DigestUtils.getDigest(algorithm).digest(valor.getBytes()));
    }

}
