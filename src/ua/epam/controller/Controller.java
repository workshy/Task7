package ua.epam.controller;

import ua.epam.view.View;
import ua.epam.model.Address;
import ua.epam.model.Group;
import ua.epam.model.Name;
import ua.epam.model.PhoneBook;

import java.util.Scanner;

/**
 * Created by Viktoriia_Marynchak on 9/21/2016.
 */
/**
 * Класс, содержащий шаблоны регулрных выражений, методы которого осуществляют
 * считывание и проверку входных данных с последующей их передачей в экземпляр модели.
 * */
public class Controller {
    /**
     * Экземпляр модели
     * */
    PhoneBook phoneBook = new PhoneBook();
    /**
     * Шаблоны регулярных выражений
     * */
    private final String NAME = "^[A-Z][a-z]+$";
    private final String PHONE = "\\+?(38)?-0\\d{2}-\\d{3}-\\d{2}-\\d{2}";
    private final String EMAIL = "[\\w\\.%-_]+@[\\w]+\\.[A-Za-z]{2,4}";
    private final String SKYPE = "[\\w\\.\\-_]{1,32}";
    private final String POSTAL_CODE = "[\\d]{5}";
    private final String CITY = "^[A-Z][a-z\\-]+$";
    private final String STREET = "^[A-Z][a-z\\.\\-\\d]+$";
    private final String NUMBER_HOME = "\\d{1,3}";
    private final String NUMBER_APARTMENT = "\\d{1,4}";
    private final String DATE = "([0-2]\\d|3[01])\\.(0\\d|1[012])\\.(\\d{4})";
    /**
     * Экземпляр класса Scanner для считывания данных с консоли
     * */
    Scanner scanner = new Scanner(System.in);

    /**
     * Метод считывает данные с консоли и, если данные корректные,
     * то передает их в экземпляр модели.
     * */
    public void read() {
        String temp = "";
        Name name = new Name();
        Address address = new Address();

        name.setFirstName(validate(temp, NAME, View.FIST_NAME, scanner));
        name.setMiddleName(validate(temp, NAME, View.MIDDLE_NAME, scanner));
        name.setLastName(validate(temp, NAME, View.LAST_NAME, scanner));
        phoneBook.setName(name);

        System.out.println(View.COMMENT);
        temp = scanner.nextLine();
        phoneBook.setComment(temp);

        System.out.println(View.GROUP);
        temp = scanner.nextLine();
        for ( Group g: Group.values()) {
            if ( temp.equals(g.toString())) {
                phoneBook.setGroup(g);
                break;
            }
        }

        phoneBook.setPhoneHome(validate(temp, PHONE, View.PHONE_HOME, scanner));

        phoneBook.setPhoneMobile1(validate(temp, PHONE, View.PHONE_MOBILE1, scanner));

        phoneBook.setPhoneMobile2(validate(temp, PHONE, View.PHONE_MOBILE2, scanner));

        phoneBook.setEmail(validate(temp, EMAIL, View.EMAIL, scanner));

        phoneBook.setSkype(validate(temp, SKYPE, View.SKYPE, scanner));

        address.setIndex(validate(temp, POSTAL_CODE, View.POSTAL_CODE, scanner));
        address.setCity(validate(temp, CITY, View.CITY, scanner));
        address.setStreet(validate(temp, STREET, View.STREET, scanner));
        address.setNumberHome(Integer.valueOf(validate(temp, NUMBER_HOME, View.NUMBER_HOME, scanner)));
        address.setNumberApartment(Integer.valueOf(validate(temp, NUMBER_APARTMENT, View.NUMBER_APARTMENT, scanner)));
        phoneBook.setAddress(address);

        phoneBook.setDateCreate(validate(temp, DATE, View.DATE_CREATE, scanner));
        phoneBook.setDateUpdate(phoneBook.getDateCreate());
    }

    /**
     * Метод проверяет входящие данные на соответствие регулярному выражению.
     * @param temp - данные, считанные с консоли.
     * @param regex - регулярное выражение, которому должно соответствовать содержимое параметра temp.
     * @param message - финализированная статическая переменная класса View, содержащая сообщение о том,
     * какие данные нужно ввести в консоль.
     * @param scanner - экземпляр класса Scanner для считывания данных с консоли.
     * @return - значение типа String, которое соответствует шаблону регулярного выражения.
     * */
    private String validate(String temp, String regex,
                             String message, Scanner scanner){
        do {
            System.out.println(message);
            temp = scanner.nextLine();
        } while (!temp.matches(regex));

        return temp;
    }

    /**
     * Вывод в консоль значений полей экземпляра модели
     * */
    public void showPhoneBook(){
        System.out.println(phoneBook.getName().toString());
        System.out.println("Group" + '\t' + '\t' + '\t' + '\t' + '\t' + phoneBook.getGroup().toString());
        System.out.println("Comment" + '\t' + '\t' + '\t' + '\t' + '\t' + phoneBook.getComment());
        System.out.println("Home phone number" + '\t' + '\t' + phoneBook.getPhoneHome());
        System.out.println("Mobile phone number" + '\t' + '\t' + phoneBook.getPhoneMobile1());
        System.out.println("Mobile phone number" + '\t' + '\t' + phoneBook.getPhoneMobile2());
        System.out.println("Email" + '\t' + '\t' + '\t' + '\t' + '\t' + phoneBook.getEmail());
        System.out.println("Skype" + '\t' + '\t' + '\t' + '\t' + '\t' + phoneBook.getSkype());
        System.out.println("Address:" + '\n' + phoneBook.getAddress().toString());
        System.out.println("Date of create" + '\t' + '\t' + '\t' + phoneBook.getDateCreate());
        System.out.println("Date of update" + '\t' + '\t' + '\t' + phoneBook.getDateUpdate());
    }

}
