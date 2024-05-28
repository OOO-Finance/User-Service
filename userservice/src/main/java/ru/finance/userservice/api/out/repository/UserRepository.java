package ru.finance.userservice.api.out.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.finance.userservice.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
