package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.StudRepo;
import com.example.model.Student;

@RestController
@RequestMapping("/stud")
public class StudController {
	
	public StudController() {
		System.out.println("StudController().............");
	}
	@RequestMapping("/")
	public String getHealth() {
		return "<B>OK </B>  Student Application ________UP ";
	}

	@GetMapping("/getAll")
	public@ResponseBody List<Student> getAllStud() {
		return StudRepo.getAllStud();
	}
	@GetMapping("/getStudById/{id}")
	public@ResponseBody Student getAllStud(@PathVariable("id") int id) {
		Map<Integer, Student>slist=StudRepo.getAllStuds();
		Student stud=new Student();
		if(slist.containsKey(id)) 
			stud=slist.get(id);
		return stud;
	}
	@PostMapping("/addStud")
	public @ResponseBody List<Student> addStud(@RequestBody List<Student> stud){
		List<Student>newSList= new ArrayList<Student>();
		newSList.addAll(stud);
		return newSList;
		
	}
}
