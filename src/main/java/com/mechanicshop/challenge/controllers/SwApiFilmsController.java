package com.mechanicshop.challenge.controllers;


import com.mechanicshop.challenge.entity.swapi.Film;
import com.mechanicshop.challenge.entity.swapi.SWModelList;
import com.mechanicshop.challenge.service.SwApiService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/films")
@AllArgsConstructor
public class SwApiFilmsController {

    @Autowired
    private SwApiService swApiService;


    @ApiOperation(value = "Buscar Filmes", notes = "Busca Todos os filmes")
    @GetMapping("")
    public ResponseEntity<SWModelList<Film>> getAll() throws Exception {
        final SWModelList<Film> response = this.swApiService.getAllFilms();
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @ApiOperation(value = "Buscar Filme", notes = "Busca filme por codigo")
    @GetMapping("/{codigo}")
    public ResponseEntity<Film> getById(@PathVariable Integer codigo) throws Exception {
        final Film response = this.swApiService.getFilmById(codigo);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
