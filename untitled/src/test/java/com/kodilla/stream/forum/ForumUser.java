package com.kodilla.stream.forum;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ForumUser {


    private final String userName;
    private final String realName;
    private final String location;
    private final Set<ForumUser> friends = new HashSet<>();


    public ForumUser(final String userName,final String realName,final String location) {
        this.userName = userName;
        this.realName = realName;
        this.location = location;
    }

    public String getUserName() { return userName; }

    public String getRealName() { return realName; }

    public String getLocation() { return location; }

    public Set<ForumUser> getFriends() { return friends; }


    public void addFriend(ForumUser user){
            friends.add(user);
    }


    public void removeFriend(ForumUser user){
        if (friends.contains(user)) friends.remove(user);
        else try {
            throw  new NoSuchFieldException("There is no user like this in the list");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){

        if (this == o) return true;
        if (! (o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return userName.equals(forumUser.getUserName());

    }


    @Override
    public int hashCode(){
        return userName.hashCode();
    }


    public Set<String> getLocationsOfFriends(){
        return friends.stream()
                .map(friend -> friend.getLocation())
                .collect(Collectors.toSet());
    }


    public Set<String> getLocationsOfFriendsOfFriends() {
        return friends.stream()//uruchamiany jest strumień na kolekcji friends
                .flatMap(user -> user.getFriends().stream())// spłaszczenie strumienia
                //dla każdego usera pobiera liste przyjaciół
                //od teraz pracujemy na liście przyjaciół przyjaciół
                .filter(user -> user != this)//wykluczamy samego siebie
                .map(ForumUser::getLocation)//transformujemy strumień tak, że będą wypływać obiekty typu String a nie ForumUser
                .collect(Collectors.toSet());//złożenie strumienia wyjściowego w kolekcję typu Set
    }



}

