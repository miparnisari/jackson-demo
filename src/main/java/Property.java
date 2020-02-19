import com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.util.List;

public class Property {

    private Object value;

    public Property(String value) {
        this.value = value;
    }

    public Property(int value) {
        this.value = value;
    }

    public Property(List<String> values) {
        this.value = values;
    }
    public Property(boolean value) {
        this.value = value;
    }

    public Property(Ref reference) {
        this.value = reference;
    }

}
