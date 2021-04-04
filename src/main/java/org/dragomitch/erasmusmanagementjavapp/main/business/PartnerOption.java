package org.dragomitch.erasmusmanagementjavapp.main.business;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class PartnerOption implements Serializable {
    @EmbeddedId
    private PartnerOptionId partnerOptionId;
    private String department;
}
