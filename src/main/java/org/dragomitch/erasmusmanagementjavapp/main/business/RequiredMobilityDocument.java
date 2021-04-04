package org.dragomitch.erasmusmanagementjavapp.main.business;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class RequiredMobilityDocument implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requiredMobilityDocumentId;
    private String name;
    private char category;
    private boolean isFilledIn;
    @ManyToOne(fetch = FetchType.LAZY)
    private ErasmusProgram erasmusProgram;
}
