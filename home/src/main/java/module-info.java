module com.mycompany.project3ap {
    requires javafx.controls;
    
    requires org.hibernate.orm.core; 
    requires java.naming; 
    requires java.persistence; 
    requires java.sql;
    
    opens com.mycompany.project3ap to org.hibernate.orm.core;
    exports com.mycompany.project3ap;
}
