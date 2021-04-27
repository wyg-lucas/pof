package com.Dao;

import com.Model.Course;
import com.Model.Materials;
import com.Model.Paper;
import com.Model.Student;

public interface Upadate {
    public void UpdatePaper(Paper paper,String newStatus,String newLog);//修改论文的审核状态和添加日志
    public void UpdateNormalScore(Student student, Course course,String newNormalScore);
    public void UpdateFinalScore(Student student,Course course,String newFinalScore);
    public void UpdateMaterial(Materials materials ,String newStatus,String newLog);//修改材料的审核状态和添加日志
}
