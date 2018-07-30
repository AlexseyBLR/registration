package com.compit.registration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
@Entity
public class User {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "username")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "age")
    private String age;

    @Column(name = "sex")
    private String sex;

    @Column(name = "profile")
    private String profile;

    @Column(name = "mathResult")
    private String mathResult;

    @Column(name = "physResult")
    private String physResult;

    @Column(name = "langResult")
    private String langResult;

    @Column(name = "himResult")
    private String himResult;

    @Column(name = "bioResult")
    private String bioResult;

    @Column(name = "englResult")
    private String englResult;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getMathResult() {
        return mathResult;
    }

    public void setMathResult(String mathResult) {
        this.mathResult = mathResult;
    }

    public String getPhysResult() {
        return physResult;
    }

    public void setPhysResult(String physResult) {
        this.physResult = physResult;
    }

    public String getLangResult() {
        return langResult;
    }

    public void setLangResult(String langResult) {
        this.langResult = langResult;
    }

    public String getHimResult() {
        return himResult;
    }

    public void setHimResult(String himResult) {
        this.himResult = himResult;
    }

    public String getBioResult() {
        return bioResult;
    }

    public void setBioResult(String bioResult) {
        this.bioResult = bioResult;
    }

    public String getEnglResult() {
        return englResult;
    }

    public void setEnglResult(String englResult) {
        this.englResult = englResult;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", profile='" + profile + '\'' +
                ", mathResult='" + mathResult + '\'' +
                ", physResult='" + physResult + '\'' +
                ", langResult='" + langResult + '\'' +
                ", himResult='" + himResult + '\'' +
                ", bioResult='" + bioResult + '\'' +
                ", englResult='" + englResult + '\'' +
                '}';
    }
}
