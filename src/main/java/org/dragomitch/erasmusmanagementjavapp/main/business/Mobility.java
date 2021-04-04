package org.dragomitch.erasmusmanagementjavapp.main.business;

import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class Mobility implements Serializable {
    private LocalDateTime submissionDate;
    private String state;
    private String stateBeforeCancellation;
    private List<RequiredMobilityDocument> documents;
    private LocalDateTime firstPaymentRequestDate;
    private LocalDateTime secondPaymentRequestDate;
    private boolean proEcoEncoding;
    private boolean secondSoftwareEncoding;
    private User professorInCharge;
    private NominatedStudent nominatedStudent;
}
