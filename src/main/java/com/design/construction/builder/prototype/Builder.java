package com.design.construction.builder.prototype;

abstract class Builder {
    public abstract void setPart(String arg1, String arg2);
    public abstract Product getProduct();
}
