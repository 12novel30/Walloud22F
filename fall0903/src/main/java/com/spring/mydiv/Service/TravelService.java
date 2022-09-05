package com.spring.mydiv.Service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.spring.mydiv.Dto.UserCreateDto;
import com.spring.mydiv.Entity.User;

import lombok.RequiredArgsConstructor;

/**
 * @author 12nov
 */
@Service
@RequiredArgsConstructor
public class TravelService {

    @Transactional
    public UserCreateDto.Response createTravel(UserCreateDto.Request request) {
        User user = User.builder()
        		//.Id(userdto.getId())
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .account(request.getAccount())
                .build();
//        userRepository.save(user);
        return UserCreateDto.Response.fromEntity(user);
    }

}
