/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package iut.dla.tp2CustomerApplicationSaidMansour.jsf;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author saims
 */
@Named(value = "bean1")
@RequestScoped
public class Bean1 {

    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;

    }

    public String afficher() {
        return "affichage_4?nb=" + nombre + "&amp;faces-redirect=true";
    }
}
