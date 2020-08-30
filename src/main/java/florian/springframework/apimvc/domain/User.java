package florian.springframework.apimvc.domain;


import lombok.Data;

@Data
public class User {
    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private String language;
    private String currency;


}
