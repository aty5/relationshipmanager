package fr.atyas.relationshipmanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Relationship implements Serializable {

    public Relationship() {

    }
    public Relationship(String name, String email, String jobTitle, String company, String phone, LocalDate meetingDate, String imageUrl, String context) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.company = company;
        this.phone = phone;
        this.meetingDate = meetingDate;
        this.imageUrl = imageUrl;
        this.context = context;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String company;
    private String phone;
    private LocalDate meetingDate;
    private String imageUrl;
    private String context;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }




    @Override
    public String toString() {
        return "Relationship{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", company='" + company + '\'' +
                ", phone='" + phone + '\'' +
                ", meetingDate=" + meetingDate +
                ", imageUrl='" + imageUrl + '\'' +
                ", context='" + context + '\'' +
                '}';
    }

}
