package com.helloword.dao;

import com.helloword.pojo.Department;
import com.helloword.pojo.Employee;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    static {
        employees = new HashMap<Integer,Employee>();
        employees.put(1,new Employee(1,"小明","1104113465@qq.com",0,new Department(1001,"教学部"),new Date()));
        employees.put(1,new Employee(2,"小明1","1104113465@qq.com",0,new Department(1002,"市场部"),new Date()));
        employees.put(1,new Employee(3,"小明2","1104113465@qq.com",0,new Department(1003,"教研部"),new Date()));
        employees.put(1,new Employee(4,"小明3","1104113465@qq.com",0,new Department(1004,"运营部"),new Date()));
        employees.put(1,new Employee(5,"小明4","1104113465@qq.com",0,new Department(1005,"后勤部"),new Date()));
    }

    //查询所有的员工
    public Collection<Employee> getEmployees(){
        return employees.values();
    }

    //根据id查询员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    //增加员工
    private static Integer initId = 1006;

    public void save(Employee employee){

    }

}
