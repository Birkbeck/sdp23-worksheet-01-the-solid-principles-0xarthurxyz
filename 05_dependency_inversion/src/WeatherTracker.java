public class WeatherTracker {
    // Attribute(s)
    String currentConditions;
    Phone phone;
    Emailer emailer;

    // Constructor
    public WeatherTracker() {
        phone = new Phone();
        emailer = new Emailer();
    }

    // Method
    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
