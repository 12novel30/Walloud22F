package com.spring.mydiv.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mydiv.Dto.UserCreateDto;
import com.spring.mydiv.Dto.UserDto;
import com.spring.mydiv.Entity.Travel;
import com.spring.mydiv.Service.TravelService;
import com.spring.mydiv.Service.UserService;

import lombok.RequiredArgsConstructor;

/**
 * @author 12nov
 */
//@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequiredArgsConstructor
//@RequestMapping("/")
public class UserController {
	private final UserService userservice;
	private final TravelService travelservice;

	
	@GetMapping("/api/hello")
	public String ddd() {
		return "He";
	}
	
	@PostMapping(value = "/testw")
	public String createUser(@RequestBody Map map) {

	     System.out.println("");
	     System.out.println(map.get("user_name"));
	     System.out.println(map.get("user_email"));
	     System.out.println(map.get("user_password"));
	     System.out.println(map.get("user_account"));
	     
//	     UserDto userdto = new UserDto(map.get("user_name").toString(),map.get("user_email").toString(),map.get("user_password").toString(),map.get("user_account").toString());
//	     userservice.CreateUser(userdto);     
	     //JPA save 함수는 리턴값이 없는듯
	      return "spring";
	}
	
	
    @PostMapping("/Register")
    //회원가입
    public ResponseEntity<UserCreateDto.Response> createUser(String t) { //@RequestBody UserCreateDto.Request request) {
    	//@RequestBody = 회원가입 정보
    	//service. user DB에 사용자 등록
    	System.out.print(t);
    	UserCreateDto.Request request = null;
    	return ResponseEntity.ok(userservice.createUser(request)); //상태코드 & body
    }
    
    /**로그인
     * input: id & pw
     * in user db,
     * 	id 없으면 id 없다는 문구 출력
     *  pw 틀리면 pw 틀렸다는 문구 출력
     *  맞으면 return Y*/
    @PostMapping("/login")
    public UserCreateDto.Response login(@RequestBody UserCreateDto.Login loginUser) {
    	return userservice.login(loginUser);
//    	if answer == null: return "아이디나 비밀번호가 일치하지 않습니다."
//    	else: user 정보 넘겨줄것
    } //테스트해야함
    
    /**status 코드 리턴 & userDB의 개인정보 리턴
     * 		person DB에 user id 있으면 -> travel 리스트 리턴
     * 		null -> "여행을 만들어보세요!" 출력*/
    @PostMapping("/{no}")
    public List<String> getUserJoinedTravel(@PathVariable int no){
		//@PathVariable = 로그인한 유저 아이디
    	return userservice.getUserJoinedTravel(no);
	}    //테스트해야함
    
//    미완성 ...
//    /**travel join
//     * input: travel 정보 & 현재 유저 email
//     * to travel db -> travel 생성
//     * to person db -> 현재 유저 & travel 데이터 생성
//     * return travel 메인 페이지*/
//	@PostMapping("/{no}/jointravel")
//	public void joinTravel(@PathVariable int no, @RequestBody Travel travel){
//		//@PathVariable = 로그인한 유저 아이디
//		//@RequestBody = 생성할 여행 정보
//		//userservice. travel DB에 여행 생성
//		travelservice.createTravel(travel);
//		return ResponseEntity.ok(userservice.createUser(no, travel));
//		//person DB에 (user-travel)추가
//		//JPA save 함수는 리턴값이 없는듯
//	}

}