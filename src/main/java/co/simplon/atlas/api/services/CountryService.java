package co.simplon.atlas.api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.simplon.atlas.api.database.Database;
import co.simplon.atlas.api.entities.Country;

@Service
public class CountryService {

    public UUID create(Country country) {
	return Database.insert(country);
    }

    public Country get(UUID identifier) {
	return Database.selectCountry(identifier);
    }

    public void replace(UUID identifier, Country country) {
	Country entity = Database.selectCountry(identifier);
	entity.setName(country.getName());
	entity.setIsoCode2(country.getIsoCode2());
	entity.setIsoCode3(country.getIsoCode3());
	entity.setOfficialLanguage(country.getOfficialLanguage());
	entity.setArea(country.getArea());
	entity.setPopulation(country.getPopulation());
	Database.update(entity);
    }

    public void delete(UUID identifier) {
	Database.deleteCountry(identifier);
    }

    public void updatePartially(UUID identifier, Country country) {
	Country entity = Database.selectCountry(identifier);
	entity.setOfficialLanguage(country.getOfficialLanguage());
	entity.setArea(country.getArea());
	entity.setPopulation(country.getPopulation());
	Database.update(entity);
    }
}
