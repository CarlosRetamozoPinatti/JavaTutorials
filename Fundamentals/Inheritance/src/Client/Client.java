package Client;

import Domain.Person;

import java.util.Date;

public class Client extends Person {
    private int idClient;
    private Date registrationDate;
    private boolean isVip;
    private static int clientCounter;


    public Client(String name, char gender, int age, String address, Date registrationDate, boolean isVip) {
        super(name, gender, age, address);
        this.idClient = ++Client.clientCounter;
        this.registrationDate = registrationDate;
        this.isVip = isVip;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", registrationDate=" + registrationDate +
                ", isVip=" + isVip +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
