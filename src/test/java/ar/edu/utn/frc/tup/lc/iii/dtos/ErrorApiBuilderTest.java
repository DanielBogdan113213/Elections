package ar.edu.utn.frc.tup.lc.iii.dtos;

import ar.edu.utn.frc.tup.lc.iii.dtos.ErrorApi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ErrorApiBuilderTest {

    @Test
    public void testBuilder() {
        ErrorApi errorApi = ErrorApi.builder()
                .timestamp("2024-12-03T00:00:00")
                .status(403)
                .error("Forbidden")
                .message("Access denied")
                .build();

        assertEquals("2024-12-03T00:00:00", errorApi.getTimestamp());
        assertEquals(403, errorApi.getStatus());
        assertEquals("Forbidden", errorApi.getError());
        assertEquals("Access denied", errorApi.getMessage());
    }
}
