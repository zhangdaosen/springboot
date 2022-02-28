package com.helloword.dao;

import com.helloword.pojo.Department;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DepartmentDao {
    private static Map<Integer, Department> deprecateds = null;

    static {
        deprecateds = new HashMap<Integer,Department>();
        deprecateds.put(1001,new Department(1001,"数学部"));
        deprecateds.put(1002,new Department(1002,"市场部"));
        deprecateds.put(1003,new Department(1003,"教研部"));
        deprecateds.put(1004,new Department(1004,"运营部"));
        deprecateds.put(1005,new Department(1005,"后勤部"));
    }


    //获得都有部门数据
    public Collection<Department> getDepartments(){
        return deprecateds.values();
    }

    //根据Id查询部门
    public Department getDepartmentById(Integer id){
        return deprecateds.get(id);
    }
}
