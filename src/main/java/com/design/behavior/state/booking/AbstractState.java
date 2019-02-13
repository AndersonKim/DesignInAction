package com.design.behavior.state.booking;

public abstract class AbstractState implements State {

    protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");

    public void checkEvent(Context context) {
        throw EXCEPTION;
    }

    public void checkFailEvent(Context context) {
        throw EXCEPTION;
    }

    public void makePriceEvent(Context context) {
        throw EXCEPTION;
    }

    public void acceptOrderEvent(Context context) {
        throw EXCEPTION;
    }

    public void notPeopleAcceptEvent(Context context) {
        throw EXCEPTION;
    }

    public void payOrderEvent(Context context) {
        throw EXCEPTION;
    }

    public void orderFailureEvent(Context context) {
        throw EXCEPTION;
    }

    public void feedBackEvent(Context context) {
        throw EXCEPTION;
    }
}
