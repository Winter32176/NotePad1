package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;

public class Person extends AbstractRecord {
    private String name;
    private String surname;
    private String phone;
    private String email;


    @Override
    public void askInfo() {
        name = Asker.askString("Name");
        surname = Asker.askString("Surname");
        phone = Asker.askString("Phone");
        email = Asker.askString("E-mail");

    }


    @Override
    public String stringContent() {
        return super.stringContent() + "{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' ;

    }

    @Override
    public boolean contains1(String substr) {
        var tmp = substr.toLowerCase();
        return super.contains1(substr)
                || name.toLowerCase().contains(tmp)
                || surname.toLowerCase().contains(tmp)
                || phone.toLowerCase().contains(tmp)
                ||email.toLowerCase().contains(tmp);
    }

    @Override
    protected String type() {
        return "Person";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
