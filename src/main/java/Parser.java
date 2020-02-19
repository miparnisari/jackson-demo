import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class Parser {

    public void read() throws IOException {
        InputStream is = this.getClass().getResourceAsStream("/demo.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.readValue(is, Template.class);
    }
}
