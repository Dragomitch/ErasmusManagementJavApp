package org.dragomitch.erasmusmanagementjavapp.main.business;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class Option implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long optionId;
    private String code;
    private String name;
}
