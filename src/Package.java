import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Objects;

public class Package {
    private String departureCity;
    private String cityOfReceipt;
    private double weight;
    private ZonedDateTime creationDateTime;

    public Package(String departureCity, String cityOfReceipt, double weight,
                   ZonedDateTime creationDateTime) {
        this.departureCity = departureCity;
        this.cityOfReceipt = cityOfReceipt;
        this.weight = weight;
        this.creationDateTime = creationDateTime;
    }

    public Instant getCreationDateTimeInUTC() {
        return creationDateTime.toInstant();
    }

    @Override
    public String toString() {
        return "Package1{" +
                "departureCity='" + departureCity + '\'' +
                ", cityOfReceipt='" + cityOfReceipt + '\'' +
                ", weight=" + weight +
                ", creationDateTime=" + creationDateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package package1 = (Package) o;
        return Double.compare(weight, package1.weight) == 0
                && Objects.equals(departureCity, package1.departureCity)
                && Objects.equals(cityOfReceipt, package1.cityOfReceipt)
                && Objects.equals(creationDateTime, package1.creationDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, cityOfReceipt, weight, creationDateTime);
    }

    public String getCityOfReceipt() {
        return cityOfReceipt;
    }
}
