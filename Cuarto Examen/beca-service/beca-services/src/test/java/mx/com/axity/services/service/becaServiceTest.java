package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.LoginDO;
import mx.com.axity.model.UserDO;
import mx.com.axity.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.NoSuchElementException;

public class becaServiceTest extends BaseTest {
    @Test
    public void shouldReturnTheSumOfTwoNumbers(){
        int num1 = 5;
        int num2 = 10;
        int result = this.becaService.sum(num1,num2);
        Assert.assertEquals(15, result);
    }

    @Test
    public void shouldReturnTheRestOfTwoNumbers(){
        int num1 = 5;
        int num2 = 10;
        int result = this.becaService.subtraction(num1,num2);
        Assert.assertEquals(-5, result);
    }
    @Test
    public void shouldReturnTheMultiplicationOfTwoNumbers(){
        int num1 = 10;
        int result = this.becaService.multiplication(num1);
        Assert.assertEquals(40,result);
    }

    @Test
    public void updateExisteRegistro(){
        UserDO userDO= becaService.find(7L);
        Assert.assertTrue(userDO!=null);
        Assert.assertTrue(new Long(7).equals(userDO.getId()));
        Assert.assertTrue("Javier".equals(userDO.getName()));
    }

    @Test
    public void updatSieExisteRegistro(){
        try{
            UserDO userDO= becaService.find(2L);
            Assert.assertTrue(true);
        }catch(NoSuchElementException e){
            Assert.assertTrue(false);
        }
    }

}


