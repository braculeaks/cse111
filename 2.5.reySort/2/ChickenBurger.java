class ChickenBurger {               // q25
    String bun = "Sesame";
    int price = 200;
    String sauceOption = "Less";
    String spiceLevel = "Not Set";

    void customizeSpiceLevel(String level) {
        if (level.equals("Spicy") || level.equals("Naga")) {
            this.spiceLevel = level;
            System.out.println("Spice level set to " + level + ".");
        } else {
            System.out.println("This spice level is unavailable.");
        }
    }

    String serveBurger() {
        if (spiceLevel.equals("Not Set")) {
            return "Cannot serve now. Customize Spice Level first.";
        }
        else {
            String  out = "";
                    out += "The burger is being served:- " + "\n";
                    out += "Bun Type: " + bun + "\n";
                    out += "Price: " + price + "\n";
                    out += "Sauce Option: " + sauceOption + "\n";
                    out += "Spice Level: " + spiceLevel;
            return  out;
        }
    }
}