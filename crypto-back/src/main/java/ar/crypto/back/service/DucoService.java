package ar.crypto.back.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;

@Service
public interface DucoService {

    /**
     * Metodo que devuelve el balance de la cuenta de Duco
     * @param nameAccount Nombre de la cuenta
     * @return String Devuelve el balance de la cuenta de Duco
     */
    String getBalance(String nameAccount) throws URISyntaxException, IOException;

}
