package com.boubtec.gymclubmanager.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id ;
    private String name;
    private String email;
    private String jobTitle;
    private Date birthday;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String Reference ;

    public Subscriber() {
    }

    public Subscriber(Long id, String name, String email, String jobTitle, Date birthday, String phone, String imageUrl, String reference) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.birthday = birthday;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.Reference = reference;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getReference() {
        return Reference;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", Reference='" + Reference + '\'' +
                '}';
    }
}
