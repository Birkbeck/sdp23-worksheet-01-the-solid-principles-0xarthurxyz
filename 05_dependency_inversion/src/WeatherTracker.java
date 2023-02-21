public class WeatherTracker extends Tracker implements TrackerClient {
    // Custom attributes
    PhoneAlerterImpl phoneAlerter;
    EmailAlerterImpl emailAlerter;

    // Constructor
    WeatherTracker() {
        phoneAlerter = new PhoneAlerterImpl();
        emailAlerter = new EmailAlerterImpl();
    }

    @Override
    public void setCurrentConditions(String condition) {
        // Inherited attribute
        this.currentConditions = condition;

        // Custom logic
        if (condition == "rainy") {
            String alert = phoneAlerter.generateWeatherAlert(condition);
            System.out.print(alert);
        }
        if (condition == "sunny") {
            String alert = emailAlerter.generateWeatherAlert(condition);
            System.out.print(alert);
        }
    }
}