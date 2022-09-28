package com.deepblue.controller;

import lombok.*;

/**
 *
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mine {

    private String username;

    private String password;

    private Integer gender;
}
