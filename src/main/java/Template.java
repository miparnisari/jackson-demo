import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Map;

public class Template {

    @JsonProperty("Properties")
    @JsonDeserialize(using = PropertyDeserializer.class)
    public Map<String, Object> propertyList;
}
