package com.codemind.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name="employee_table")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,
	generator = "my_table")
	@TableGenerator(name="my_table",
	table="minedb_sequence_table",
	pkColumnName = "seq_name",
	valueColumnName = "seq_value",
	pkColumnValue = "employye_seq_id",
	initialValue = 1,
	allocationSize = 1)
Integer EmpId;
String name;
public Employee(Integer empId, String name) {
	super();
	EmpId = empId;
	this.name = name;
}
public Employee() {
	
}
public Integer getEmpId() {
	return EmpId;
}
public void setEmpId(Integer empId) {
	EmpId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Employee [EmpId=" + EmpId + ", name=" + name + "]";
}



}
