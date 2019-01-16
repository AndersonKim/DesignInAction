package com.design.behavior.template_method;

import com.design.behavior.template_method.aid.ABCVerifyService;
import com.design.behavior.template_method.aid.AbstractVerifyService;
import com.design.behavior.template_method.aid.BOCVerifyService;
import com.design.behavior.template_method.prototype.AbstractSort;
import com.design.behavior.template_method.prototype.ConcreteSort;
import com.design.behavior.template_method.prototype.DesSort;
import org.junit.Test;

/**
 * edited by AndersonKim
 * at 2019/1/16
 */
public class TemplateTest {

    @Test
    public void testProtoTypeTemplate(){
        int [] array={ 10, 32, 1, 9, 5, 7, 12, 0, 4, 3 };
        AbstractSort s=new ConcreteSort();
        s.showSortResult(array);
        AbstractSort des=new DesSort();
        des.showSortResult(array);
    }
    @Test
    public void testAidTemplate(){
        String sendData="send msg";
        String receiveData="received msg";
        AbstractVerifyService Boc=new BOCVerifyService();
        Boc.postDataToVerify(sendData);
        Boc.receiveDataFromVerify(receiveData);

        AbstractVerifyService Abc=new ABCVerifyService();
        Abc.postDataToVerify(sendData);
        Abc.receiveDataFromVerify(receiveData);
    }
}
