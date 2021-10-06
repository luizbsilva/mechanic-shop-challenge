package com.mechanicshop.challenge.security;

import com.mechanicshop.challenge.enuns.PerfilEnum;
import com.mechanicshop.challenge.entity.RegistrationModel;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class JwtUserFactory {

	private JwtUserFactory() {
	}


	public static JwtUser create(RegistrationModel cadastro) {
		return new JwtUser( cadastro.getCode(), cadastro.getEmail(), cadastro.getPassword(),
				mapToGrantedAuthorities(cadastro.getType()));
	}


	private static List<GrantedAuthority> mapToGrantedAuthorities(PerfilEnum perfilEnum) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(perfilEnum.toString()));
		return authorities;
	}

}
