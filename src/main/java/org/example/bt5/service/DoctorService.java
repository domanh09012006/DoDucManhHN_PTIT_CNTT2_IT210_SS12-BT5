package org.example.bt5.service;

import org.example.bt5.model.Doctor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {
    private List<Doctor> doctorList = new ArrayList<>();

    public DoctorService() {
        doctorList.add(new Doctor("DOC01", "Nguyen Van B", "Noi Khoa", 5, "0912345678", "Ha Noi", "21/04/2026", "doraemon.jpg"));
        doctorList.add(new Doctor("DOC02", "Nguyen Van A", "Ngoai Khoa", 10, "0988776655", "HCMC", "10/01/2025", "doraemon.jpg"));
    }

    public List<Doctor> getAllDoctors() {
        return doctorList;
    }

    public Doctor findByPhone(String phone) {
        return doctorList.stream()
                .filter(d -> d.getPhone().equals(phone))
                .findFirst().orElse(null);
    }
}