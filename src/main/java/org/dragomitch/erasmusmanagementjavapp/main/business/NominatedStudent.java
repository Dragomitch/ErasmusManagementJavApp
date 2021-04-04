package org.dragomitch.erasmusmanagementjavapp.main.business;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class NominatedStudent implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nominatedStudentId;
    private String title;
    private LocalDate birthdate;
    @ManyToOne(fetch = FetchType.LAZY)
    private Country nationality;
    @ManyToOne(fetch = FetchType.LAZY)
    private Address address;
    private String phoneNumber;
    private String gender;
    private int nbrPassedYears;
    private String iban;
    private String cardHolder;
    private String bankName;
    private String bic;
}
