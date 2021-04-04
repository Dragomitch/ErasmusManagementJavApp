package org.dragomitch.erasmusmanagementjavapp.main.business;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class MobilityChoice implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mobilityChoiceId;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    private int preferenceOrder;
    private String mobilityType;
    private int academicYear;
    private int term;
    @ManyToOne(fetch = FetchType.LAZY)
    private ErasmusProgram program;
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;
    private LocalDateTime submissionDate;
    @ManyToOne(fetch = FetchType.LAZY)
    private DenialReason denialReason;
    private String cancellationReason;
    @ManyToOne(fetch = FetchType.LAZY)
    private Partner partner;
}
