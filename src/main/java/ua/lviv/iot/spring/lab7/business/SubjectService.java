package ua.lviv.iot.spring.lab7.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.spring.lab7.dataaccess.SubjectRepository;
import ua.lviv.iot.spring.lab7.rest.model.Subject;
@Service
public class SubjectService {
	@Autowired
	private SubjectRepository subjectRepository;

	public List<Subject> findAll() {
		return subjectRepository.findAll();
	}
}
