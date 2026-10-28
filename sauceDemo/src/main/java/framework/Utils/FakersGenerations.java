package framework.Utils;


import net.datafaker.Faker;

import java.util.Locale;
public class FakersGenerations {

    private Faker faker;
    private String firstName;
    private String lastName;
    private String zipCode;
    private String email;


    public FakersGenerations() {
        faker = new Faker(new Locale("pt-BR"));
    }

    public String getFirstName(){

        firstName = faker.name().firstName();
        return firstName;

        // return faker.name().firstName();
    }
    public String getLastName(){

        lastName = faker.name().lastName();
        return lastName;

        // return faker.name().lastName();
    }
    public String getZipCode(){

        zipCode = faker.address().zipCode();
        return zipCode;

        // return faker.name().address().zipCode();

    }

    public String getEmail(){
        email = faker.internet().emailAddress();
        return email;
    }
}
