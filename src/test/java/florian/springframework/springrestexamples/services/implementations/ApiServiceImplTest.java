package florian.springframework.springrestexamples.services.implementations;

import florian.springframework.apimvc.domain.User;
import florian.springframework.springrestexamples.services.interfaces.ApiService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ApiServiceImplTest {

    @Autowired
    private ApiService apiService;

    @Test
    void getUsers() {
        List<User> userList = apiService.getUsers(4);
        assertEquals(1,userList.size());
    }
}