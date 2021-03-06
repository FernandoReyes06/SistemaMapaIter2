package com.xiutech.simix.modelo;
// Generated 29-mar-2019 11:00:45 by Hibernate Tools 4.3.1



/**
 * Calificacion generated by hbm2java
 */
public class Calificacion  implements java.io.Serializable {


     private CalificacionId id;
     private Comentario comentario;
     private Comentarista comentarista;
     private int calificacion;

    public Calificacion() {
    }

    public Calificacion(CalificacionId id, Comentario comentario, Comentarista comentarista, int calificacion) {
       this.id = id;
       this.comentario = comentario;
       this.comentarista = comentarista;
       this.calificacion = calificacion;
    }
   
    public CalificacionId getId() {
        return this.id;
    }
    
    public void setId(CalificacionId id) {
        this.id = id;
    }
    public Comentario getComentario() {
        return this.comentario;
    }
    
    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }
    public Comentarista getComentarista() {
        return this.comentarista;
    }
    
    public void setComentarista(Comentarista comentarista) {
        this.comentarista = comentarista;
    }
    public int getCalificacion() {
        return this.calificacion;
    }
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }




}


