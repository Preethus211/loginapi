package loginapi.service;

import loginapi.entity.UserDataTable;
import loginapi.model.UserData;
import loginapi.repository.UserDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataService {

    @Autowired
    UserDataRepo userDataRepo;

    public UserDataTable createUserService(UserData userData){

        // to store data in db
        UserDataTable userDataTable = new UserDataTable();
        userDataTable.setName(userData.getName());
        userDataTable.setEmail(userData.getEmail());
        userDataRepo.save(userDataTable);

        // get the store data in db to validate what we saved



        return userDataTable;
    }

}
