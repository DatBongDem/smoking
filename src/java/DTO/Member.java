package DTO;

import java.sql.Date;

public class Member {
    private String IDMember;
    private String password;
    private String memberName;
    private String phone;
    private String email;
    private String address;
    private Date dateOfBirth;
    private Date joinDate;
    private String IDCoach;
    private String subcription;
    private String status;

    // Constructor
    public Member(String IDMember, String password, String memberName, String phone, String email,
                  String address, Date dateOfBirth, Date joinDate, String IDCoach,
                  String subcription, String status) {
        this.IDMember = IDMember;
        this.password = password;
        this.memberName = memberName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.joinDate = joinDate;
        this.IDCoach = IDCoach;
        this.subcription = subcription;
        this.status = status;
    }

    // Getters and Setters
    public String getIDMember() {
        return IDMember;
    }

    public void setIDMember(String IDMember) {
        this.IDMember = IDMember;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
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

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getIDCoach() {
        return IDCoach;
    }

    public void setIDCoach(String IDCoach) {
        this.IDCoach = IDCoach;
    }

    public String getSubcription() {
        return subcription;
    }

    public void setSubcription(String subcription) {
        this.subcription = subcription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString
    @Override
    public String toString() {
        return "Member{" +
                "IDMember='" + IDMember + '\'' +
                ", password='" + password + '\'' +
                ", memberName='" + memberName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", joinDate=" + joinDate +
                ", IDCoach='" + IDCoach + '\'' +
                ", subcription='" + subcription + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
