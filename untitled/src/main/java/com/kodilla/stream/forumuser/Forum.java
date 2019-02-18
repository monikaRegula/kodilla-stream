package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

   private final List<ForumUser> theList = new ArrayList<>();

    public Forum() {
        theList.add(new ForumUser(001,"John",'M',1,1990,10,10));
        theList.add(new ForumUser(002,"George",'M',10,1991,10,10));
        theList.add(new ForumUser(003,"Samuel",'M',0,2009,10,10));
        theList.add(new ForumUser(004,"Sally",'F',0,2000,10,10));
        theList.add(new ForumUser(005,"Dona",'F',5,2005,10,10));
        theList.add(new ForumUser(006,"Jessica",'F',18,1993,10,10));
    }


    public List<ForumUser> getTheList() {
        return theList;
    }

}
