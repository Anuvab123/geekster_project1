package com.geekster.todo.service;

import com.geekster.todo.model.User;

import java.util.ArrayList;
import java.util.List;


public class UserService {

    List<User> userList = new ArrayList<>();
    public String saveUser(User user){


        this.userList.add(user);
        return "Saved user " + user.getFirstName();
    }

   public List<User> getUser(String firstName) {

        List<User> requiredUser = new ArrayList<>();

      if(null != firstName){
           for(User user : userList){
               if(user.getFirstName().equals(firstName)){
                   requiredUser.add(user);
                   return requiredUser;
               }
           }
       }
      return userList;
   }
}
