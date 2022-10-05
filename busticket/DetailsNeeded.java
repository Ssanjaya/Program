import java.util.Date;

public class DetailsNeeded {
    public DetailsNeeded(String firstName, Date date, String busNo) {
        this.firstName = firstName;
        this.date = date;
        this.busNo = busNo;
    }
    private String firstName;
    private String lastName;
    private byte age;
    private Date date;
    private String phone;
    private String busNo = "TN00";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBusNo() {
        return busNo;
    }

}
