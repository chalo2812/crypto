package ar.crypto.back.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;

@Service
public interface CryptoService {

    /**
     * Metodo que devuelve la lista de las crypto que tienes
     * @return String Devuelve la lista de las crypto
     * @throws IOException Exception del archivo
     * @throws URISyntaxException Exception con la sintaxis de la URL
     */
    String postCrypto() throws IOException, URISyntaxException;
}
