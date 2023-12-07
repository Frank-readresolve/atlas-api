package co.simplon.atlas.api.entities;

import java.util.UUID;

public class Country {
    private UUID identifier;
    private String isoCode2;
    private String isoCode3;
    private String name;
    private int area;
    private long population;
    private String officialLanguage;

    public Country() {
	// Default no-arg constructor
    }

    public UUID getIdentifier() {
	return identifier;
    }

    public void setIdentifier(UUID identifier) {
	this.identifier = identifier;
    }

    public String getIsoCode2() {
	return isoCode2;
    }

    public void setIsoCode2(String isoCode2) {
	this.isoCode2 = isoCode2;
    }

    public String getIsoCode3() {
	return isoCode3;
    }

    public void setIsoCode3(String isoCode3) {
	this.isoCode3 = isoCode3;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getArea() {
	return area;
    }

    public void setArea(int area) {
	this.area = area;
    }

    public long getPopulation() {
	return population;
    }

    public void setPopulation(long population) {
	this.population = population;
    }

    public String getOfficialLanguage() {
	return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
	this.officialLanguage = officialLanguage;
    }

}
