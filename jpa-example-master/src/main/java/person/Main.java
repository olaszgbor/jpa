package person;

import com.github.javafaker.Faker;

import java.time.ZoneId;
import java.util.Date;

public class Main  {
    public static Person randomPerson() {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        java.util.Date date = new Date();
        java.time.LocalDate dob = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Person gender = MALE;
        for (int i = 0; i < 1000; i++) {
            Person tomb[i]=Person(name,dob,gender)
        }
    }
    public static void main(){
    return Person;
    }
}
