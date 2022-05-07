package com.cn.users.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/department")
public class DepartmentController {

    private  final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> departmentDetails(){
        return departmentService.departmentDetails();
    }

    @PostMapping
    public void newDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    @DeleteMapping(path = "{departmentID}")
    public void removeDepartment(@PathVariable("departmentID") Long departmentID){
        departmentService.deleteStudent(departmentID);
    }
}
