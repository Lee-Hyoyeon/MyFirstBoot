## chapter 01
- 인텔리제이를 비롯한 각종 IDE를 관리하는 툴박스 소개
- 인텔리제이 설치와 기본 사용법
- mavenCentral, jcenter 비교
- 스프링부트 pj와 그레이들 연동 방법
- 인텔리제이에서 깃허브 사용하는 방법 

## chapter 02
- TDD와 단위테스트
- 스프링부트 환경에서 테스트코드 작성 방법
- 자바의 필수 유틸 롬복의 사용법

메소드 | 의미 
    ---|:----:
    `@RestController` | 컨트롤러를 json 으로 반환하는 컨트롤러로 만들어줌 |
    `@GetMapping` | Http Method인 Get의 요청을 받을수있는 API만듬 |
    `@RunWith(SpringRunner.class)` | -테스트를 진행할때 JUnit에 내장된 실행자외에 다른 실행자를 실행시킴 <br>-즉 스프링부트 테스트와 JUnit사이에 연결자 역할을 한다.|
    `@WebMvcTest` | -여러스프링 테스트 어노테이션중 web에 집중할수있는 어노테이션 <br>-선언할경우 @Controller, @ControllerAdvice사용 못함|
    `@Autowired` | 스프링 관리하는 빈(bean)을 주입 받음 |
    `@privateMockMvc mvc` | 웹 API 테스트 할때 사용  |
    `@RequiredArgsConstructor` | 선언된 모든 final 필드가 포함된 생성자를 생성해줌 |
    `@assertThat` | -assertj라는 테스트 검증 라이브러리의 검증 메서드<br> -검증하고 싶은 대상을 메소드 인자로 받음
    `@isEqualTo` | assertj의 동등 비교 메서드<br> -assertThat에 있는 값과 isEqualTo의 값을 비교후 같을때만 성공  |
    `@RequestParam` | 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션 |
    `@param` | API테스트 할때 사용될 요청 파라미터를 설정 *String 만 허용 |
    `@jsonPath` | json응답 값을 필드별로 검증할수있는 메서드 ,$를 기준으로 필드명 명시|

```
오우 나이스 code
``` 
