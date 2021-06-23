package com.api.practice.bootrestpractice.services;
import com.api.practice.bootrestpractice.Entity.User;

import org.springframework.stereotype.Controller;

import java.util.*;

@Controller
public class UserService
{
   private static List<User> list=new ArrayList<>();

   static
   {
   list.add(new User(12,"AJ",23,"Pune","9834321826"));
   list.add(new User(13,"AB",26,"Mumbai","8830453928"));
   }

   public List<User> getAllUsers()
   {
       return list;
   }

   public User getUserById(int id)
   {
       User User=null;
       try{
       User=list.stream().filter(e->e.getId()==id).findFirst().get();
       }
       catch(Exception e)
       {
          e.printStackTrace();
       }
       return User;
   }

   public void addUser(User b)
   {
       list.add(b);
   }

}
