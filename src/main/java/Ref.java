import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Ref {

    private String reference;

    @JsonCreator
    public Ref(@JsonProperty("Ref")  String reference) {
        this.reference = reference;
    }
}
