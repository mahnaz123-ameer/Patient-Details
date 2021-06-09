package com.company;

public class patient {

    private  String name;
    private  int age;
    private Eye lefteye;
    private Eye righteye;
    private heart heart;
    private  stomach stomach;
    private  skin skin;

    public patient(String name, int age, Eye lefteye, Eye righteye, com.company.heart heart,
                   com.company.stomach stomach, com.company.skin skin) {
        this.name = name;
        this.age = age;
        this.lefteye = lefteye;
        this.righteye = righteye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Eye getLefteye() {
        return lefteye;
    }

    public void setLefteye(Eye lefteye) {
        this.lefteye = lefteye;
    }

    public Eye getRighteye() {
        return righteye;
    }

    public void setRighteye(Eye righteye) {
        this.righteye = righteye;
    }

    public com.company.heart getHeart() {
        return heart;
    }

    public void setHeart(com.company.heart heart) {
        this.heart = heart;
    }

    public com.company.stomach getStomach() {
        return stomach;
    }

    public void setStomach(com.company.stomach stomach) {
        this.stomach = stomach;
    }

    public com.company.skin getSkin() {
        return skin;
    }

    public void setSkin(com.company.skin skin) {
        this.skin = skin;
    }
}


