package response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private long id;
    private UUID uuid;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
}
