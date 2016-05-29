/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.enviolibre.apis;

import java.util.List;
import utn.enviolibre.model.TarjetaCredito;

/**
 *
 * @author flpitu88
 */
public interface TarjetasCreditoAPI {

    public List<TarjetaCredito> getTodasLasTarjetas();

    public TarjetaCredito getTarjetaById(int id);

    public void guardarTarjetaCredito(TarjetaCredito tc);
}
