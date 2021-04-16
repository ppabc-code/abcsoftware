package com.mycompany.abc_parshan;




public class Admin_data {

    private int user_ID;
    private String name;
    private String last_name;
    private int phone_number;
    private String occupation_status;
    private String home_commercial;
    private String servcies;
    private String pending;
 
    public Admin_data(int user_ID, String name, String last_name, int phone_number, String occupationstatus, String home_commercial, String servcies, String pending) {
        this.user_ID = user_ID;
        this.name = name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.occupation_status = occupation_status;
        this.home_commercial = home_commercial;
        this.servcies = servcies;
        this.pending = pending;

    }

    public int getuser_ID() {
        return user_ID;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getOccupation_status() {
        return occupation_status;
    }

    public String getHome_commercial() {
        return home_commercial;
    }

    public String getServcie() {
        return servcies;
    }
 
    public String getPending() {
        return pending;
    }

}
