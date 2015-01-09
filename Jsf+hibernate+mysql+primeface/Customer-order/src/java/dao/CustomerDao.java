/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entity.Customer;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author yasin
 */
public class CustomerDao {
    public void addCustomer(Customer cust) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(cust);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
          e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
 
    public void deleteCustomer(Customer cust) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
         //  Customer cust = (Customer) session.load(Customer.class, new Integer(custid));
            session.delete(cust);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
           e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
 
    public void updateCustomer(Customer cust) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(cust);
           
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
           e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
 
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<Customer>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String hql="FROM entity.Customer";
            customers = session.createQuery(hql).list();
        } catch (RuntimeException e) {
           e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return customers;
    }
 
    public List<Customer> getCustomerById(String custid) {
        System.out.println(custid);
        Customer cust = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Customer where concat(first_name, ' ', last_name) = :id";
            Query query = session.createQuery(queryString);
            query.setString("id", custid);
            //cust = (Customer) query.uniqueResult();
            List<Customer> list = query.list();
            if (list.size() > 0) {
                return list;
            }
        } catch (RuntimeException e) {
           // e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return null;
    }
}
