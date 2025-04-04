package com.Student.RegistrationForm.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Student.RegistrationForm.dto.RegistrationDTO;
import com.Student.RegistrationForm.models.Registration;
import com.Student.RegistrationForm.service.RegistrationService;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    
    private final RegistrationService registrationService;
    
    public RegistrationController(RegistrationService registrationService) {
        super();
        this.registrationService = registrationService;
    }

    @GetMapping({"", "/"})
    public String getAllRegistrations(Model model) {
        List<Registration> registrations = registrationService.getAllRegistrations();
        model.addAttribute("registrations", registrations);
        return "registrations";
    }
    
    @GetMapping("/register")
    public String registerForm(Model model) {
        RegistrationDTO registrationDTO = new RegistrationDTO();
        model.addAttribute("registrationDTO", registrationDTO);
        return "register";
    }

    @PostMapping("/register")
    public String saveRegistration(@ModelAttribute RegistrationDTO registrationDTO) {
        registrationService.saveRegistration(registrationDTO);
        return "redirect:/";
    }
    
    @GetMapping("/edit-registration")
    public String getRegistration(@RequestParam Long id, Model model) {
        Registration registration = registrationService.getRegistration(id);
        RegistrationDTO registrationDTO = new RegistrationDTO();
        registrationDTO.setName(registration.getName());
        registrationDTO.setAge(registration.getAge());
        registrationDTO.setEmail(registration.getEmail());
        registrationDTO.setPhone(registration.getPhone());
        registrationDTO.setPassword(registration.getPassword());
        registrationDTO.setDob(registration.getDob());
        registrationDTO.setCity(registration.getCity());
        registrationDTO.setGender(registration.getGender());
        registrationDTO.setSkills(registration.getSkills());
        registrationDTO.setAddress(registration.getAddress());
        model.addAttribute("registrationDTO", registrationDTO); // form fields
        model.addAttribute("registration", registration); // for id
        return "edit_registration";
    }

    @PostMapping("/edit_registration")
    public String updateRegistration(@ModelAttribute RegistrationDTO registrationDTO, @RequestParam Long id) {
        registrationService.updateRegistration(registrationDTO, id);
        return "redirect:/";
    }
    
    @GetMapping("/delete-registration")
    public String deleteRegistration(@RequestParam Long id) {
        registrationService.deleteRegistration(id);
        return "redirect:/";
    }
}
