package com.studentAPI.student_api.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BasicUserInfoDTO {

    private String firstName;
    private String lastName;
}
