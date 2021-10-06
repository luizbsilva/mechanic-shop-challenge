package com.mechanicshop.challenge;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeradorSenha {
    
    public static void main(final String[] args) {
        final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("desafio123"));
        
    }
    
}
