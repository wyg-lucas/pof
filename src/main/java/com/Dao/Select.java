package com.Dao;

import com.Model.Course;
import com.Model.Student;
import com.Model.Teacher;

public interface Select {
    public Student SelectStudent(String name);
    public Student SelectStudent(int id);
    public Student[] SelectStudent(Course course);

    public String getNormalScore(Student student ,Course course);
    public String getFinalScore(Student student,Course course);
    public String getGroup(Student student,Course course);

    public Teacher[] findMaterials(String status); //搜索所有status状态（如待审核）的材料，返回材料对应的教师（没有审核的教师）
    public Teacher[] findPapers(String status); // 同上 论文



}
