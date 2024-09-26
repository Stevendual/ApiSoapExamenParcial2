package principal.apisoapbancogt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TipoCambioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void obtenerTipoCambioDia_deberiaDevolverTipoCambio() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/tipo-cambio/dia"))
                .andExpect(status().isOk())
                .andExpect(content().string("7.75"));
    }
    //comentario para push
}

