package com.mycompany.ontap1.Utiliities;


import com.mycompany.ontap1.Model.Account;
import com.mycompany.ontap1.Model.Bank;
import com.mycompany.ontap1.Model.CurrentAccount;
import com.mycompany.ontap1.Model.Customer;
import com.mycompany.ontap1.Model.SavingAccount;
//import com.mycompany.ontap1.Utilities.*;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernatUtil {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServer2012Dialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=ONTAPJAVA");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "08102003");
        properties.put(Environment.SHOW_SQL, "true");
        //gen DB tự động
        properties.put(Environment.HBM2DDL_AUTO, "update");

        conf.setProperties(properties);
      
        conf.addAnnotatedClass(CurrentAccount.class);
        conf.addAnnotatedClass(SavingAccount.class);
        conf.addAnnotatedClass(Customer.class);
        conf.addAnnotatedClass(Bank.class);
        conf.addAnnotatedClass(Account.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        getFACTORY();
    }

}
