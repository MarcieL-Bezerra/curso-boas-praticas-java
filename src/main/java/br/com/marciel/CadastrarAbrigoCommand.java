package br.com.marciel;

import br.com.marciel.client.ClientHttpConfiguration;
import br.com.marciel.service.AbrigoService;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command {

    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(client);

            abrigoService.cadastrarAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
