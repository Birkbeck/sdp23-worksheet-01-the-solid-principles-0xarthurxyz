public class WeatherTracker extends Tracker implements TrackerClient {
    // Custom attributes
    Phone phone;
    Emailer email;

    // Constructor
    WeatherTracker() {
        phone = new Phone();
        email = new Emailer();
    }

    @Override
    public void setCurrentConditions(String condition) {
        // Inherited attribute
        this.currentConditions = condition;

        // Custom logic
        if (condition == "rainy") {
            String alert = phone.generateWeatherAlert(condition);
            System.out.print(alert);
        }
        if (condition == "sunny") {
            String alert = email.generateWeatherAlert(condition);
            System.out.print(alert);
        }
    }
}