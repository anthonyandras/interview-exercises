package com.aandras.interview.library.config;

import com.aandras.interview.library.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedList;
import java.util.List;

@Configuration
public class InventoryConfig {

    @Bean("inventory")
    public List<Book> inventory() {
        final Book sicp = Book.builder()
                .isbn("978-0262510875")
                .name("Structure and Interpretation of Computer Programs - 2nd Edition")
                .publisher("The MIT Press")
                .yearPublished(1996)
                .summary("Structure and Interpretation of Computer Programs has had a dramatic impact on computer science curricula over the past decade. This long-awaited revision contains changes throughout the text. There are new implementations of most of the major programming systems in the book, including the interpreters and compilers, and the authors have incorporated many small changes that reflect their experience teaching the course at MIT since the first edition was published. A new theme has been introduced that emphasizes the central role played by different approaches to dealing with time in computational models: objects with state, concurrent programming, functional programming and lazy evaluation, and nondeterministic programming. There are new example sections on higher-order procedures in graphics and on applications of stream processing in numerical programming, and many new exercises. In addition, all the programs have been reworked to run in any Scheme implementation that adheres to the IEEE standard.")
                .build();

        final Book unix = Book.builder()
                .isbn("978-0139376818")
                .name("The Unix Programming Environment")
                .publisher("Prentice-Hall")
                .yearPublished(1983)
                .summary("Designed for first-time and experienced users, this book describes the UNIX® programming environment and philosophy in detail. Readers will gain an understanding not only of how to use the system, its components, and the programs, but also how these fit into the total environment.")
                .build();

        final Book alg = Book.builder()
                .isbn("978-0321573513")
                .name("Algorithms (4th Edition)")
                .publisher("Addison-Wesley Professional")
                .yearPublished(2011)
                .summary("This fourth edition of Robert Sedgewick and Kevin Wayne’s Algorithms is the leading textbook on algorithms today and is widely used in colleges and universities worldwide. This book surveys the most important computer algorithms currently in use and provides a full treatment of data structures and algorithms for sorting, searching, graph processing, and string processing--including fifty algorithms every programmer should know. In this edition, new Java implementations are written in an accessible modular programming style, where all of the code is exposed to the reader and ready to use.")
                .build();

        final Book alg2 = Book.builder()
                .isbn("978-0321573513")
                .name("Algorithms (4th Edition)")
                .publisher("Addison-Wesley Professional")
                .yearPublished(2011)
                .summary("This fourth edition of Robert Sedgewick and Kevin Wayne’s Algorithms is the leading textbook on algorithms today and is widely used in colleges and universities worldwide. This book surveys the most important computer algorithms currently in use and provides a full treatment of data structures and algorithms for sorting, searching, graph processing, and string processing--including fifty algorithms every programmer should know. In this edition, new Java implementations are written in an accessible modular programming style, where all of the code is exposed to the reader and ready to use.")
                .build();

        final Book xen = Book.builder()
                .isbn("978-1593271862")
                .name("The Book Of Xen - A Practical Guide For The System Administrator")
                .publisher("No Starch Press")
                .yearPublished(2010)
                .summary("A really cool primer on the Xen hypervisor")
                .build();

        final List<Book> inventory = new LinkedList<>();
        inventory.add(xen);
        inventory.add(sicp);
        inventory.add(alg);
        inventory.add(alg2);
        inventory.add(unix);

        return inventory;
    }
}
