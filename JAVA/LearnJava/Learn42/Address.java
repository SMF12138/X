package NewLearn.Learn42;

public class Address {
    private String city;
    private String street;
    public Address(){

    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return  true;
        /**
         * 上面两个判断存疑
         */
        if (obj instanceof Address){
            Address address = (Address) obj;
            return street.equals(address.street) && city.equals(address.city);
            //User重写后，Address中的方法同样需要重写
        }
        return false;
    }
}
