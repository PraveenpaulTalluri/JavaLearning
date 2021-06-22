package secondweekjavapractise;

import java.time.LocalDate;

public class Employee {
 
    private Long id;
    private String name;
	private LocalDate dateOfJoining;
 
    public Employee(Long id, String name, LocalDate dateOfJoining) {
        super();
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
    }
 
    //Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
    
	public String toString() {
        return "Employee id=" + id + ", name=" + name + ", dateOfJoining=" + dateOfJoining + "]";
    }

}