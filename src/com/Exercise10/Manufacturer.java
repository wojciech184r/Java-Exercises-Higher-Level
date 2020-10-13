//Stwórz klasę Manufacturer, która będzie zawierać pola: nazwa, rok założenia, kraj. Uwzględnij wszystkie
//niezbędne meotody oraz parametry konstruktora. Zaimplementuj metody hashCode() i equals() .
//Stwórz klasę Car , która będzie zawierać pola: nazwa, model, cena, rok produkcji,
// lista producentów (Manufacturer), oraz typ silnika (reprezentowany jako klasa enum, np. V12, V8, V6, S6, S4, S3).
// Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashcode() i equals().




package com.Exercise10;

public class Manufacturer {
    String name;
    int ageOfFundation;
    String Country;

    public Manufacturer(String name, int ageOfFundation, String country) {
        this.name = name;
        this.ageOfFundation = ageOfFundation;
        Country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeOfFundation() {
        return ageOfFundation;
    }

    public void setAgeOfFundation(int ageOfFundation) {
        this.ageOfFundation = ageOfFundation;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manufacturer that = (Manufacturer) o;

        if (ageOfFundation != that.ageOfFundation) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return Country != null ? Country.equals(that.Country) : that.Country == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + ageOfFundation;
        result = 31 * result + (Country != null ? Country.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", ageOfFundation=" + ageOfFundation +
                ", Country='" + Country + '\'' +
                '}';
    }
}
