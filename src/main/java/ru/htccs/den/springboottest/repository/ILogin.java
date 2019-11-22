package ru.htccs.den.springboottest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.htccs.den.springboottest.models.User;

@Repository
public interface ILogin extends CrudRepository<User, Long> {
    User findByUserName(String inLogin);
}
