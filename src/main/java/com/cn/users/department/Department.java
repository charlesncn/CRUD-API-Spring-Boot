package com.cn.users.department;


import javax.persistence.*;

@Entity
@Table
public class Department {

    @Id
    @SequenceGenerator(name = "department_sequence", sequenceName = "department_sequence", allocationSize = 1)
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "department_sequence")
    private Long id;
    private String departmentName;
    private String hod;
    private int numberOfWorkers;

    public Department() {
    }

    public Department(Long id, String departmentName, String hod, int numberOfWorkers) {
        this.id = id;
        this.departmentName = departmentName;
        this.hod = hod;
        this.numberOfWorkers = numberOfWorkers;
    }

    public Department(String departmentName, String hod, int numberOfWorkers) {
        this.departmentName = departmentName;
        this.hod = hod;
        this.numberOfWorkers = numberOfWorkers;
    }

    public Long getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getHod() {
        return hod;
    }

    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setHod(String hod) {
        this.hod = hod;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", hod='" + hod + '\'' +
                ", numberOfWorkers=" + numberOfWorkers +
                '}';
    }
}
