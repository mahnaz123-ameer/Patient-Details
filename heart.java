package com.company;

public class heart extends  Organ{

    private int rate;

    public heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Heart Rate" +this.getRate());
    }


    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
