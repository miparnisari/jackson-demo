import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class PropertyDeserializer extends JsonDeserializer<Map<String, Property>> {
    public Map<String, Property> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Property> result =
                mapper.readValue(jsonParser, new TypeReference<Map<String,Property>>() {});

        return result;
    }
}
