package florian.springframework.springrestexamples.services.implementations;

import florian.springframework.apimvc.domain.User;
import florian.springframework.apimvc.domain.UserData;
import florian.springframework.springrestexamples.services.interfaces.ApiService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private final RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public List<User> getUsers(int limit) {//the limit is not used because the api given is broken
        UserData userData = restTemplate.getForObject(String.format(
                "https://private-anon-f1a714e820-apifaketory.apiary-mock.com/api/user?limit=%d",limit),UserData.class);


        return userData.getData();
    }
}
