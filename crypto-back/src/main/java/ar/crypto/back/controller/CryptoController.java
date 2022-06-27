package ar.crypto.back.controller;

import ar.crypto.back.service.CryptoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController(value = "Controller de Crypto")
@RequestMapping(path = "/crypto/api/v1")
@Tag(name = "Crypto",
        description = "Api donde consultaremos status, monto y cotizacion de las criptos")
public class CryptoController {

    @Autowired
    private CryptoService cryptoService;

    @Operation(summary = "Metodo para probar el servicio este levantado",
            description = "Metodo para probar el servicio este levantado")
    @GetMapping(name = "Metodo para probar el servicio este levantado", path = "/cryptocurrency")
    public String postCrypto() throws URISyntaxException, IOException {
        return cryptoService.postCrypto();
    }

}
