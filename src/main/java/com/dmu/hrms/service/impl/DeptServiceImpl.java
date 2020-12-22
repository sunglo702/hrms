package com.dmu.hrms.service.impl;

import com.dmu.hrms.bean.Dept;
import com.dmu.hrms.bean.Emp;
import com.dmu.hrms.mapper.DeptMapper;
import com.dmu.hrms.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept getDeptById(Integer id) {
        return deptMapper.getDeptById(id);
    }

    @Override
    public List<Dept> getAllDepts() {
        return deptMapper.getAllDepts();
    }

    @Override
    public int deleteDeptById(Integer id) {
        return deptMapper.deleteDeptById(id);
    }

    @Override
    public int addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public int updateDept(Dept dept) {
        return deptMapper.updateDept(dept);
    }

    @Override
    public List<Emp> queryByDept(String name) {
        return deptMapper.queryByDept(name);
    }
}
