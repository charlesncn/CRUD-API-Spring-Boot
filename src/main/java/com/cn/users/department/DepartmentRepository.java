package com.cn.users.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

//    @Query("SELECT d FROM Department d WHERE d.departmentName = ?1")
//    List<Department> findDepartmentByDepartmentName(String departmentName);
    Optional<Department> findDepartmentByDepartmentName(String departmentName);
}
