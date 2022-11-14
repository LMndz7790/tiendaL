
package com.tiendaL.service;

import com.tiendaL.dao.ClienteDao;
import com.tiendaL.dao.CreditoDao;
import com.tiendaL.domain.Cliente;
import com.tiendaL.domain.Credito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;
    
    @Autowired
    private CreditoDao creditoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente getClientes(Cliente cliente) {
        
        //return clienteDao.findById(cliente.getIdCliente()).orElse(null);
        return (Cliente) clienteDao;

    }

    @Override
    @Transactional
    public void save(Cliente cliente) {  //idCliente = null,........(idCredito = null, limite= 5,000,000)
        clienteDao.save(cliente);
        Credito credito = cliente.getCredito(); // id = null, limite= 2,000,000
        creditoDao.save(credito);
        cliente.setCredito(credito);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

}
