package com.jojoldu.book.springboot.web;
//import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 컨트롤러를 (json을 반환하는) 컨트롤러로 만들어줌. @responseBody를 각 메서드마다 선언-> 한번에 해결
public class HelloController {

    @GetMapping("/hello")  //get요청을 받을 수있는 API를 만들어 줍니다. 예전 @requestMapping 으로 사용
    public String hello() {
        return "hello";
    }

/*    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }*/

}
