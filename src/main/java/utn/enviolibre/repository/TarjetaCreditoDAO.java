/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.enviolibre.repository;

import java.util.List;
import utn.enviolibre.model.TarjetaCredito;

/**
 *
 * @author flpitu88
 */
public interface TarjetaCreditoDAO {

    public TarjetaCredito getTarjetaById(int id);

    public List<TarjetaCredito> getTarjetas();

//    public TarjetaCredito getTarjetaByIdUsuario(int idUser);

    public void guardarTarjetaCredito(TarjetaCredito tc);
}
