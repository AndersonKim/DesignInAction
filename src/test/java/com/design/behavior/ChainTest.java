package com.design.behavior;

import com.design.behavior.chain_of_responsibility.manager.DeptManager;
import com.design.behavior.chain_of_responsibility.manager.FeeHandler;
import com.design.behavior.chain_of_responsibility.manager.GeneralManager;
import com.design.behavior.chain_of_responsibility.manager.ProjectManager;
import com.design.behavior.chain_of_responsibility.prototype.ConcreteHandler;
import com.design.behavior.chain_of_responsibility.prototype.Handler;
import org.junit.Test;

/**
 * edited by AndersonKim
 * at 2019/1/23
 */
public class ChainTest {
    @Test
    public void testPrototype(){
        Handler a=new ConcreteHandler();
        Handler b=new ConcreteHandler();
        a.setSuccessor(b);

        a.handleRequest();

        b.handleRequest();
    }

    @Test
    public void testManager(){
        FeeHandler project=new ProjectManager();
        FeeHandler dept=new DeptManager();
        FeeHandler gen=new GeneralManager();
        System.out.println(project.handleFeeRequest(4999));
        project.setSuccessor(dept);
        System.out.println(project.handleFeeRequest(4999));
        dept.setSuccessor(gen);
        System.out.println(project.handleFeeRequest(4999));
    }
}
