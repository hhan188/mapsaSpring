package org.mapsa.Practice24Part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
@Data
@AllArgsConstructor
public class Post2Service {


        SessionFactory sessionFactory;

        public void create(Post post){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(post);
        session.getTransaction().commit();
        session.close();
    }
        public void update(Post post){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(post);
        session.getTransaction().commit();
        session.close();
    }
        public void delete(Post post){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(post);
        session.getTransaction().commit();
        session.close();
    }
        public void getById(Integer id){
        Session session = sessionFactory.openSession();
        Post post = session.get(Post.class , id);
        session.close();
        System.out.println(post);
    }
    }
