package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Set;

public class ForumUser {


    private final Integer ID;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postAmount;


    public ForumUser(final Integer ID,final String name,final char sex,final int postAmount,final int year,final int month,final int day) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.postAmount = postAmount;
        this.dateOfBirth = LocalDate.of(year,month,day);
    }


    public Integer getID() { return ID; }

    public String getName() { return name; }

    public char getSex() { return sex; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }

    public int getPostAmount() { return postAmount; }


    @Override
    public String toString() {
        return "Forum User{" +
                "sex='" + sex + '\'' +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", yearOfBirth=" + dateOfBirth +
                ", Post Amount='" + postAmount + '\'' +
                '}';
    }




}
