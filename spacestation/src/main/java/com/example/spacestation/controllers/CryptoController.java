package com.example.spacestation.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.spacestation.models.HashRequest;
import com.example.spacestation.models.HashResponse;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
@RestController
public class CryptoController {
    @PostMapping("/crypto/hash")
    public HashResponse calcolaHash(@RequestBody HashRequest richiesta)
    {
        try{
            // 1. Prendiamo l'algoritmo richiesto (es. "SHA-256")
            String algo = richiesta.getAlgorithm();

            // 2. Inizializziamo il "tritacarne" di Java (MessageDigest)
            MessageDigest digest = MessageDigest.getInstance(algo);

            // 3. Trasformiamo il testo in byte e calcoliamo l'hash
            byte[] hashBytes = digest.digest(
            richiesta.getText().getBytes(StandardCharsets.UTF_8));

            // 4. Convertiamo i byte in stringa esadecimale leggibile
            StringBuilder hexString = new StringBuilder();
            for(byte b: hashBytes)
            {
                //Trasforma ogni byte in 2 caratteri esadecimali
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1)
                {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            String risultatoFinale = hexString.toString();
            return new HashResponse(richiesta.getText(), algo, risultatoFinale);
        }
        catch (NoSuchAlgorithmException e)
        {
            //Se l'utente chiede un algoritmo che non esiste gestisco l'errore
            return new HashResponse(richiesta.getText(), "ERRORE: Algoritmo non valido!!!", "");
        }
    }
}
