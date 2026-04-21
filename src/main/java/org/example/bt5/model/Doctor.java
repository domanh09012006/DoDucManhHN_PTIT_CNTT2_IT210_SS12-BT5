package org.example.bt5.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    private String id;
    private String name;
    private String specialty;
    private int experience;
    private String phone;
    private String address;
    private String joinDate;
    private String avatar;
}