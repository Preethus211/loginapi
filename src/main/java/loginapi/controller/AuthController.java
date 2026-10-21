package loginapi.controller;

import loginapi.entity.UserDataTable;
import loginapi.model.UserData;
import loginapi.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    UserDataService userDataService;

    @PostMapping("/create-user")
    public UserDataTable createUser(@RequestBody UserData userData){
        UserDataTable savedUserData = userDataService.createUserService(userData);
        return savedUserData ;
    }


}