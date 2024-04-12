package br.com.marciel;

import br.com.marciel.client.ClientHttpConfiguration;
import br.com.marciel.service.PetService;

import java.io.IOException;

public class ListarPetsDoAbrigoCommand implements Command {

    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petService = new PetService(client);

            petService.listarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
