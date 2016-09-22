package ua.epam.model;

/**
 * Created by Viktoriia_Marynchak on 9/21/2016.
 */
/**
 * Класс, состоящий из полей, содержащих фамилию, имя, отчетство.
 * */
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "First name" + '\t' + firstName + '\n' +
                "Middle name" + '\t' + middleName + '\n' +
                "Last name" + '\t' + lastName;
    }
}
