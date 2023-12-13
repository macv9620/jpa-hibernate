package macv.hibernate.tienda.dao;

import macv.hibernate.tienda.modelo.Producto;

import javax.persistence.EntityManager;

public class ProductoDao {

    private EntityManager em;

    public ProductoDao(EntityManager em) {
        this.em = em;
    }

    public void guardar(Producto producto){
        this.em.persist(producto);
    }
}
