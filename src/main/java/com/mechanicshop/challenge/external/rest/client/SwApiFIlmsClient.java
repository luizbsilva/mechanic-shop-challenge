package com.mechanicshop.challenge.external.rest.client;

import com.mechanicshop.challenge.entity.swapi.Film;
import com.mechanicshop.challenge.entity.swapi.SWModelList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${feign.rest.swfilme.name}", url = "${feign.rest.swfilme.url}")
public interface SwApiFIlmsClient {

    @GetMapping(value = "/api/films")
    SWModelList<Film> getAllFilms();

    @GetMapping(value = "/api/films/{code}")
    Film getFilm(@PathVariable("code") Integer code);

}
