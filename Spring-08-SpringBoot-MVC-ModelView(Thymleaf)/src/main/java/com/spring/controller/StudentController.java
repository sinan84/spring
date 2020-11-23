package com.spring.controller;

import com.spring.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model) {
        model.addAttribute("name", "Ilker");
        model.addAttribute("gender", "Male");
        String subject = "Collections";
        model.addAttribute("subject", subject);

        //create some random studentID(0-100) and show it your interface
        Random r = new Random();
        int studentId = r.nextInt(101);
        model.addAttribute("id", studentId);

        //list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        model.addAttribute("numbers", numbers);


        //print your birthday
        LocalDate birthday = LocalDate.now().minusYears(42);
        model.addAttribute("birthday", birthday);

        Student student = new Student(1, "Merry", "Dgdmr");
        model.addAttribute("student", student);

        return "student/welcome";
    }

    @GetMapping("/register")
    public String homePage2() {

        return "student/register";
    }
}
