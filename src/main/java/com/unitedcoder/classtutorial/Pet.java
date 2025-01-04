package com.unitedcoder.classtutorial;

public class Pet {
    private String type;
    private boolean male;
    private String name;
    private String color;
    private String age;
    private double weight;
    private double height;
    private String breed;

    public Pet() {
    }

    public Pet(String type, boolean male, String name, String color, String age, double weight, double height, String breed) {
        this.type = type;
        this.male = male;
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.breed = breed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", male=" + male +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", breed='" + breed + '\'' +
                '}';
    }
}
