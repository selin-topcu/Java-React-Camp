package com.company;

public class Main {

    public static void main(String[] args) {
    Student selin=new Student();
    selin.id=1;
    selin.firstName="Selin";
    selin.lastName="Dayıoğlu";
    selin.age=21;
    selin.mail="slndayioglu@gmail.com";
    selin.password="1234";
    selin.classNo="4";
    UserManager.add(selin);
    StudentManager.studentAdd();

    Instructor kerim=new Instructor();
    kerim.id=1;
    kerim.firstName="Kerim";
    kerim.lastName="Arslan";
    kerim.age=48;
    kerim.mail="kerimarslan@gmail.com";
    kerim.password="1234";
    kerim.departmant="Kimya Öğretmenliği";
    kerim.salary=5500;
    UserManager.add(kerim);
    InstructorManager.instructorAdd();
    }
}
