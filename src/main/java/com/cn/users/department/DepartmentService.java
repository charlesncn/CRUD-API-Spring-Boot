package com.cn.users.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> departmentDetails(){
        return departmentRepository.findAll();
    }

    public void addDepartment(Department department) {
        Optional<Department> departmentOptional = departmentRepository.findDepartmentByDepartmentName(department.getDepartmentName());
        if(departmentOptional.isPresent()){
            throw new IllegalStateException("Department exist");
        }
        departmentRepository.save(department);
    }

    public void deleteStudent(Long departmentID) {
        boolean exist = departmentRepository.existsById(departmentID);
        if(!exist){
            throw new IllegalStateException("Department with IT" + departmentID + "does not exist");
        }
        departmentRepository.deleteById(departmentID);

    }
}
