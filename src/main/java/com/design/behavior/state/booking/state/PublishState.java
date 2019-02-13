package com.design.behavior.state.booking.state;

import com.design.behavior.state.booking.AbstractState;
import com.design.behavior.state.booking.Context;
import com.design.behavior.state.booking.StateEnum;

/**
 * edited by AndersonKim
 * at 2019/2/13
 */

public class PublishState extends AbstractState {

    @Override
    public void acceptOrderEvent(Context context) {
        context.setState(new NotPayState());
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        context.setState(new FeedBackState());
    }

    public String getCurrentState() {
        return StateEnum.PUBLISHED.getValue();
    }
}
