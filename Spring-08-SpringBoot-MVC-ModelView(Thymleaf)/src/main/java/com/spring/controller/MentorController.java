package com.spring.controller;

import com.spring.enums.Gender;
import com.spring.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @GetMapping("/list")
    public String showTable(Model model) {
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Merry", "Dgdmr", 28, Gender.FEMALE));
        mentorList.add(new Mentor("Yusuf", "Dgdmr", 1, Gender.MALE));
        mentorList.add(new Mentor("Ilker", "Dgdmr", 29, Gender.MALE));
        model.addAttribute("mentors", mentorList);

        return "mentor/mentor-list";
    }
}
