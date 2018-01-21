/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Admin
 */
public class Students {
    private int id;
    private String rollNumber;
    private String name;
    private int gender;
    private String birthday;
    private String phone;
    private String email;
    private String address;
    private String createAt;
    private String updateAt;
    private int status;

    public Students() {
    }

    public Students(String rollNumber, String name, int gender, String birthday, String phone, String email, String address, int status) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.status = status;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Students(int id, String rollNumber, String name, int gender, String birthday,String phone, String email, String address, int status) {
        this.id = id;
        this.rollNumber = rollNumber;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.status = status;
    }


    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
    
    
    
}
