package com.Student.RegistrationForm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Student.RegistrationForm.dto.RegistrationDTO;
import com.Student.RegistrationForm.models.Registration;
import com.Student.RegistrationForm.repository.RegistrationRepository;

@Service
public class RegistrationService {
    
    private final RegistrationRepository registrationRepository;
    
    public RegistrationService(RegistrationRepository registrationRepository) {
        super();
        this.registrationRepository = registrationRepository;
    }
    
    // Get list of registered users
    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    public void saveRegistration(RegistrationDTO registrationDTO) {
        Registration registration = new Registration();
        registration.setName(registrationDTO.getName());
        registration.setAge(registrationDTO.getAge());
        registration.setEmail(registrationDTO.getEmail());
        registration.setPhone(registrationDTO.getPhone());
        registration.setPassword(registrationDTO.getPassword());
        registration.setDob(registrationDTO.getDob());
        registration.setCity(registrationDTO.getCity());
        registration.setGender(registrationDTO.getGender());
        registration.setSkills(registrationDTO.getSkills());
        registration.setAddress(registrationDTO.getAddress());
        registrationRepository.save(registration);
    }

    public Registration getRegistration(Long id) {
        return registrationRepository.findById(id).orElse(null);
    }

    public void updateRegistration(RegistrationDTO registrationDTO, Long id) {
        Registration registration = registrationRepository.findById(id).orElse(null);
        if (registration != null) {
            registration.setName(registrationDTO.getName());
            registration.setAge(registrationDTO.getAge());
            registration.setEmail(registrationDTO.getEmail());
            registration.setPhone(registrationDTO.getPhone());
            registration.setPassword(registrationDTO.getPassword());
            registration.setDob(registrationDTO.getDob());
            registration.setCity(registrationDTO.getCity());
            registration.setGender(registrationDTO.getGender());
            registration.setSkills(registrationDTO.getSkills());
            registration.setAddress(registrationDTO.getAddress());
            registrationRepository.save(registration);
        }
    }

    public void deleteRegistration(Long id) {
        registrationRepository.deleteById(id);
    }
}
