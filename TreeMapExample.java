package java_problems_datastructures;
import java.util.Iterator;
import java.util.TreeMap;

class Address {
    private String plotNo;
    private String at;
    private String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Address{" +
                "plotNo='" + plotNo + '\'' +
                ", at='" + at + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating TreeMap with name as key and Address as value
        TreeMap<String, Address> addressMap = new TreeMap<>();

        // Inserting values into the TreeMap
        addressMap.put("Alice", new Address("123", "Main Street", "CityA"));
        addressMap.put("Bob", new Address("456", "Park Avenue", "CityB"));
        addressMap.put("Charlie", new Address("789", "Broadway", "CityC"));

        // Using an iterator to display the TreeMap
        Iterator<String> iterator = addressMap.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            Address address = addressMap.get(name);
            System.out.println("Name: " + name + ", Address: " + address);
        }
    }
}
