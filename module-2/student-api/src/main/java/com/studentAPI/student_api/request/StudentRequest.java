package com.studentAPI.student_api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
}
