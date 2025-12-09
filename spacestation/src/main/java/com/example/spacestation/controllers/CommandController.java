package com.example.spacestation.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.spacestation.models.Comando;

@RestController
public class CommandController {
    //Definisco che questo metodo risponde a richieste POST sull'indirizzo /comandi
    @PostMapping("/comandi/")
    public String eseguiComando(@RequestBody Comando cmd)
    {
        //Simulo l'esecuzione
        String risposta = "Ricevuto ordine" + cmd.getCodice();
        //Aggiungo un controllo sul messaggio
        risposta += "--Dettaglio: " + cmd.getMessaggio()+"--";

        return risposta;
    }

}
