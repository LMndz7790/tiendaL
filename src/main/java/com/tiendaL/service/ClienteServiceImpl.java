
package com.tiendaL.service;

import com.tiendaL.dao.ClienteDao;
import com.tiendaL.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao; 
    
    @Override
    @Transactional(readOnly=true)
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    @Transactional(readOnly=true)
    public Cliente getClientes(Cliente cliente) {
        return (Cliente) clienteDao;   //.findById(cliente.getIdCliente());
                
    }
    
}
