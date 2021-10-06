package com.mechanicshop.challenge.external.rest.client;

import com.mechanicshop.challenge.entity.swapi.SWModelList;
import com.mechanicshop.challenge.entity.swapi.Starship;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${feign.rest.swsstartships.name}", url = "${feign.rest.swsstartships.url}")
public interface SwApiStartshipsClient {

    @GetMapping(value = "/api/starships")
    SWModelList<Starship> getAllStarship();

    @GetMapping(value = "/api/starships/{code}")
    Starship getStarship(@PathVariable("code") Integer code);

}
