/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author grom6
 */
public class PartTimeStudent extends Student_W{
    
    private int numCourses;

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    public PartTimeStudent(String studentID, String studentName, int numCourses){
        super(studentID, studentName);
        this.numCourses = numCourses;
    }
    
}
