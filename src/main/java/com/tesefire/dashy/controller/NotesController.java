package com.tesefire.dashy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api") // not @GetMapping here
public class NotesController {

    @GetMapping("/notes")
    public Map<String, String> notes() {
        Map<String, String> notes = new HashMap<>();
        notes.put("TODO:", "Prepare Clothes");
        notes.put("Reminder:", "Birthday Tomorrow");
        return notes;
    }
}
