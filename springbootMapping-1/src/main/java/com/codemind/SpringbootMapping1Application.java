package com.codemind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codemind.model.Employee;
import com.codemind.model.Laptop;
import com.codemind.model.Mobile;
import com.codemind.repository.EmployeeRepository;
import com.codemind.repository.Laptoprepository;
import com.codemind.repository.MobileRepository;

@SpringBootApplication
public class SpringbootMapping1Application implements ApplicationRunner {
	@Autowired
	Laptoprepository laptoprepository;
	@Autowired
	MobileRepository mobileRepository;
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMapping1Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

//        Laptop l= new Laptop(4, "compaq", "cp200");
//        laptoprepository.save(l);
//        
//       Laptop lp= laptoprepository.findById(1).get();
//       System.out.println(lp.getId()+" "+lp.getName());

		Mobile m = new Mobile(12, "mi");
		this.mobileRepository.save(m);

		Employee e = new Employee();
		e.setEmpId(555);
		e.setName("Kirhan Batwal");
		employeeRepository.save(e);

	}

}
