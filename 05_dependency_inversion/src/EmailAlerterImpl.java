public class EmailAlerterImpl implements AlerterClient {
    @Override
    public String generateWeatherAlert(String condition) {
        String alert = "It is " + condition;
        return alert;
    }
}