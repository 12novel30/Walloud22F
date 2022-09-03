package com.spring.mydiv.Service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.spring.mydiv.Dto.UserDto;
import com.spring.mydiv.Entity.User;
import com.spring.mydiv.Repository.UserRepository;

import lombok.RequiredArgsConstructor;

/**
 * @author 12nov
 */
@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	
    @Transactional
    public UserDto createUser(UserDto userdto) {
        User user = User.builder()
        		.Id(userdto.getId())
                .Name(userdto.getName())
                .Email(userdto.getEmail())
                .Password(userdto.getPassword())
                .Account(userdto.getAccount())
                .build();
        userRepository.save(user);
        return UserDto.fromEntity(user);
    }
}
