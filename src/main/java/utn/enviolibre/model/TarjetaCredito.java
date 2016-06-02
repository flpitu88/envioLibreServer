/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.enviolibre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author flpitu88
 */
@Entity
@Table(name = "TarjetaCredito")
public class TarjetaCredito {

    private int id;
    private String entidad;
    private String tokenMP;
//    private Usuario usuario;

    public TarjetaCredito(String entidad, String tokenMP) {
        this.entidad = entidad;
        this.tokenMP = tokenMP;
    }

    public TarjetaCredito() {
    }

    public TarjetaCredito(int id, String entidad, String tokenMP, Usuario usuario) {
        this.id = id;
        this.entidad = entidad;
        this.tokenMP = tokenMP;
//        this.usuario = usuario;
    }

    @Id
    @Column(name = "idTarjetaCredito")
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @OneToOne(fetch = FetchType.LAZY)
//    @PrimaryKeyJoinColumn
//    public Usuario getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }

    @Column(name = "entidad")
    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Column(name = "token")
    public String getTokenMP() {
        return tokenMP;
    }

    public void setTokenMP(String tokenMP) {
        this.tokenMP = tokenMP;
    }

}
