package mx.com.axity.services.facade;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.service.IbecaService;
import mx.com.axity.services.service.impl.becaServiceImpl;

import java.util.List;

public interface IbecaFacade {
    int operation(int num1, int num2);

    List<UserTO> getAllUsers();

}
