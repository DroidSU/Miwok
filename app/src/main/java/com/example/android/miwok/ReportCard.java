package com.example.android.miwok;

public class ReportCard{
    private String englishGrade, computerGrade, mathsGrade;
    private String stu_name;

    /**
     * Constructor to set the values
     * @param name takes in the name of the student
     * @param english takes in the grade in english
     * @param computer takes in the grade in computer
     * @param maths takes in the grade in maths
     */
    public ReportCard(String name, String english, String computer, String maths){
        stu_name = name;
        englishGrade = english;
        computerGrade = computer;
        mathsGrade = maths;
    }
    /**
     * method to get the name of the student
     * @return
     */
    public String getStu_name() {
        return stu_name;
    }

    /**
     * method to get the grade in english
     * @return
     */
    public String getEnglishGrade() {
        return englishGrade;
    }

    /**
     *
     * @return the grade in maths
     */
    public String getMathsGrade() {

        return mathsGrade;
    }

    /**
     *
     * @return the grade in computer
     */
    public String getComputerGrade() {

        return computerGrade;
    }

    @Override
    public String toString() {
        return "-------ReportCard-----" +
                " englishGrade='" + englishGrade + '\'' +
                ", computerGrade='" + computerGrade + '\'' +
                ", mathsGrade='" + mathsGrade + '\'' +
                ", stu_name='" + stu_name + '\'' +
                '}';
    }
}
