package com.travel1.travel1;

public class Registrationdetails {
   
    private String name;
    private int phonenumber;
    private String emailid;
    private int age;
    private String gender;
    private String departure;
    private String destination;

public void setDestination(String destination) {
        this.destination = destination;
    }

public String getDestination() {
        return destination;
    }

public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
  public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
   public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }
}

