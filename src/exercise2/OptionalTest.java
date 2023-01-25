package exercise2;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);

        // pierwsza opcja
        if(optional.isPresent()){
            String value = optional.get();
            System.out.println(value);
        } else {
            System.out.println("Brak wartości");
        }

        // druga opcja
        String value2 = optional.orElse("Brak wartości");
        System.out.println(value2);
    }
}
