package macv.hibernate.tienda.dao;

import macv.hibernate.tienda.modelo.Categoria;
import macv.hibernate.tienda.modelo.Producto;

import javax.persistence.EntityManager;

public class CategoriaDao {

    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void guardar(Categoria categoria){
        this.em.persist(categoria);
    }
}
