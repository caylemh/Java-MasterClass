public class Bed {
    private String size;

    public Bed(String size) {
        this.size = size;
    }

    public void making() {
        System.out.println("Bed -> Making");
    }

    public String getSize() {
        return size;
    }
}
