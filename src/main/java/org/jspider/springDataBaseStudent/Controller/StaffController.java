package org.jspider.springDataBaseStudent.Controller;

import org.jspider.springDataBaseStudent.Domian.Staff;
import org.jspider.springDataBaseStudent.Service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffController {
    @Autowired
    private StaffService service;
    @GetMapping("/staff")
    public List<Staff>getallStaff()
    {
        return service.getAllStaff();
    }
    @PutMapping("/staffUpdate")
    public void updateStaff(@RequestBody Staff staff)
    {
        service.updateStaff(staff);
    }
    @PostMapping("/staff")
    public void addNewStaff(@RequestBody Staff staff)
    {
        service.addNewStaff(staff);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(value = "id")int id)
    {
        service.deleteById(id);
    }
}

