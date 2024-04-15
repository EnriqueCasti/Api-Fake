package model;

import java.security.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@SuppressWarnings("unused")
public class User {
    private String username;
    private String fullName;
    private String phone;
    private Timestamp birthday;
}
