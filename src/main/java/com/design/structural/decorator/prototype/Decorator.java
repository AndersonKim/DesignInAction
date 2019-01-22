package com.design.structural.decorator.prototype;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public abstract class Decorator extends Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
