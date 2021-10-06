package com.mechanicshop.challenge.security.services;

import com.mechanicshop.challenge.entity.RegistrationModel;
import com.mechanicshop.challenge.security.JwtUserFactory;
import com.mechanicshop.challenge.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private CadastroService cadastroService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        Optional<RegistrationModel> cadastro = cadastroService.findByEmail(username);

        if (cadastro.isPresent()) {
            return JwtUserFactory.create(cadastro.get());
        }

        throw new UsernameNotFoundException("Email não encontrado.");
    }

}
