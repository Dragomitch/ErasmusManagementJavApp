package erasmus.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class User implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    @ManyToOne(fetch = FetchType.LAZY)
    private Option option;
    private LocalDateTime registrationDate;
    private String role; // Student or Professor //TODO Enum
}
