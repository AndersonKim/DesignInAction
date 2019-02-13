package com.design.behavior;

import com.design.behavior.state.booking.Context;
import com.design.behavior.state.booking.state.PublishState;
import org.junit.Test;

/**
 * edited by AndersonKim
 * at 2019/2/13
 */
public class StateTest {
    @Test
    public void testProtoTypeStrategy(){
        Context context = new Context();
        context.setState(new PublishState());
        //publish --> not pay
        context.acceptOrderEvent(context);
        //not pay --> paid
        context.payOrderEvent(context);
        context.feedBackEvent(context);
        // 失败
        //context.checkFailEvent(context);
    }
}
