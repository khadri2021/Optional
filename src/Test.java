import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("khadri");

		Optional<String> ofNullable = Optional.ofNullable(emp.getName());
		if (ofNullable.isPresent()) {
			System.out.println(ofNullable.get().toUpperCase());
		}

		ofNullable.ifPresent((value) -> {
			System.out.println(value.toUpperCase());
		});

	}
}
