package fourthweekjavapractice;

public interface Movable {
	// allows us to declare non abstract methods in interfaces
    default void move(){
        System.out.println("Praveen is moving");
    }
}