package com.spring.mydiv.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.spring.mydiv.Entity.User;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
	
	
	@Test
    @Commit
    @DisplayName("회원가입")
	void testCreateUser() {
		User testUser = UserDto("haeunUCB", "haeunlee1230@gm.gist.ac.kr", "20205149", "000-000-00");
		Long id = memberservice.joinUser(USER);
        System.out.print("id = " + id);
		fail("Not yet implemented"); // TODO
	}

	private User UserDto(String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	void testUserService() {
		fail("Not yet implemented"); // TODO
	}

}
