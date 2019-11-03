package com.essa.EssaApp.DTO;

import java.sql.Timestamp;

public class CustomerViewDTO {

    private long id;
    private Timestamp createdDate;
    private String email;
    private String name;
    private String dateFrom;
    private String dateTill;

    public CustomerViewDTO() {
    }

    public CustomerViewDTO(long id, Timestamp createdDate, String email, String name, String dateFrom, String dateTill) {
        this.id = id;
        this.createdDate = createdDate;
        this.email = email;
        this.name = name;
        this.dateFrom = dateFrom;
        this.dateTill = dateTill;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTill() {
        return dateTill;
    }

    public void setDateTill(String dateTill) {
        this.dateTill = dateTill;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
