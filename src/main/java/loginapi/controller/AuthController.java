package loginapi.controller;

import loginapi.entity.UserDataTable;
import loginapi.model.UserData;
import loginapi.service.UserDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserDataService userDataService;

    @PostMapping("/create-user")
    public UserDataTable createUser(@RequestBody UserData userData){
//        UserDataTable savedUserData = userDataService.createUserService(userData);
        return userDataService.createUserService(userData) ;
    }


}