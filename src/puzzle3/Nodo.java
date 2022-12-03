/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle3;

import java.util.ArrayList;

public class Nodo {
    
    int [][]estado;
    ArrayList<Nodo> hijos=new ArrayList<Nodo>();
    Nodo padre;

    public Nodo(int[][] estado) {
        this.estado = estado;
        hijos=null;
        padre=null;
    }

    public int[][] getEstado() {
        return estado;
    }

    public void setEstado(int[][] estado) {
        this.estado = estado;
    }

    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
        if(hijos!=null){
            for(Nodo h:hijos){
                h.padre=this;
            }
        }
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
    
    
    
    
}
