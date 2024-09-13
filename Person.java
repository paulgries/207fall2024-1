public class Person {
    private String first;
    private final String last;
    private final String utorid;

    public Person(String first, String last, String utorid) {
        this.first = first;
        this.last = last;
        this.utorid = utorid;
    }

    public String getUtorid() {
        return utorid;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String newFirst) {
        this.first = newFirst;
    }
}
