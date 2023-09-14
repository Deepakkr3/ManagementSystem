package com.manegment.geekstrTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIs {
    @Autowired
    List<User> myUser;
    /*addUser
getUser/{userid}
getAllUser
updateUserInfo
deleteUser*/
    @PostMapping("getUser")
    public String addusers(@RequestBody User newUser)
    {
        myUser.add(newUser);
        return " user has been added";
    }
    @GetMapping("getAllUser")
    public  List<User> getall()
    {
      return myUser;
    }
    @GetMapping("user/userId/{id}/")

    public User getUserById(@PathVariable int id)
    {
        for(User ui:myUser)
        {
            if(ui.getUserId()==id)
            {
                return ui;
            }
        }
        System.out.print("not matched userId");
        return null;
    }
    @PutMapping("updateUserInfo/Id/{id}/ph/{phno}")
    public String update( @PathVariable int id,@PathVariable String phno)
    {
        for(User ui:myUser)
        {
            if(ui.getUserId()==id)
            {
                ui.setMobNo(phno);
                return "phon number has been changed";
            }
        }
       return "plese enter vailid user id";
    }

    @DeleteMapping("deleteUser/Id/{id}/id")
    public String deleteUser(@PathVariable int id)
    {
        for(User ui:myUser)
        {
            if(ui.getUserId()==id)
            {
               myUser.remove(ui);
                return "deleted !!";
            }
        }
        return "plese enter right id ";
    }


}
