package com.spartaglobal.jackson;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;


import java.time.LocalDate;

public class Cat {


    private String name;
    @JsonDeserialize(using = LocalDateDeserializer.class) // Json String to Object
    @JsonSerialize(using = LocalDateSerializer.class) // Object to Json String
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    private int priority;

    public Cat(String name, LocalDate dob, int priority) {
        this.name = name;
        this.dob = dob;
        this.priority = priority;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", priority=" + priority +
                '}';
    }
}
