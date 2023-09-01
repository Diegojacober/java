package application;

import javax.persistence.*;

import domain.Pessoa;

public class Program {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "Roberto Miranda", "roberto@gmail.com");
        Pessoa p2 = new Pessoa(null, "Joao Pereira", "joao@gmail.com");
        Pessoa p3 = new Pessoa(null, "Pedro Marcelo", "pedro@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();

        System.out.println("Finalizado! ");

        em.close();
        emf.close();
    }
}
