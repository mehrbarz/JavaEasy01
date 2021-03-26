import java.security.Principal;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import org.graalvm.compiler.hotspot.nodes.aot.PluginFactory_ResolveDynamicStubCall;
import org.graalvm.compiler.replacements.nodes.PluginFactory_BitScanReverseNode;

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomized = (int) (Math.random() * 100 + 1);
        System.out.println(randomized);

        int guess = 0;
        while (guess != randomized) {
            System.out.println("Guess a number between 1 - 100 : ");
            guess = scan.nextInt();
            System.out.println(guess + " is the number you guessed. ");
            if (guess < randomized)
                System.out.println(guess + " Your guess is low. Try again.");
            else if (guess > randomized)
                System.out.println(guess + " Your guess is high. try again. ");
            else
                System.out.println(guess + " You are correct. ");

        }
    }
}
