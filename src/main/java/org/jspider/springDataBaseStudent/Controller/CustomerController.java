package org.jspider.springDataBaseStudent.Controller;

import org.jspider.springDataBaseStudent.Domian.Customer;
import org.jspider.springDataBaseStudent.Domian.Staff;
import org.jspider.springDataBaseStudent.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;
    @GetMapping("/customer")
    public List<Customer> getallCustomer()
    {
        return service.getAllCustomer();
    }
    @PutMapping("/customerUpdate")
    public void updateCustomer(@RequestBody Customer customer)
    {
        service.updateCustomer(customer);
    }
    @PostMapping("/customer")
    public void addNewCustomer(@RequestBody Customer customer)
    {
        service.addNewCustomer(customer);
    }
    @DeleteMapping("/customer/{id}")
    public void deleteByCId(@PathVariable(value = "id")int id)
    {
        service.deleteByCId(id);
    }
}