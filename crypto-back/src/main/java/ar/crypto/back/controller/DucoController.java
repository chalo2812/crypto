package ar.crypto.back.controller;

import ar.crypto.back.service.DucoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController(value = "Api Rest de Duco-coin")
@RequestMapping(path = "/duco")
@Tag(name = "Duco", description = "Api Rest status, monto y cotizacion de Duco")
public class DucoController {

  @Autowired
  private DucoService ducoService;

  @Operation(summary = "Metodo del balance de Duco-Coin.", description = "Balance de Duco-Coin.")
  @GetMapping(name = "Metodo para obtener el saldo", path = "/balance/{nameAccount}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public String balance(@PathVariable String nameAccount) throws URISyntaxException, IOException {
      return ducoService.getBalance(nameAccount);
  }

}
