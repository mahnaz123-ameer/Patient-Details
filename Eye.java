package com.company;

public class Eye extends Organ{
    private String color;
    private double power;
    private boolean isopened;

    public Eye(String name, String medicalCondition, String color, double power, boolean isopened) {
        super(name, medicalCondition);
        this.color = color;
        this.power = power;
        this.isopened = isopened;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void details() {
        super.details();
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void open(){
        this.setIsopened(true);
        System.out.println(this.getName() + "Opened");
    }

    public void close(){
        this.setIsopened(false);
        System.out.println(this.getName() + "Closed");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsopened() {
        return isopened;
    }

    public void setIsopened(boolean isopened) {
        this.isopened = isopened;
    }
}
