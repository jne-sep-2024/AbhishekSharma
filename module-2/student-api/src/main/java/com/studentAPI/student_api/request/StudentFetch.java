package com.studentAPI.student_api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentFetch {

    private long id;
    private UUID uuid;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
}
