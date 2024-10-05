package org.example.finalworkapi.Domain.Entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SparPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int idRepuesto;
    protected int idLogistics;
    protected Date arrivalDate;
    protected String sparePart;
    protected int quantity;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public SparPart() {
    }

    public SparPart(int idRepuesto, int idLogistics, Date arrivalDate, String sparePart, int quantity) {
        this.idRepuesto = idRepuesto;
        this.idLogistics = idLogistics;
        this.arrivalDate = arrivalDate;
        this.sparePart = sparePart;
        this.quantity = quantity;
    }

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public int getIdLogistics() {
        return idLogistics;
    }

    public void setIdLogistics(int idLogistics) {
        this.idLogistics = idLogistics;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getSparePart() {
        return sparePart;
    }

    public void setSparePart(String sparePart) {
        this.sparePart = sparePart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
