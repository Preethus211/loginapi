package loginapi.repository;

import loginapi.entity.UserDataTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepo extends JpaRepository<UserDataTable,Integer> {
}
