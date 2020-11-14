package com.Exercise17;

public class Computers {
    String procesor;
    int ram;
    String graphicsCard;
    String manufacturer;
    String type;

    public Computers(String procesor, int ram, String graphicsCard, String manufacturer, String type) {
        this.procesor = procesor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.manufacturer = manufacturer;
        this.type = type;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computers computers = (Computers) o;

        if (ram != computers.ram) return false;
        if (procesor != null ? !procesor.equals(computers.procesor) : computers.procesor != null) return false;
        if (graphicsCard != null ? !graphicsCard.equals(computers.graphicsCard) : computers.graphicsCard != null)
            return false;
        if (manufacturer != null ? !manufacturer.equals(computers.manufacturer) : computers.manufacturer != null)
            return false;
        return type != null ? type.equals(computers.type) : computers.type == null;
    }

    @Override
    public int hashCode() {
        int result = procesor != null ? procesor.hashCode() : 0;
        result = 31 * result + ram;
        result = 31 * result + (graphicsCard != null ? graphicsCard.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "procesor='" + procesor + '\'' +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
