class Normal implements Formality {
    @Override
    public String greet() {
        return "Hello.";
    }
}

class Formal implements Formality {
    @Override
    public String greet() {
        return "Good evening";
    }
}

class Casual implements Formality {
    @Override
    public String greet() {
        return "Goodday?";
    }
}

class Intimate implements Formality  {
    @Override
    public String greet() {
        return "Hello darling!";
    }
}


public class Greeter {
    // Attribute(s)

    /* 
     * Non-null by default (to avoid Null error in switch statement)
     */
    String formality = "";

    // Method
    public String greet() {
        switch (this.formality) {
            case "formal":
                return new Formal().greet();
            case "casual":
                return new Casual().greet();
            case "intimate":
                return new Intimate().greet();
            default:
                return new Normal().greet();
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
