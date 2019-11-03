package com.essa.EssaApp.Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER_VIEW", schema = "ZOBI")
public class CustomerView {

    @Id
    private long id;
    private Timestamp created_date;
    private String email;
    private String name;

    @Basic
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CREATED_DATE")
    public Timestamp getCreatedDate() {
        return created_date;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.created_date = createdDate;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerView that = (CustomerView) o;
        return id == that.id &&
              //  Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(email, that.email) &&
                Objects.equals(name, that.name);
    }

//    @Override
//    public int hashCode() {
//
//        return Objects.hash(id, createdDate, email, name);
//    }
}
