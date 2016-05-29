/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.enviolibre.services;

import utn.enviolibre.apis.TarjetasCreditoAPI;
import java.util.List;
import utn.enviolibre.model.TarjetaCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.enviolibre.repository.TarjetaCreditoDAO;

/**
 *
 * @author flpitu88
 */
@Service
public class TarjetaCreditoService implements TarjetasCreditoAPI {

    @Autowired
    private TarjetaCreditoDAO tarjetaDAO;

    @Override
    public TarjetaCredito getTarjetaById(int id) {
        return tarjetaDAO.getTarjetaById(id);
    }

    @Override
    public void guardarTarjetaCredito(TarjetaCredito tc) {
        tarjetaDAO.guardarTarjetaCredito(tc);
    }

    @Override
    public List<TarjetaCredito> getTodasLasTarjetas() {
        return tarjetaDAO.getTarjetas();
    }

}
