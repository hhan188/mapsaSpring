package org.mapsa.Practice24Part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class CategoryService {
    SessionFactory sessionFactory;

    public void create(Category category) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(category);
        session.getTransaction().commit();
        session.close();
    }

    public void update(Category category) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(category);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Category category) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(category);
        session.getTransaction().commit();
        session.close();
    }

    public void getById(Integer id) {
        Session session = sessionFactory.openSession();
        Category category = session.get(Category.class, id);
        session.close();
        System.out.println(category);
    }

    public Post getByName(String name) throws Exception {
        Session session = sessionFactory.openSession();
        String query = "select p from post p where p.name =:x";
        Query q = session.createQuery(query);
        q.setParameter("x", name);
        List<Post> posts;
        try {

            posts = q.list();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } finally {
            session.close();
        }
        return posts.get(0);
    }


}
