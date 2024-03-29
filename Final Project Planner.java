import java.util.Scanner;

public class Planner {public static void main(String[] args) {
    Introduction();
    DurationAndMoney();
    TimeDifference();
    SurfaceArea();
    DistanceFromHome();
}
    public static void Introduction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Greetings! Welcome to Vacation Planner.");
        
        System.out.print("Please enter your name: ");
        String Username = input.nextLine();

        System.out.print("Nice to meet you " + Username + "! Which country are you planning to visit? ");
        String UserCountry =input.nextLine();

        System.out.println("That's great! " + UserCountry + " sounds like an exciting trip!");
        System.out.println("----------\n");

    }

    public static void DurationAndMoney() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you planning to spend travelling? ");
        int UserDuration = input.nextInt();

        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double UserSpending = input.nextDouble();

        System.out.print("What is the three letter currency symbol for your destination? ");
        String UserCurrency = input.next();

        System.out.print("How many " + UserCurrency + " are in 1 USD? ");
        double UserCurrencyConverter = input.nextDouble();

        System.out.print("\n");

        System.out.println("If you are travelling for " + UserDuration + " days, that equals the same as " + UserDuration * 24 + " hours or " + UserDuration * 24 * 60 + " minutes");

        System.out.println("If you are going to spend $" + UserSpending + "USD that means per day you can spend up to $" + (int) (UserSpending / UserDuration * 100) / 100.0 + " USD");

        System.out.println("Your total budget in " + UserCurrency + " is " + UserCurrencyConverter * UserSpending + " "
                + UserCurrency + ", which per day is " + (int) (UserCurrencyConverter * UserSpending / UserDuration * 100) / 100.0 + " "
                + UserCurrency);
        System.out.println("*********\n");
    }

    public static void TimeDifference() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int UserTimeDifference= input.nextInt();

        System.out.println("That means when it is midnight at home it will be " + (UserTimeDifference+ 24) % 24 + ":00"
                + " in your travel destination and when it is noon at home it will be " + (12 + UserTimeDifference) + ":00.");
        System.out.println("*********\n");
    }

    public static void SurfaceArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km^2? ");
        double UserKilometer = input.nextDouble();
        System.out.println("In miles^2 that is " + (int) (UserKilometer * 0.62137 * 0.62137 * 100) / 100.0);
        System.out.println("----------\n");
    }
    public static void DistanceFromHome() {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the latitude of your home? ");
        double UserLatitude = input.nextDouble();
        System.out.print("What is the longitude of your home? ");
        double UserLongitude = input.nextDouble();

        System.out.print("What is the latitude of your destination? ");
        double UserDestinationLatitude = input.nextDouble();
        System.out.print("What is the  longitude of your destination? ");
        double UserDestinationLongitude = input.nextDouble();

        UserLatitude = Math.toRadians(UserLatitude);
        UserLongitude = Math.toRadians(UserLongitude);
        UserDestinationLatitude = Math.toRadians(UserDestinationLatitude);
        UserDestinationLongitude = Math.toRadians(UserDestinationLongitude);

        int EarthRadiusInKM = 6371;
        double UserDistance = EarthRadiusInKM * Math.acos(Math.sin(UserLatitude)*Math.sin(UserDestinationLatitude) + Math.cos(UserLatitude)*Math.cos(UserDestinationLatitude)*Math.cos(UserLongitude - UserDestinationLongitude));

        System.out.print("The distance between those points is: " + UserDistance + " km");

    }
}
