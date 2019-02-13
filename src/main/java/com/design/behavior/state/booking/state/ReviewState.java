package com.design.behavior.state.booking.state;

import com.design.behavior.state.booking.AbstractState;
import com.design.behavior.state.booking.Context;
import com.design.behavior.state.booking.StateEnum;

/**
 * edited by AndersonKim
 * at 2019/2/13
 */
public class ReviewState extends AbstractState {


    @Override
    public void makePriceEvent(Context context) {
        context.setState(new PublishState());
    }

    public String getCurrentState() {
        return StateEnum.REVIEWED.getValue();
    }

}