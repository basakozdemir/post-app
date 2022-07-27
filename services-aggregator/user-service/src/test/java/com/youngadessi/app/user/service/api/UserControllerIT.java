package com.youngadessi.app.user.service.api;

import javax.ws.rs.core.HttpHeaders;
import org.springframework.http.HttpStatus;
import static io.restassured.RestAssured.given;
import com.youngadessi.app.user.UserServiceApplication;
import com.youngadessi.app.user.api.UserController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@ExtendWith(MockitoExtension.class)
@SpringBootTest(classes = { UserServiceApplication.class, UserController.class },
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerIT {

    @LocalServerPort
    private int port;

    @Test
    void search_UserReturnOk_WhenKeywordValid(){
        String searchKeyword = "A";
        String url = "/users";

        given().when().header(HttpHeaders.AUTHORIZATION, "Bearer ")
                .port(port)
                .param("searchKeyword", searchKeyword)
                .get(url)
                .then()
                .statusCode(HttpStatus.OK.value());

    }
}
