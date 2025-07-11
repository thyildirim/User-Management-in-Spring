package com.example.usermanagement.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "username should not be blank")
    @Size(min = 3, max = 10)
    @NonNull
    @Column(unique = true)
    private String username;

    @NotBlank(message = "password should not be blank")
    @Size(min = 3, max = 10)
    @NonNull
    private String password;
}
