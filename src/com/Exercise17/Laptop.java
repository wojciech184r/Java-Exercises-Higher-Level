package com.Exercise17;

public class Laptop extends Computers {

    String bateria;

    public Laptop(String procesor, int ram, String graphicsCard, String manufacturer, String type) {
        super(procesor, ram, graphicsCard, manufacturer, type);
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public Laptop(String procesor, int ram, String graphicsCard, String manufacturer, String type, String bateria) {
        super(procesor, ram, graphicsCard, manufacturer, type);
        this.bateria = bateria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;

        Laptop laptop = (Laptop) o;

        return bateria != null ? bateria.equals(laptop.bateria) : laptop.bateria == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (bateria != null ? bateria.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                ", procesor='" + procesor + '\'' +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                "bateria='" + bateria + '\'' +
                '}';
    }
}
