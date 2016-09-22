package ua.epam.model;

/**
 * Created by Viktoriia_Marynchak on 9/21/2016.
 */
/**
 * Класс, предствляющий собой модель.
 * */
public class PhoneBook {
    private Name name;
    private String comment;
    private Group group;
    private String phoneHome;
    private String phoneMobile1;
    private String phoneMobile2;
    private String email;
    private String skype;
    private Address address;
    private String dateCreate;
    private String dateUpdate;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    public String getPhoneMobile1() {
        return phoneMobile1;
    }

    public void setPhoneMobile1(String phoneMobile1) {
        this.phoneMobile1 = phoneMobile1;
    }

    public String getPhoneMobile2() {
        return phoneMobile2;
    }

    public void setPhoneMobile2(String phoneMobile2) {
        this.phoneMobile2 = phoneMobile2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
}
