package florian.springframework.apimvc.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Card {
    private String type;
    private String number;
    private LocalDate expiration_date;
    private String iban;
    private String swift;
}
