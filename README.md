# 코틀린 스프링 스터디 

## 코틀린 테스트

### 테스트의 DI 
* 코틀린 테스트 DI 
    > 생성자 앞에 Autowired를 붙이면 모두 DI가 됨 
    ```kotlin
    class UserServiceTest @Autowired constructor(
            private val userRepository: UserRepository,
            private val userServices: UserService,
    )
    ```
* 플랫폼 타입의 제어
    > 코틀린의 기본은 Null을 허용 하지 않아 두가지 방법으로 회피하여한다
    * Nullable 어노테이션 활용
    ```kotlin
        //Test 클래스
        assertThat(result[0].age).isNull()
        //User Entity
        @Nullable
        private Integer age
        
    ```
    * ? 연산자 사용 
    ```kotlin
        assertThat(result[0]?.age).isNull()
    ```

