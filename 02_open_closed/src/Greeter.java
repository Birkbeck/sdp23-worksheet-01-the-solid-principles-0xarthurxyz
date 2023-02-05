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

class Intimate extends Greeter implements Formality  {
    @Override
    public String greet() {
        return "Hello darling!";
    }
}


public class Greeter {
    String formality;

    public String greet() {
        /* 
         * Before
         */
        if (this.formality == "formal") {
            return "Good evening";
        } else if (this.formality == "casual") {
            return "Goodday?";
        } else if (this.formality == "intimate") {
            return "Hello darling!";
        } else {
            return "Hello.";
        }

        /* 
         * After
         */
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
