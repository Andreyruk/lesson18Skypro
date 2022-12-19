package transport;

import static transport.Transport.DEFAULT_MESSAGE;
import static valid.ValidateUtils.*;

public class Driver<T extends Transport> {
    private String name;
    private Number experience;
    private Class<T> typeDriverLicense;

    public <T> boolean startMoving(Class<T> typeDriverLicense) {
        if (typeDriverLicense == this.typeDriverLicense) {
            // System.out.println("водитель участвует в гонках");
            return true;
        }
//        } else {
//            System.out.println(String.format("водитель не может управлять транспортным средством типа %s",type));
//        }
        return false;
    }

    public void stopMoving() {
        System.out.println("водитель остановил транспортное средство");
    }

    public void refuelCar() {
        System.out.println("водитель заправил транспортное средство");
    }

    public Driver(String name, Double experience, Class<T> typeDriverLicense) {
        this.name = validateString(name, DEFAULT_MESSAGE);
        this.experience = validateMathNumber(experience);
        this.typeDriverLicense = typeDriverLicense;
    }

    public String getName() {
        return name;
    }

    public Number getExperience() {
        return experience;
    }

    public Class<T> getTypeDriverLicense() {
        return typeDriverLicense;
    }

    @Override
    public String toString() {
        return "Водитель " + name +
                ", стаж " + experience +
                ", водительские права категории " + (typeDriverLicense == Car.class ? "B" : typeDriverLicense == Bus.class ? "D" : typeDriverLicense == Truck.class ? "C" : "");
    }
}
