package ua.epam.model;

/**
 * Created by Viktoriia_Marynchak on 9/21/2016.
 */
/**
 * Класс, состоящий из полей, содержащих адресные данные.
 * */
public class Address {
    private String postalCode;
    private String city;
    private String street;
    private int numberHome;
    private int numberApartment;

    public String getIndex() {
        return postalCode;
    }

    public void setIndex(String index) {
        this.postalCode = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(int numberHome) {
        this.numberHome = numberHome;
    }

    public int getNumberApartment() {
        return numberApartment;
    }

    public void setNumberApartment(int numberApartment) {
        this.numberApartment = numberApartment;
    }

    @Override
    public String toString() {
        return "Postal code" + '\t' + '\t' + '\t' + '\t' + '\t' + postalCode + '\n' +
                "City" + '\t' + '\t' + '\t' + '\t' + '\t' + city + '\n' +
                "Street" + '\t' + '\t' + '\t' + '\t' + '\t' + street + '\n' +
                "NumberHome" + '\t' + '\t' + '\t' + '\t' + numberHome + '\n' +
                "NumberApartment" + '\t' + '\t' + '\t' + numberApartment;
    }
}
