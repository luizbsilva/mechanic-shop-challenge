package com.mechanicshop.challenge.controllers;


import com.mechanicshop.challenge.dto.ChangePasswordDTO;
import com.mechanicshop.challenge.dto.RegistrationDTO;
import com.mechanicshop.challenge.event.RecursoCriadoEvent;
import com.mechanicshop.challenge.service.CadastroService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/usuarios")
@AllArgsConstructor
public class UserController {

    @Autowired
    private ApplicationEventPublisher publisher;

    @Autowired
    private CadastroService cadastroService;


    @ApiOperation(value = "Atualizar Senha", notes = "Faz a atualização de senha de um usuario a partir do ID presente na URL")
    @PutMapping("{id}")
    public ResponseEntity<RegistrationDTO> update(@PathVariable Long id, @Valid @RequestBody ChangePasswordDTO changePasswordDTO) throws Exception {
        final RegistrationDTO response = this.cadastroService.changePassoword(id, changePasswordDTO);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @ApiOperation(value = "Adiciona Um Novo usuario", notes = "Adiciona um novo usuario")
    @PostMapping("")
    public ResponseEntity<RegistrationDTO> addNewser(@Valid @RequestBody RegistrationDTO dados, final HttpServletResponse response) {
        final RegistrationDTO feriado = this.cadastroService.addNewser(dados);
        this.publisher.publishEvent(new RecursoCriadoEvent(feriado, response, feriado.getCode()));

        return ResponseEntity.status(HttpStatus.CREATED).body(feriado);
    }

}
