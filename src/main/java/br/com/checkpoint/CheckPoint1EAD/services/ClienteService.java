package br.com.checkpoint.CheckPoint1EAD.services;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    final
    ClienteService clienteService;

    public ClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

}