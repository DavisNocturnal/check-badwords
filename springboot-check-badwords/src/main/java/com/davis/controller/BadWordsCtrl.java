package com.davis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.davis.service.impl.BadWordServiceImpl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Words{
	String wordText;
}

@RestController
public class BadWordsCtrl {

	@Autowired
	BadWordServiceImpl badWordServiceImpl;
	@PostMapping("/api/v1/check")
	public ResponseEntity<Boolean> checkBadWords(@RequestBody Words word){
		boolean check = badWordServiceImpl.checkBadword(word.getWordText());
		
		return ResponseEntity.ok(check);
	}
}
