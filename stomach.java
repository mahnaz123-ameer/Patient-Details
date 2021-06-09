package com.company;

public class stomach extends  Organ{

    private boolean isEmpty;

    public stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void details() {
        super.details();

        if(this.isEmpty()){
            System.out.println("Please eat");
        }
        else {
            System.out.println("petuuu full");
        }
    }

    public void digest(){
        System.out.println("starts digesting.........");
    }
    public boolean isEmpty() {
        return isEmpty;

    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
