package com.mechanicshop.challenge.service;

import com.mechanicshop.challenge.dto.ChangePasswordDTO;
import com.mechanicshop.challenge.dto.RegistrationDTO;
import com.mechanicshop.challenge.enuns.PerfilEnum;
import com.mechanicshop.challenge.entity.RegistrationModel;
import com.mechanicshop.challenge.repository.CadastroRepository;
import com.mechanicshop.challenge.util.Util;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CadastroService {

    private CadastroRepository cadastroRepository;

    public Optional<RegistrationModel> findByEmail(String email) {
        return Optional.ofNullable(cadastroRepository.findByEmail(email));
    }

    public Optional<RegistrationModel> find(Long id) {
        return cadastroRepository.findById(id);
    }


    public RegistrationDTO changePassoword(Long codeUser, ChangePasswordDTO data) throws Exception {
        Optional<RegistrationModel> registration = cadastroRepository.findById(codeUser);

        if(registration.isEmpty()){
            return null;
        }

        RegistrationModel registrationModel = registration.get();
        registrationModel.setPassword(Util.encriptSHA256(data.getPassword()));

        this.cadastroRepository.save(registrationModel);



        return new RegistrationDTO(registrationModel.getCode(), registrationModel.getName(), registrationModel.getEmail());
    }

    public RegistrationDTO addNewser(RegistrationDTO data) {
        final RegistrationModel entidade = this.fillEntity(data);

        this.cadastroRepository.save(entidade);
        data.setCode(entidade.getCode());

        return data;
    }

    private RegistrationModel fillEntity(RegistrationDTO data) {
        RegistrationModel registrationModel = new RegistrationModel();
        registrationModel.setName(data.getUserName());
        registrationModel.setEmail(data.getEmail());
        registrationModel.setType(PerfilEnum.ROLE_INTEGRACAO);
        registrationModel.setPassword(Util.encriptSHA256(data.getPassword()));
        return registrationModel;
    }
}
