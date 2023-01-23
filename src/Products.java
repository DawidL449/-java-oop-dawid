public class Products {
    private String title;
    private int reference;
    private Double cost;
    private String description;

    public Products() {

    }

    public Products(String title, int reference, Double cost, String description) {
        this.title = title;
        this.reference = reference;
        this.cost = cost;
        this.description = description;

    }

    public String getTitle() {
        return title;
    }

    public void SetTitle(String title) {
        this.title = title;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Products: " +
                " Title => '" + title + '\'' +
                ", Num => " + reference +
                ", Cost => " + cost +
                ", Description => " + description +
                //", manufacturer=" + manufacturer +
                '}';
    }
}