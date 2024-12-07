package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        // Получение сессии Hibernate
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Начало транзакции
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();

            // Создание объектов Person
            Person person1 = new Person("Alice", 30);
            Person person2 = new Person("Bob", 25);

            // Сохранение объектов в базу данных
            session.save(person1);
            session.save(person2);

            // Завершение транзакции
            transaction.commit();
            System.out.println("Объекты сохранены!");
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        // Закрытие SessionFactory
        HibernateUtil.shutdown();
    }
}
