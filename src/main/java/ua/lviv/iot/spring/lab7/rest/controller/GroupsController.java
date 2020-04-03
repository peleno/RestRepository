package ua.lviv.iot.spring.lab7.rest.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.spring.lab7.business.GroupService;

import ua.lviv.iot.spring.lab7.rest.model.Group;
@RequestMapping("/groups")
@RestController
public class GroupsController {
	@Autowired
	private GroupService groupService;
	@GetMapping
	public List<Group> getGroups() {
		return groupService.findAll();
	}

}
