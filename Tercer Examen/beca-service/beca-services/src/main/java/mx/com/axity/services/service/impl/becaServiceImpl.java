package mx.com.axity.services.service.impl;

import mx.com.axity.model.LoginDO;
import mx.com.axity.model.UserDO;
import mx.com.axity.persistence.LoginDAO;
import mx.com.axity.persistence.UserDAO;
import mx.com.axity.services.service.IbecaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class becaServiceImpl implements IbecaService {

    static final Logger LOG = LogManager.getLogger(becaServiceImpl.class);

    @Autowired
    UserDAO userDAO; //Inyeccion de dependencias, con el objeto userDAO podemos acceder
                    //A los metodos de UserDao, que es hija de CrudRepository

    @Autowired
    LoginDAO loginDAO;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public int sum(int sum1, int sum2) {
        return sum1 + sum2;
    }

    @Override
    public int subtraction(int sum3, int sum1) {
        return sum3 - sum1;
    }

    @Override
    public int division(int sum2) {
        return sum2/4;
    }

    @Override
    public int multiplication(int sum4) {
        return sum4*4;
    }

    @Override
    public List<UserDO> getAllUsers() {
        return (List<UserDO>) this.userDAO.findAll();
    }

    @Override
    public void create(UserDO user) {
        this.userDAO.save(user);
    }

    @Override
    public void delete(long id) {
        this.userDAO.deleteById(id);
    }

    @Override
    public void update(UserDO user) {
        this.userDAO.save(user);
    }

    @Override
    public UserDO find(long id) {
      Optional <UserDO> user = userDAO.findById(id);
      return user.get();
    }

    @Override
    public LoginDO findLogin(long id, String password) {
        Optional <LoginDO> user = loginDAO.findById(id);
        if(user.get().getPassword().equals(password)){
            return user.get();}
            return null;
    }

    @Override
    public void createLogin(LoginDO user) {
        this.loginDAO.save(user);
    }

    @Override
    public void updateLogin(LoginDO user) {
        this.loginDAO.save(user);
    }

    @Override
    public void deleteLogin(long id) {
        this.loginDAO.deleteById(id);
    }



}
