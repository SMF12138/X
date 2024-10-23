package NewLearn.Learn134;

import java.io.Serial;
import java.io.Serializable;

public class Address implements Serializable {
    @Serial
    private static final long serialVersionUID = 12321;

    private String ciyt;
    private String street;
    public Address(){

    }

    public Address(String ciyt, String street) {
        this.ciyt = ciyt;
        this.street = street;
    }

    public String getCiyt() {
        return ciyt;
    }

    public void setCiyt(String ciyt) {
        this.ciyt = ciyt;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "ciyt='" + ciyt + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
