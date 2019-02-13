package com.design.behavior.state.booking.state;

import com.design.behavior.state.booking.AbstractState;
import com.design.behavior.state.booking.Context;
import com.design.behavior.state.booking.StateEnum;

/**
 * edited by AndersonKim
 * at 2019/2/13
 */
public class GenerateState extends AbstractState {


    public void checkEvent(Context context) {
        context.setState(new ReviewState());
    }

    public void checkFailEvent(Context context) {
        context.setState(new FeedBackState());
    }

    public String getCurrentState() {
        return StateEnum.GENERATE.getValue();
    }

}
