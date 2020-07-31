package com.intocables.rulesly.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intocables.rulesly.dto.UserPunishDto;
import com.intocables.rulesly.service.UserPunishService;
import com.intocables.rulesly.service.exception.RuleslyException;
import com.intocables.rulesly.service.message.RuleslyResponse;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/31574849548976465468764002013123411/")
public class UserPunishRestController {
	
	@Autowired
	UserPunishService _UserPunishService;
	
	@GetMapping(value="Gaaaaaa", produces = MediaType.APPLICATION_JSON_VALUE)
	public RuleslyResponse<List<UserPunishDto>> readGetUserPunish() throws RuleslyException, ParseException{
		return new RuleslyResponse<>("Succes", String.valueOf(HttpStatus.OK), "OK",
				_UserPunishService.findAllUserPunish());
	}
}
