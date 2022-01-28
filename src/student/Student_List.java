/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author grom6
 */
public class Student_List {
    public static void main(String[] args) {
        Student_W[] studentList = new Student_W[4];
        
        studentList[0] = new Student_W("s1", "Ronak Sheth");
        studentList[1] = new Student_W("s2", "John Doe");
        studentList[2] = new Student_W("s3", "James Tubbs");
        studentList[3] = new Student_W("s3", "Sonny Crockett");
        
        for (int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i].getStudentID() + ", " + studentList[i].getStudentName());
        }
    }
}
