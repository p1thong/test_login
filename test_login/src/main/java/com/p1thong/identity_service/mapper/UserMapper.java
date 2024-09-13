package com.p1thong.identity_service.mapper;

import com.p1thong.identity_service.dto.request.UserCreateRequest;
import com.p1thong.identity_service.dto.request.UserUpdateRequest;
import com.p1thong.identity_service.dto.response.UserResponse;
import com.p1thong.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreateRequest request);

    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
