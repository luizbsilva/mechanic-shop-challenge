package com.mechanicshop.challenge.repository;

import com.mechanicshop.challenge.entity.RegistrationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<RegistrationModel, Long>, JpaSpecificationExecutor<RegistrationModel> {

    RegistrationModel findByEmail(String email);
}

   