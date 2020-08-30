package florian.springframework.springrestexamples.services.interfaces;

import florian.springframework.apimvc.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(int limit);
}
