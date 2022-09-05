package com.spring.mydiv.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.spring.mydiv.Dto.TravelDto;
import com.spring.mydiv.Dto.UserCreateDto;

@SpringBootTest
class TravelServiceTest {
	@Autowired(required=true)
	private TravelService travelService;

	@Test
    @Commit
    @DisplayName("여행만들기")
	void testCreateTravel() {
		//given
		TravelDto request = TravelDto.builder()
				.Name("house")
				.build();
		//when
		TravelDto response = travelService.createTravel(request);
		//then
		System.out.print("name = " + response.getName());
		//fail("Not yet implemented"); // TODO
	}

}
