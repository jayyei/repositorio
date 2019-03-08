package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.LoginTO;
import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.LoginDO;
import mx.com.axity.model.UserDO;
import mx.com.axity.services.facade.IbecaFacade;
import mx.com.axity.services.service.IbecaService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.List;

@Component
public class becaFacade implements IbecaFacade {

    @Autowired
    private IbecaService becaService; //Inyeccion de dependencias beca service es el objeto del cual podemos obtener
                                        //Los metodos de becaServiceImpl

    @Autowired
    ModelMapper modelMapper; //Ya esta inyectada en el aplication de webb services

    @Override
    public int operation(int a, int b) {
        int c = this.becaService.sum(a, b);
        b = this.becaService.subtraction(c, a);
        int d = this.becaService.multiplication(b);
        return becaService.division(d);
    }

    @Override
    public List<UserTO> getAllUsers() {
        List<UserDO> userDOList = this.becaService.getAllUsers();

        Type userTOType = new TypeToken<List<UserTO>>() {
        }.getType();

        List<UserTO> result = this.modelMapper.map(userDOList, userTOType);
        return result;
    }

    @Override
    public void create(UserTO user) {
        Type userDOType = new TypeToken<UserDO>() {}.getType();
        UserDO result = this.modelMapper.map(user, userDOType);
        this.becaService.create(result);
    }
    public void delete(long id) {
         this.becaService.delete(id);
    }

    @Override
    public void update(UserTO user) {
        Type userDOType = new TypeToken<UserDO>() {}.getType();
        UserDO result = this.modelMapper.map(user, userDOType);
        UserDO check = this.becaService.find(user.getId());
        //result = this.becaService.find(user.getId());
        this.becaService.update(result);
    }

    @Override
    public UserTO find(long id) {
       UserDO user = this.becaService.find(id);
       Type userTOtype = new TypeToken<UserTO>() {}.getType();
       UserTO result = this.modelMapper.map(user, userTOtype);
       return result;
    }

    @Override
    public LoginTO findLogin(long id, String password) {
        LoginDO user = this.becaService.findLogin(id,password);
        Type loginTOtype = new TypeToken<LoginTO>() {}.getType();
        LoginTO result = this.modelMapper.map(user, loginTOtype);
        return result;
    }

    @Override
    public void createLogin(LoginTO user) {
        Type loginDOType = new TypeToken<LoginDO>() {}.getType();
        LoginDO result = this.modelMapper.map(user, loginDOType);
        this.becaService.createLogin(result);
    }

    @Override
    public void updateLogin(LoginTO user) {
        Type loginDOType = new TypeToken<LoginDO>() {}.getType();
        LoginDO result = this.modelMapper.map(user, loginDOType);
        //LoginDO check = this.becaService.findLogin(user.getId());
        //result = this.becaService.find(user.getId());
        this.becaService.updateLogin(result);
    }
    @Override
    public void deleteLogin(long id) {
        this.becaService.deleteLogin(id);
    }




}


