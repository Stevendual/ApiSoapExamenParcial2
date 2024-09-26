package principal.apisoapbancogt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipo-cambio")
public class TipoCambioController {
     @GetMapping("/dia")
    public String obtenerTipoCambioDia() {
        // Llama al servicio SOAP aquí y devuelve el resultado
        String tipoCambio = llamarServicioSoapTipoCambioDia();
        return tipoCambio;
    }

    private String llamarServicioSoapTipoCambioDia() {
        // Aquí haces la llamada al servicio SOAP del Banco de Guatemala
        return "7.75"; // Ejemplo: Simulando la respuesta del SOAP
    }
}
