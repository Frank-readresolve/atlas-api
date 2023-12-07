package co.simplon.atlas.api.entities;

import java.util.UUID;

public class Continent {
    private UUID identifier;
    private String name;
    private int area;

    public Continent() {
	// Default no-arg constructor
    }

    public UUID getIdentifier() {
	return identifier;
    }

    public void setIdentifier(UUID identifier) {
	this.identifier = identifier;
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

}
