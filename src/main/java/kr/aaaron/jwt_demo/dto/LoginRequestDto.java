package kr.aaaron.jwt_demo.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String username;
    private String password;
}
