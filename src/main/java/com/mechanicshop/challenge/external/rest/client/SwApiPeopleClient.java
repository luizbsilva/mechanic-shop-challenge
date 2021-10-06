package com.mechanicshop.challenge.external.rest.client;

import com.mechanicshop.challenge.entity.swapi.People;
import com.mechanicshop.challenge.entity.swapi.SWModelList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${feign.rest.swpeople.name}", url = "${feign.rest.swpeople.url}")
public interface SwApiPeopleClient {

    @GetMapping(value = "/api/people")
    SWModelList<People> getAllPepole();

    @GetMapping(value = "/api/people/{code}")
    People getPeople(@PathVariable("code") Integer code);

}
