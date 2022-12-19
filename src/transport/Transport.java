package transport;

import static valid.ValidateUtils.*;

public abstract class Transport implements Competitive {
    public final static String DEFAULT_MESSAGE = "default";
    private String brand;
    private String model;
    private Double engineVolume;
    private String type;

    public Transport(String brand, String model, Double engineVolume/*, String type, String country, String color, Double fuelPercentage, Double maxSpeed, String fuelType*/) {
        this.brand = validateString(brand, DEFAULT_MESSAGE);
        this.model = validateString(model, DEFAULT_MESSAGE);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.type = validateString(type, DEFAULT_MESSAGE);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void startMoving();

    public abstract void finishMoving();
}