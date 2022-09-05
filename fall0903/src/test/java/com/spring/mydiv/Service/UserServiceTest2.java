package com.spring.mydiv.Service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.spring.mydiv.Dto.UserCreateDto;
@SpringBootTest //-> DB O
class UserServiceTest2 {
	@Autowired(required=true)
	private UserService userService;
	
	@Test
    @Commit
    @DisplayName("회원가입")
	void testCreateUser() {
		//given
		UserCreateDto.Request request = UserCreateDto.Request.builder()
				.Name("haeunGmail2")
				.Email("bittersweet@gmail.com")
				.Password("20205149")
				.Account("000-000-00")
				.build();
		//when
		UserCreateDto.Response response = userService.createUser(request);
		//then
		System.out.print("name = " + response.getName());
		//fail("Not yet implemented"); // TODO
	}
	
//	@Test
//    @Commit
//    @DisplayName("로그인")
//	void testLogin() {
//		//given
//		UserCreateDto.Login login = UserCreateDto.Login.builder()
//				.Email("bittersweet141230@gmail.com")
//				.Password("20205149")
//				.build();
//		//when
//		UserCreateDto.Response response = userService.login(login);
//		
//		//then
//		System.out.print("password = " + response.getPassword());
//		//fail("Not yet implemented"); // TODO
//	}
	
	@Test
    @Commit
    @DisplayName("로그인")
	void testGetUserJoinedTravel() {
		//given
		UserCreateDto.Login login = UserCreateDto.Login.builder()
				.Email("bittersweet141230@gmail.com")
				.Password("20205149")
				.build();
		//when
		UserCreateDto.Response response = userService.login(login);
		
		//then
		System.out.print("password = " + response.getPassword());
		//fail("Not yet implemented"); // TODO
	}

}
