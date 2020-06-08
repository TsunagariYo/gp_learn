package com.edu.singletonpattern;

public enum RejectEnumSingleton {
    INSTANCE;

    public static RejectEnumSingleton getInstance() {
        return INSTANCE;
    }

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
