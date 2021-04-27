package com.Dao;

import com.Model.*;

public interface Insert {
    public void InsertStudent(Student student);
    public void InsertCourse(Course course);
    public void InsertTeacher(Teacher teacher);
    public void InsertChooseLesson(Course course , Student student);
    public void InsertTeachLesson(Course course, Teacher teacher);
    public void setGroup(Student student,Course course,String groupName);
    public void setNormalScore(Course course , Student student,String nScore);
    public void setFinalScore(Course course, Student student ,String fScore);
    public void InsertMaterial(Materials materials);
    public void submitMaterial(Student student ,Teacher teacher ,Materials materials ,String status ,String log);
    public void InsertPaper(Paper paper);
    public void submitPaper(Student student,Teacher teacher,Paper paper ,String status,String log);

}
