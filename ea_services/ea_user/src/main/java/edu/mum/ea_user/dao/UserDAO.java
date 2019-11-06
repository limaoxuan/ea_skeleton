package edu.mum.ea_user.dao;

import edu.mum.ea_user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User,String>, JpaSpecificationExecutor<User> {
    public User findByEmail(String email);
}
