package Lesson2;

public class TeacherFactory {

    ITeacher instance;
    private TeacherFactory (){}

    void getTeacherInstance (){
        if(instance == null){
            instance = new JavaTeacher();
        }
    }




}
