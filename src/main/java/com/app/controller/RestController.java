
package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Employee;
import com.app.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class RestController {

	//call service layer
	@Autowired
	private IEmployeeService service;//has-a

	//4. Save data Based On requestBody save
	@PostMapping("/save")
	public ResponseEntity<?> saveData(@RequestBody Employee u){

		service.saveEmployee(u);

		return new ResponseEntity<String>("employee '"+ u.getEmpId()+"'saved ",HttpStatus.OK);
	}

	// 1.Get all data in Based All
	@GetMapping("/all")
	public ResponseEntity<?> getAll(){
		ResponseEntity<?> response=null;
		List<Employee> emp=service.getAllEmployees();

		//		return new ResponseEntity<List<Uom>>(uoms,HttpStatus.OK);
		//if no data
		if(emp!=null && !emp.isEmpty()) {

			//pass body and hhtp resp
			response=new ResponseEntity<List<Employee>>(emp,HttpStatus.OK);

		}else {
			//if no data display show to end user massge
			return new ResponseEntity<String>(" No employee data Found..",HttpStatus.OK);


		}
		return response;
	}
	//2. get data By One on PostMan {} indicate var id at runtime
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getOne(@PathVariable Integer id){

		ResponseEntity<?> ent=null;
		//call service 
		Employee emp=service.findeEmployeeById(id);
		if(emp!=null ) {
			ent= new ResponseEntity<Employee>(emp,HttpStatus.OK);

		}
		else {
			ent= new ResponseEntity<String>("Uom "+id+" Data not Found",
					HttpStatus.BAD_REQUEST);

		}
		return ent;
	}
	//3. delete 1 data bsed id {}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteOne(@PathVariable  Integer id){

		ResponseEntity<String> re=null;
		//call service
		try {
			service.deleteEmployee(id);
			re= new ResponseEntity<String>("employee "+id+" Deleted..",HttpStatus.OK);

		}catch (Exception e) {

			re= new ResponseEntity<String>("employee "+id+"Data not Found ..",
					HttpStatus.BAD_REQUEST);

		}

		return re;

	}
	//5. update one data based on pk Id
	@PutMapping("/update")
	public ResponseEntity<String> updateData(@RequestBody Employee u){
		ResponseEntity<String> re=null;
		try {
			//call service
			service.updateEmployee(u);;
			re= new ResponseEntity<String>("employee '"+ u.getEmpId()+"'sucessufully Updated",HttpStatus.OK);


		}catch(Exception e) {

			re= new ResponseEntity<String>("Employee '"+ u.getEmpId()+"' is Not Not found",
					HttpStatus.BAD_REQUEST);
		}
		return re;
	}

}//class










 /* @Controller
public class RestController {
 
 @Autowired
 private IEmployeeService customerService;
 
 @GetMapping("/customer")
 public List<Employee> getAllCustomer(){
  return customerService.getAllEmployees();
 }
 
 @GetMapping("/customer/{customerId}")
 public Employee getCustomerById(@PathVariable int customerId) {
  return customerService.findeEmployeeById(customerId);
 }
}
 @PostMapping("/customer/")
 public ResponseEntity<Void> addCustomer(@RequestBody Employee newCustomer, 
		 UriComponentsBuilder builder){}
//	 Employee customer = customerService.saveEmployee(newCustomer););
  
  if(customer == null) {
   return ResponseEntity.noContent().build();
  }
  
  HttpHeaders headers = new HttpHeaders();
  headers.setLocation(builder.path("/customer/{id}").buildAndExpand(customer.getId()).toUri());
  return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
 }
 
 @PutMapping("/customer/")
 public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
  Customer c = customerService.getCustomerById(customer.getId());
  
  if(c == null) {
   return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
  }
  
  c.setName(customer.getName());
  c.setEmail(customer.getEmail());
  c.setDescription(customer.getDescription());
  
  customerService.updateCustomer(c);
  return new ResponseEntity<Customer>(c, HttpStatus.OK);
 }
 
 @DeleteMapping("/customer/{customerId}")
 public ResponseEntity<Customer> deleteCustomer(@PathVariable int customerId){
  Customer c = customerService.getCustomerById(customerId);
  
  if(c == null) {
   return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
  }
  
  customerService.deleteCustomer(customerId);
  return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
 }*/
