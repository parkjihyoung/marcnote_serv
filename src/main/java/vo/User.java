package vo;

/**
 * Created by parkjihyoung on 15. 5. 1..
 */
public class User {

    String user_id;
    String passwd;
    String email;
    String country;
    String phone;
    String address;
    String reg_date;
    boolean del_flag;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    public boolean isDel_flag() {
        return del_flag;
    }

    public void setDel_flag(boolean del_flag) {
        this.del_flag = del_flag;
    }
}
