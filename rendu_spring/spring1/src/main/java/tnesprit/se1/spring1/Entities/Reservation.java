package tnesprit.se1.spring1.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;

    public Reservation() {
    }

    public Reservation(String idReservation, Date anneeUniversitaire, boolean estValide) {
        this.idReservation = idReservation;
        this.anneeUniversitaire = anneeUniversitaire;
        this.estValide = estValide;
    }

    public String getIdReservation() {
        return idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public boolean isEstValide() {
        return estValide;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }
}
