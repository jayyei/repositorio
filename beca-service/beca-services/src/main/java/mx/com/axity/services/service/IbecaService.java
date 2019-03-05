package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaService {
      int sum(int sum1, int sum2);
      int subtraction(int sum3, int sum1);
      int division(int sum2);
      int multiplication(int sum4);
     List<UserDO> getAllUsers();
      void storage(UserDO user);
}
