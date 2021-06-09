package com.company;

public class Organ{
    private String name;
    private String MedicalCondition;

    public Organ(String name, String medicalCondition) {
        this.name = name;
        MedicalCondition = medicalCondition;
    }

    public  void details(){
        System.out.println("Name" + this.getName());
        System.out.println("Medical-Condition" + this.getMedicalCondition());
    }
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getMedicalCondition() {

        return MedicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {

        MedicalCondition = medicalCondition;
    }
}
