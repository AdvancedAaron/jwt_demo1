package kr.aaaron.jwt_demo.dto;

import lombok.Data;

@Data
public class RoleToUserForm {
    private String username;
    private String roleName;
}
