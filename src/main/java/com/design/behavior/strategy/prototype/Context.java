package com.design.behavior.strategy.prototype;

public class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyInterface(){
        strategy.algorithmInterface();
    }
}
