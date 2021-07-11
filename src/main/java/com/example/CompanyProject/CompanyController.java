package com.example.CompanyProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class CompanyController {

    @Autowired
    private  CompanyRepo companyRepo;
    @GetMapping("/")
    public String Welcome(){
        return "<html><body>"
                + "<h1>WELCOME</h1>"
                + "</body></html>";
    }
    @GetMapping("/company")
    public List<Company> getAllNotes()
    {
        return companyRepo.findAll();
    }
    @GetMapping("/company/{id}")
    public Optional<Company> getCompanyById(
            @PathVariable(value = "id") int id)
    {
        return companyRepo.findById(id);
    }
    @PostMapping("/company")
    @ResponseStatus(HttpStatus.CREATED)
    public Company addCompany(
            @RequestBody Company company)
    {
        return companyRepo.save(company);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(
            @PathVariable(value = "id") int id)
    {
        companyRepo.deleteById(id);
    }



}
