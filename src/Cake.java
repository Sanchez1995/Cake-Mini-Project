public class Cake {

        private String cakeName;
        private String flavour;
        private String sugarContent;
        private String origin;
        private double price;

   public Cake(String cakeName, String flavour, String sugarContent, String origin, double price) {

        this.cakeName = cakeName;
        this.flavour = flavour;
        this.sugarContent = sugarContent;
        this.origin = origin;
        this.price = price;
    }


    public String getCakeName() {

        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(String sugarContent) {
        this.sugarContent = sugarContent;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

