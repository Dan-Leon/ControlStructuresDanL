package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Control Structures
        float temperature = 0;
        Scanner scanner = new Scanner(System.in);

        while(temperature < 92.0 || temperature > 104.0) {

            System.out.println("Please enter a valid temperature between 92.0 and 104.0.");
            temperature = scanner.nextFloat();

            if (temperature > 99.5){
                System.out.println("The temperature is high!");
            }
            else if(temperature <= 99.5 && temperature >= 97.5){
                System.out.println("The temperature is normal.");
            }
            else{
                System.out.println("The temperature is low!");
            }

        }



    }
}
