public class Plant {

    private String title;
    private String latinTitle;

    private boolean annual;
    private String continent;
    private int height;
    private boolean edible;

    public Plant(){

    }

    public Plant(String title, String latinTitle, boolean annual, String continent, int grownPlantHeightMeter,
                 boolean edible ) {
        this.title = title;
        this.latinTitle = latinTitle;
        this.annual = annual;
        this.continent = continent;
        this.height = height;
        this.edible = edible;

    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;

    }
    public void setLatinTitle(String latinTitle) {
        this.latinTitle = latinTitle;
    }

    public String getLatinTitle() {
        return this.latinTitle;

    }
    public void setAnnual(boolean annual) {
        this.annual = annual;
    }

    public boolean annual() {
        return this.annual;

    }
    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return this.continent;

    }

    public void setheight(int height) {
        this.height= height;
    }

    public int getheight() {
        return this.height;

    }
    public void setEdible(boolean edible) {
        this.title = title;
    }

    public boolean getedible() {
        return this.edible;

    }

    @Override
    public String toString() {
        return ("Augalo pavadinimas " + title + " lotyniskas pavadinimas " + latinTitle + " vienmetis " + (this.annual ? "true" : "false") +
                " kokiam zemyne auga " + continent + "suaugusio augalo aukstis " + height + " valgomas" + edible);

    }







}
