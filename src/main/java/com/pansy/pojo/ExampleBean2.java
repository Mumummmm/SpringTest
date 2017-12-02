package com.pansy.pojo;

import java.beans.ConstructorProperties;

public class ExampleBean2 {
    private int years;
    private String ultimateAnswer;

    @ConstructorProperties({"years", "ultimateAnswer"})
    public ExampleBean2(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }
}
