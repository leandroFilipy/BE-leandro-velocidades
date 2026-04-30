package com.atividade.leandro_velocidades.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.atividade.leandro_velocidades.dto.ClienteRequest;
import com.atividade.leandro_velocidades.dto.ClienteResponse;
import com.atividade.leandro_velocidades.mapper.ClienteMapper;
import com.atividade.leandro_velocidades.model.Cliente;
import com.atividade.leandro_velocidades.repository.ClienteRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ClienteService {
    

    private final ClienteMapper mapper;
    private final ClienteRepository repository;

    public ClienteResponse create(ClienteRequest clienteRequest){
        Cliente cliente = mapper.toEntity(clienteRequest);
        Cliente clienteSaCliente = repository.save(cliente);
        ClienteResponse clienteResponse = mapper.toResponse(clienteSaCliente);
        
        return clienteResponse;
    } 

    public ClienteResponse listById(long id){
        Cliente cliente = repository.findById(id).orElseThrow(() -> new RuntimeException("não tem um cliente com este id "));
        ClienteResponse clienteResponse = mapper.toResponse(cliente);

        return clienteResponse;
    }

    public List<ClienteResponse> listAll(){
        List<Cliente> clientes = repository.findAll();
        List<ClienteResponse> dto = new ArrayList<>();

        for(Cliente c: clientes){
            dto.add(mapper.toResponse(c));
        }

        return dto;
    }



}
