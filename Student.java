/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

public class Student {
    private String idStudent;
    private String nameStudent;
    private float scoreStudent;
    private String addressStudent;
    private int yearStudent;
    private String rankStudent;

    // Constructor
    public Student(String idStudent, String nameStudent, float scoreStudent, String addressStudent, int yearStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.scoreStudent = scoreStudent;
        this.addressStudent = addressStudent;
        this.yearStudent = yearStudent;
        this.rankStudent = determineRank(scoreStudent);
    }

    // Getter and Setter methods
    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public float getScoreStudent() {
        return scoreStudent;
    }

    public void setScoreStudent(float scoreStudent) {
        this.scoreStudent = scoreStudent;
        this.rankStudent = determineRank(scoreStudent);
    }

    public String getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(String addressStudent) {
        this.addressStudent = addressStudent;
    }

    public int getYearStudent() {
        return yearStudent;
    }

    public void setYearStudent(int yearStudent) {
        this.yearStudent = yearStudent;
    }

    public String getRankStudent() {
        return rankStudent;
    }

    // Determine rank based on score
    private String determineRank(float score) {
        if (score < 5.0) return "Fail";
        if (score < 6.5) return "Medium";
        if (score < 7.5) return "Good";
        if (score < 9.0) return "Very Good";
        return "Excellent";
    }

    @Override
    public String toString() {
        return "Student ID: " + idStudent + ", Name: " + nameStudent + ", Address: " + addressStudent +
               ", Year: " + yearStudent + ", Score: " + scoreStudent + ", Rank: " + rankStudent;
    }
}
