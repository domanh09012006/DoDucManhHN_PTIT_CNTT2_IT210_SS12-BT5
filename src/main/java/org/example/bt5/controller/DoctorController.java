package org.example.bt5.controller;

import org.example.bt5.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public String showDoctors(Model model) {
        model.addAttribute("danhSachBS", doctorService.getAllDoctors());

        return "index";
    }

    @GetMapping("/search")
    public String searchDoctor(@RequestParam String phone, Model model) {
        var doc = doctorService.findByPhone(phone);
        model.addAttribute("danhSachBS", doc != null ? java.util.List.of(doc) : java.util.List.of());
        return "index";
    }
}