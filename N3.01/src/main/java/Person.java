public record Person(String name,int age) {

    public Person {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }



}
