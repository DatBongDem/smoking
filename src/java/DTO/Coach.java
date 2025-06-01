/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Nguyen Tien Dat
 */
import java.sql.Date;

public class Coach {
    private String IDCoach;
    private String password;
    private String coachName;
    private String phone;
    private String email;
    private String address;
    private Date dateOfBirth;
    private String specialization;
    private int experienceYears;

    // Constructor không tham số
    public Coach() {
    }

    // Constructor đầy đủ tham số
    public Coach(String IDCoach, String password, String coachName, String phone,
                 String email, String address, Date dateOfBirth,
                 String specialization, int experienceYears) {
        this.IDCoach = IDCoach;
        this.password = password;
        this.coachName = coachName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    // Getters và Setters
    public String getIDCoach() {
        return IDCoach;
    }

    public void setIDCoach(String IDCoach) {
        this.IDCoach = IDCoach;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    // toString method để dễ kiểm tra thông tin
    @Override
    public String toString() {
        return "Coach{" +
                "IDCoach='" + IDCoach + '\'' +
                ", password='" + password + '\'' +
                ", coachName='" + coachName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", specialization='" + specialization + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
