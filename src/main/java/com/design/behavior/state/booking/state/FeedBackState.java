package com.design.behavior.state.booking.state;

import com.design.behavior.state.booking.AbstractState;
import com.design.behavior.state.booking.StateEnum;

/**
 * edited by AndersonKim
 * at 2019/2/13
 */
public class FeedBackState extends AbstractState {
    public String getCurrentState() {
        return StateEnum.FEED_BACKED.getValue();
    }
}
