package com.atividade.leandro_velocidades.mapper;

import org.springframework.stereotype.Component;

import com.atividade.leandro_velocidades.dto.ClienteRequest;
import com.atividade.leandro_velocidades.dto.ClienteResponse;
import com.atividade.leandro_velocidades.model.Cliente;

@Component
public class ClienteMapper {
    

    public Cliente toEntity(ClienteRequest clienteRequest){
        return new Cliente(
            clienteRequest.nome(),
            clienteRequest.cnh(),
            clienteRequest.email()
        );
    }

    public ClienteResponse toResponse(Cliente cliente){
        return new ClienteResponse(
            cliente.getId(),
            cliente.getNome(),
            cliente.getCnh(),
            cliente.getEmail()
        );
    }

}
