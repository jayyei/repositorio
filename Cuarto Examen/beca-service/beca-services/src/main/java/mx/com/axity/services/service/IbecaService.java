package mx.com.axity.services.service;

import mx.com.axity.commons.to.LoginTO;
import mx.com.axity.model.LoginDO;
import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaService {
      int sum(int sum1, int sum2);
      int subtraction(int sum3, int sum1);
      int division(int sum2);
      int multiplication(int sum4);
     List<UserDO> getAllUsers();
      void create(UserDO user);
      void delete (long id);
      void update (UserDO user);
      UserDO find (long id);

    LoginDO findLogin (long id, String password);
    void createLogin(LoginDO user);
    void updateLogin (LoginDO user);
    void deleteLogin (long id);
}
