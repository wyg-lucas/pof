package com.Dao;

import com.Model.*;

public interface Delete {
    public void DeleteStudent(Student student);
    public void DeleteCourse(Course course);
    public void DeleteTeacher(Teacher teacher);
    public void DeleteChooseLesson(Course course , Student student);
    public void DeleteTeachLesson(Course course, Teacher teacher);
    public void DeleteMaterial(Materials materials);
    public void DeletePaper(Paper paper);
}
