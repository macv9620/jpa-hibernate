package macv.hibernate.tienda.prueba;

import macv.hibernate.tienda.dao.CategoriaDao;
import macv.hibernate.tienda.modelo.Categoria;
import macv.hibernate.tienda.utils.JpaUtils;
import javax.persistence.EntityManager;


public class RegistroDeProducto {
    public static void main(String[] args) {
        Categoria celulares = new Categoria("CELULARES");

        EntityManager em = JpaUtils.getEntityManager();

        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();

        categoriaDao.guardar(celulares);

        celulares.setName("LIBROS");

        em.flush();
        em.clear();

        celulares = em.merge(celulares);
        celulares.setName("SOFTWARE");

        em.flush();
    }
}
