package fr.diginamic.tp_grasps.factory;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

import java.time.LocalDateTime;

public interface IReservationFactory {

    static Reservation creerReservation(LocalDateTime dateReservation, Client client, TypeReservation type, int nbPlaces, double total) {

        Reservation reservation = new Reservation(dateReservation);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);
        reservation.setTotal(total);
        return reservation;
    }
}
