package entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "studentIDGenerator")
	@SequenceGenerator(name = "studentIDGenerator" , initialValue = 12400 , allocationSize = 1 , sequenceName = "studentid_seq" )
	private Integer studentID;
	private String name;
	private int age;
	public Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
