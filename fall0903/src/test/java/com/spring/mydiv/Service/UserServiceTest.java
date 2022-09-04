package com.spring.mydiv.Service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import com.spring.mydiv.Dto.UserCreateDto;
import com.spring.mydiv.Entity.User;
import com.spring.mydiv.Repository.UserRepository;


/**
 * @author 12nov
 */
@ExtendWith(MockitoExtension.class) //mokito -> DB x
class UserServiceTest {
	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private UserService userService;
	
	@Test
	void testCreateUser() {
        //given
		UserCreateDto.Request request = UserCreateDto.Request.builder()
				.Name("haeunUCB")
				.Email("haeunlee1230@gm.gist.ac.kr")
				.Password("20205149")
				.Account("000-000-00")
				.build();
		ArgumentCaptor<User> captor =
                ArgumentCaptor.forClass(User.class);
        //when
		UserCreateDto.Response response = userService.createUser(request);

        //then
		verify(userRepository, times(1)).save(captor.capture());
        System.out.print("name = " + response.getName());
		
        //fail("Not yet implemented"); // TODO
	}

}
