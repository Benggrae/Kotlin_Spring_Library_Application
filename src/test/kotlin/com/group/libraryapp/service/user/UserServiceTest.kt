package com.group.libraryapp.service.user;

import com.group.libraryapp.domain.user.UserRepository;
import com.group.libraryapp.dto.user.request.UserCreateRequest
import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest @Autowired constructor(
        private val userRepository: UserRepository,
        private val userServices: UserService,
) {
    @Test
    fun saveUserTest() {
        //given
        val request = UserCreateRequest("김병희", null)

        //when
        userServices.saveUser(request)

        //then
        val result = userRepository.findAll()
        assertThat(result).hasSize(1)
        assertThat(result[0].name).isEqualTo("김병희")
        //코틀린의 플랫폼 타입
        //assertThat(result[0]?.age).isNull()
        assertThat(result[0].age).isNull()
    }

}
