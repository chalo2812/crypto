package ar.crypto.back.controller;

//import ar.crypto.back.service.DucoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController(value = "Controller de Duco")
@RequestMapping(path = "/duco")
@Tag(name = "Duco",
        description = "Api Rest status, monto y cotizacion de Duco")
public class DucoController {

//  @Autowired
//  private DucoService ducoService;

  @Operation(summary = "Metodo del balance de Duco-Coin.",
          description = "Metodo del balance de Duco-Coin")
  @GetMapping(name = "Metodo para obtener el saldo", path = "/balance")
  public String getBalance() throws URISyntaxException, IOException {
      return null;//ducoService.getBalance();
  }

}
