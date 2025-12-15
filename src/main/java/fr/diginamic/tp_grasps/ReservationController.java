package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.IClientDao;
import fr.diginamic.tp_grasps.daos.ITypeReservationDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import fr.diginamic.tp_grasps.factory.IReservationFactory;
import fr.diginamic.tp_grasps.services.ReservationService;

import static fr.diginamic.tp_grasps.utils.DateUtils.toDate;

/** Controlleur qui prend en charge la gestion des réservations client
 * @author RichardBONNAMY
 *
 */
public class ReservationController {

	/** DAO permettant d'accéder à la table des clients */
	private IClientDao clientDao = new ClientDao();
	
	/** DAO permettant d'accéder à la table des types de réservation */
	private ITypeReservationDao typeReservationDao = new TypeReservationDao();

    private ReservationService reservationService = new ReservationService();

	/** Méthode qui créée une réservation pour un client à partir des informations transmises
	 * @param params contient toutes les infos permettant de créer une réservation
	 * @return Reservation
	 */
    public Reservation creerReservation(Params params) {
        String identifiantClient = params.getIdentifiantClient();
        String dateReservationStr = params.getDateReservation();
        String typeReservation = params.getTypeReservation();
        int nbPlaces = params.getNbPlaces();

        LocalDateTime dateReservation = toDate(dateReservationStr);

        Client client = clientDao.extraireClient(identifiantClient);
        TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);

        double total = ReservationService.calculerMontant(client, type, nbPlaces);


        return IReservationFactory.creerReservation(dateReservation, client, type, nbPlaces, total);
    }
}
