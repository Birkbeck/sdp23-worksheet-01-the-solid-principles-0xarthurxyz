# Worksheet One — SOLID design principles

This worksheet contains examples of the five SOLID design principles of object-oriented programming. 
For each example, consider the problem and then how the code contravenes the SOLID principles:

- Single Responsibility Principle,
- Open/Closed Principle,
- Liskov Substitution Principle,
- Interface Segregation Principle,
- Dependency Inversion Principle.

------

Credits: Thanks to Mike Knepper (mikeknep) for the basis of these materials. 


## Notes

### 01_single_responsibility

- [x] All tests pass

### 02_open_closed

- [x] All tests pass

### 03_liskov_substitution

- [x] All tests pass

### 04_interface_segregation

- [x] All tests pass

### 05_dependency_inversion

- [x] All tests pass

Bad code:

```java
public class Emailer {
    public String generateWeatherAlert(String weatherConditions) {
        // ...
    }
}

public class Phone {
    public String generateWeatherAlert(String weatherConditions) {
        // ...
    }
}

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
        // ...if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
```

Refactored code:

