package org.mapsa.Practice24Part1;


import com.sun.deploy.association.utility.DesktopEntry;
import org.mapsa.Practice24Part3.PostService;
import org.mapsa.SessionFactoryProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CrudTest {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService(SessionFactoryProvider.getSessionFactory());

        CategoryService categoryService = new CategoryService(SessionFactoryProvider.getSessionFactory());
        Post2Service postService = new Post2Service(SessionFactoryProvider.getSessionFactory());

        Author author1 = new Author("Ali", new Date());

        Author_Detail author1_detail = new Author_Detail("Haj");
        author1_detail.setAuthor(author1);
        author1.setAuthorDetail(author1_detail);

        Post post1 = new Post("My Name is Ali");
        Post post2 = new Post("I am 30");
        post2.setAuthor(author1);
        post1.setAuthor(author1);
        Category category1 = new Category("Category 1");
        Category category2 = new Category("Category 2");
        author1.setAuthorDetail(author1_detail);
        author1_detail.setAuthor(author1);
        post1.setAuthor(author1);
        post2.setAuthor(author1);
        author1.setPosts(Arrays.asList(post1, post2));
        category1.setPosts(Arrays.asList(post1));
        category2.setPosts(Arrays.asList(post1,post2));
        post1.setCategories(Arrays.asList(category1));
        post2.setCategories(Arrays.asList(category1,category2));
        authorService.create(author1);
        categoryService.create(category1);
        categoryService.create(category2);
       /* categories.add(category1);
        categories.add(category2);
        post1.setCategories(categories);
        category2.setPosts(posts);
        category1.setPosts(posts);
        author1.setAuthorDetail(author1_detail);
        author1_detail.setAuthor(author1);
        post1.setAuthor(author1);
        post2.setAuthor(author1);
        post1.setCategories(categories);
        post2.setCategories(categories);
        category1.setPosts(posts);
        category2.setPosts(posts);
        authorService.create(author1);*/
       // postService.create(post1);
        //postService.create(post2);
/*        categoryService.create(category1);
        categoryService.create(category2);*/
    }
}
