package com.design.behavior.state.booking.state;

import com.design.behavior.state.booking.AbstractState;
import com.design.behavior.state.booking.Context;
import com.design.behavior.state.booking.StateEnum;

/**
 * edited by AndersonKim
 * at 2019/2/13
 */
public class NotPayState extends AbstractState {
    public void payOrderEvent(Context context) {
        context.setState(new PaidState());
    }

    public void feedBackEvent(Context context) {
        context.setState(new FeedBackState());
    }

    public String getCurrentState() {
        return StateEnum.NOT_PAY.getValue();
    }
}
