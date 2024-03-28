package lombok.integrations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
//@AllArgsConstructor
//@Data
public class Employee {

	private String firstName;
	private String lastName;
}
