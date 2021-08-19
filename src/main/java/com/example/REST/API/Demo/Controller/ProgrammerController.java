package com.example.REST.API.Demo.Controller;

import com.example.REST.API.Demo.Programmer;
import com.example.REST.API.Demo.dao.ProgrammerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProgrammerController {

    @Autowired
    ProgrammerRepo repo;

    @PostMapping("/programmer")
    public Programmer addProgrammer(@RequestBody Programmer programmer){
        repo.save(programmer);
        return programmer;
    }
    @GetMapping("/programmers")
    public List<Programmer> getProgrammers(){
        return repo.findAll();
    }

    @GetMapping("/programmer/{pid}")
    public Optional<Programmer> getProgrammer(@PathVariable int pid){
        return repo.findById(pid);
    }

    @DeleteMapping("/programmer/{pid}")
    public String deleteProgrammer(@PathVariable int pid){
        Programmer p = repo.getById(pid);
        repo.delete(p);
        return "Deleted..";
    }

    @PutMapping("/programmer")
    public Programmer saveOrUpdateProgrammer(@RequestBody Programmer programmer){
        repo.save(programmer);
        return programmer;
    }
}
