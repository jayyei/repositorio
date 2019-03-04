package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;
import mx.com.axity.services.facade.IbecaFacade;
import mx.com.axity.services.service.IbecaService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.swing.BakedArrayList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Component
public class becaFacade implements IbecaFacade {

    @Autowired
    private IbecaService becaService; //Inyeccion de dependencias

    @Autowired
    ModelMapper modelMapper; //Ya esta inyectada en el aplication de webb services

    @Override
    public int operation(int a, int b) {
        int c = this.becaService.sum(a,b);
        b = this.becaService.subtraction(c,a);
        int d = this.becaService.multiplication(b);
        return becaService.division(d);
    }

    @Override
    public List<UserTO> getAllUsers() {
       List<UserDO> userDOList = this.becaService.getAllUsers();

       Type userTOType = new TypeToken<List<UserTO>>() {}.getType();
       List<UserTO> result = this.modelMapper.map(userDOList, userTOType);
       return result;
    }

}
