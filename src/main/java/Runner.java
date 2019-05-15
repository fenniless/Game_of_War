import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Game of War!\nPress enter to start:");
        input.nextLine();
        War war = new War();
        war.play();
    }
}
