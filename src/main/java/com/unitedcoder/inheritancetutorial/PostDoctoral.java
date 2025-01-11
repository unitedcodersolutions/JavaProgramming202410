package com.unitedcoder.inheritancetutorial;

import java.util.List;

public class PostDoctoral extends DoctorStudent{
    private String workPlace;

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public PostDoctoral(long studentNumber, String firstName, String lastName, String className, int age, String birthday, String major, String address, String advisorName, String researchProject, String workPlace) {
        super(studentNumber, firstName, lastName, className, age, birthday, major, address, advisorName, researchProject);
        this.workPlace = workPlace;
    }

    public PostDoctoral(long studentNumber, String firstName, String lastName, String className, int age, String birthday, String major, String address, String advisorName, String researchProject, String thesisTopic, List<String> publications, String workPlace) {
        super(studentNumber, firstName, lastName, className, age, birthday, major, address, advisorName, researchProject, thesisTopic, publications);
        this.workPlace = workPlace;
    }
}
