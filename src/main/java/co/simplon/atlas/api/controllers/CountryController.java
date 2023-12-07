package co.simplon.atlas.api.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.atlas.api.entities.Country;
import co.simplon.atlas.api.services.CountryService;

@RestController
@RequestMapping("/countries")
class CountryController {

    private final CountryService service;

    CountryController(CountryService service) {
	this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    UUID create(@RequestBody Country country) {
	return service.create(country);
    }

    @GetMapping("/{id}")
    Country get(@PathVariable("id") UUID identifier) {
	return service.get(identifier);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void replace(@PathVariable("id") UUID identifier, @RequestBody Country country) {
	service.replace(identifier, country);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable("id") UUID identifier) {
	service.delete(identifier);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void updatePartially(@PathVariable("id") UUID identifier, @RequestBody Country country) {
	service.updatePartially(identifier, country);
    }
}
