package com.project.bookreport.model.member;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class LoginRequest {
  @NotBlank(message = "아이디를 입력해주세요")
  private String username;

  @NotBlank(message = "비밀번호를 입력해주세요")
  private String password;
}