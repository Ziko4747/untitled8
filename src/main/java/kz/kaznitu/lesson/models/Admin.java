package main.java.kz.kaznitu.lesson.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String Name;
    private int baga;


    public Admin(String name, int baga) {
        this.Name = name;
        this.baga = baga;
    }

    public Admin() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getBaga() {
        return baga;
    }

    public void setBaga(int baga) {
        this.baga = baga;
    }
}
