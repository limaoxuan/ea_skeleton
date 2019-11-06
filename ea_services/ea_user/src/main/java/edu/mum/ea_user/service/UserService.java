package edu.mum.ea_user.service;

import edu.mum.ea_common.IdWorker;
import edu.mum.ea_common.JWTUtil;
import edu.mum.ea_user.dao.UserDAO;
import edu.mum.ea_user.entity.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private IdWorker idWorker;

    public User login(String email, String password) {
        User user =   userDAO.findByEmail(email);

        if (user != null && bCryptPasswordEncoder.matches(password,user.getPassword())){
            return user;
        }
        return null;
    }

    public void add(User user) {
        user.setId( idWorker.nextId()+"");
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userDAO.save(user);
    }

    public void sendEmail(String email) {
        String checkcode = RandomStringUtils.randomNumeric(6);
        System.out.println("Code: "+checkcode);
    }
}
