package ar.web.crypto.back.controller;

import ar.web.crypto.back.service.BinanceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController(value = "Controller de Binance")
@RequestMapping(path="/binance")
@Tag(name = "Binance", description = "Rest Api consultando a Binance")
public class BinanceController {

    @Autowired
    private BinanceService binanceService;

    @Operation(tags = {"Binance"},
//            security=@SecurityRequirement(name= Authentication.),
            summary = "foo",
            description = "bar")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200",description = "OK")
    })
    @GetMapping(name = "Metodo para probar el servicio este levantado", path = "/cryptocurrency")
    public String postCrypto() throws URISyntaxException, IOException {
        return binanceService.postCrypto();
    }

}
