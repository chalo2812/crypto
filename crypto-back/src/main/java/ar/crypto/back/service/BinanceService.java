package ar.crypto.back.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;

@Service
public interface BinanceService {

    /**
     *
     * @return
     * @throws URISyntaxException
     * @throws IOException
     */
    String postCrypto() throws URISyntaxException, IOException;
}
