package com.p1thong.identity_service.dto.request;

import com.p1thong.identity_service.exception.ErrorCode;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreateRequest {
    @Size(min = 5, message = "USERNAME_INVALID")
    String email;

    @Size(min = 6, message = "PASSWORD_INVALID")
    String password;
    String role;
}
