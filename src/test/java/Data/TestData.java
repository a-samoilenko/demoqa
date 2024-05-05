package Data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {
    public static Faker rufaker = new Faker(new Locale("ru"));
    public static Faker faker = new Faker();
    public static String fakeFirstname = rufaker.name().firstName();
}