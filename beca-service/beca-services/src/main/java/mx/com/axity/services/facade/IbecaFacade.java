package mx.com.axity.services.facade;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaFacade {
    int operation(int num1, int num2);

    List<UserTO> getAllUsers();
    void create(UserTO user);
    void delete(long id);
    void update (UserTO user);
    UserTO find (long id);

}
