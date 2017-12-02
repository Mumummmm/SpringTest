package com.pansy.pojo;

public class ExampleBean4 {
    private AnotherBean beanOne;
    private YetAnotherBean beanTwo;
    private int i;

    private ExampleBean4() {
    }

    private ExampleBean4(AnotherBean beanOne, YetAnotherBean beanTwo, int i) {
        this.beanOne = beanOne;
        this.beanTwo = beanTwo;
        this.i = i;
    }

    public static ExampleBean4 createInstance(AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
        ExampleBean4 eb = new ExampleBean4(anotherBean, yetAnotherBean, i);
        return eb;
    }
}
