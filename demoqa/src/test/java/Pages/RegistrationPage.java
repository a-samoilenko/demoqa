package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    static String firstNameSelector = "#firstName",
            lastNameSelector = "#lastName",
            userEmailSelector = "#userEmail",
            userNumberSelector = "#userNumber",
            currentAddressSelector = "#currentAddress",
            calendarSelector = ".react-datepicker__input-container",
            calendarYearSelector = ".react-datepicker__year-select",
            calendarMonthSelector = ".react-datepicker__month-select",
            calendarDaySelector = ".react-datepicker__day--0";



    public static void openPage(){
        open("/automation-practice-form");
    }

    public static void setUser(String firstName, String lastName){
        $(firstNameSelector).setValue(firstName);
        $(lastNameSelector).setValue(lastName);
    }
    public static void setEmail(String eMail){
        $(userEmailSelector).setValue(eMail);
    }

    public static void setGender(String gender){
        $(withText(gender)).click();
    }

    public static void setNumber(String mobileNumber){
        $(userNumberSelector).setValue(mobileNumber);
    }

    public static void setHobbie(String hobbies){
        $(withText(hobbies)).click();
    }

    public static void setcurrentAddress(String currentAddress){
        $(currentAddressSelector).setValue(currentAddress);
    }

    public static void setCalendar(String yearOfBirth, String monthOfBirth,String dayOfBirth){
        $(calendarSelector).click();
        $(calendarYearSelector).$(byText(yearOfBirth)).click();
        $(calendarMonthSelector).$(byText(monthOfBirth)).click();
        $(calendarDaySelector+dayOfBirth).click();
    }

}