package co.simplon.atlas.api.entities;

import java.util.UUID;

public class River {

    private UUID identifier;
    private String name;
    private double length;
    private String source;
    private String mouth;

    public River() {
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

    public double getLength() {
	return length;
    }

    public void setLength(double length) {
	this.length = length;
    }

    public String getSource() {
	return source;
    }

    public void setSource(String source) {
	this.source = source;
    }

    public String getMouth() {
	return mouth;
    }

    public void setMouth(String mouth) {
	this.mouth = mouth;
    }

}
