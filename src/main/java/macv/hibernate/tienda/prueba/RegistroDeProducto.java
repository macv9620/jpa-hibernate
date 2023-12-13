package macv.hibernate.tienda.prueba;

import macv.hibernate.tienda.dao.CategoriaDao;
import macv.hibernate.tienda.dao.ProductoDao;
import macv.hibernate.tienda.modelo.Categoria;
import macv.hibernate.tienda.modelo.Producto;
import macv.hibernate.tienda.utils.JpaUtils;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class RegistroDeProducto {
    public static void main(String[] args) {
        Categoria celulares = new Categoria("CELULARES");

        Producto celular = new Producto(
                "Galaxy",
                "Usado",
                new BigDecimal("4500"),
                celulares);

        EntityManager em = JpaUtils.getEntityManager();

        ProductoDao productoDao = new ProductoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();


        categoriaDao.guardar(celulares);
        productoDao.guardar(celular);


        em.getTransaction().commit();
        em.close();
    }
}
