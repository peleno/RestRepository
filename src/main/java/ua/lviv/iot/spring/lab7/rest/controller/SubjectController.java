package ua.lviv.iot.spring.lab7.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.spring.lab7.business.SubjectService;
import ua.lviv.iot.spring.lab7.rest.model.Subject;

@RequestMapping("/subjects")
@RestController
public class SubjectController {
	@Autowired
	SubjectService subjectService;

	@GetMapping
	public List<Subject> getSubjects() {
		return subjectService.findAll();
	}
}
