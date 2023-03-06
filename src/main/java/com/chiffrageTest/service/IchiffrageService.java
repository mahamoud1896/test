package com.chiffrageTest.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.chiffrageTest.entities.Action;
import com.chiffrageTest.entities.Activite;
import com.chiffrageTest.entities.AdresseClient;
import com.chiffrageTest.entities.Client;
import com.chiffrageTest.entities.DepensesFixes;
import com.chiffrageTest.entities.EtatProjet;
import com.chiffrageTest.entities.FicheProjet;
import com.chiffrageTest.entities.ObjectifAnnuel;
import com.chiffrageTest.entities.Offre;
import com.chiffrageTest.entities.PaysClient;
import com.chiffrageTest.entities.Profil;
import com.chiffrageTest.entities.RessActivite;
import com.chiffrageTest.entities.Ressource;
import com.chiffrageTest.entities.Role;
import com.chiffrageTest.entities.TypeActivite;
import com.chiffrageTest.entities.TypeProjet;
import com.chiffrageTest.entities.User;

public interface IchiffrageService {
	
	
	//AFFICHAGE/VISUALISATION
	public List<Ressource> listRessource();
	public List<Client> listClient();
	public List<AdresseClient> listAdresseClient();
	public List<PaysClient> listPaysClient();
	public List<Activite> listActivite();
	public List<FicheProjet> listFicheProjet();
	public Optional<FicheProjet> listFicheProjetById(Long id);
	public List<Role> listRole();
	
	public List<User> listUser();
	public List<Action> listAction();
	public List<Profil> listProfil(String keyword);
	public List<TypeProjet> listTypeProj();
	public List<TypeActivite> listTypeActivite();
	public List<Offre> listOffre(String keyword);
	public List<ObjectifAnnuel> listObjectif();
	public List<RessActivite> listRessActivite();
	public Optional<RessActivite> listRessActiviteById(Long id);
	public List<DepensesFixes> listDepensesFixes(String keyword);
	
	
	
	//SAUVEGARDER/ENREGISTRER DONNEES
	public Ressource saveRess(Ressource ressource);
	public Client saveClient(Client client);
	public AdresseClient saveAdresseClient(AdresseClient adresseClient);
	public PaysClient savePaysClient(PaysClient paysClient);
	public Activite saveActivite(Activite activite, Long id);
	public Activite editActivite(Activite activite);
	public FicheProjet saveFicheProjet(FicheProjet ficheProjet);
	public Role saveRole(Role role);
	public User saveUser(User user);
	public Action saveAction(Action action);
	public Profil saveProfil(Profil profil);
	public TypeProjet saveTypeProjet(TypeProjet typeProjet);
	public TypeActivite saveTypeActivite(TypeActivite typeActivite);
	public Offre saveOffre(Offre offre);
	public ObjectifAnnuel saveObjectifAnnuel(ObjectifAnnuel objAnnuel);
	public RessActivite saveRessActivite(RessActivite ressActivite, Long id);
	public DepensesFixes saveDepensesFixe(DepensesFixes depensesFixes);
	
	
	//RECUPERER DONNEES POUR POUVOR EDITER
	public Ressource getRess(Long id);
	public Client getClient(Long id);
	public AdresseClient getAdresseClient(Long id);
	public PaysClient getPaysClient(Long id);
	public Activite getActivite(Long id);
	public FicheProjet getFicheProjet(Long id);
	public Role getRole(Long id);
	public User getUser(Long id);
	public Action getAction(Long id);
	public Profil getProfil(Long id);
	public TypeProjet getTypeProjet(Long id);
	public TypeActivite getTypeActivite(Long id); 
	public Offre getOffre(Long id);
	public ObjectifAnnuel getObjectif(Long id);
	public RessActivite getRessActivite(Long id);
	public Ressource getRessProjet(Long idFicheProj);
	public DepensesFixes getDepensesFixe(Long idDepFixe);
	
	//public double getCout(Long id);
	
	
	//SUPPRIMER DONNEES
	public void deleteRess(Long id);
	public void deleteClient(Long id);
	public void deleteAdresseClient(Long id);
	public void deletePaysClient(Long id);
	public void deleteActivite(Long id);
	public void deleteAction(Long id);
	public void deleteFicheProjet(Long id);
	public void deleteRoles(Long id);
	public void deleteUser(Long id);
	public void deleteProfil(Long id);
	public void deleteTypeActivite(Long id);
	public void deleteTypeProjet(Long id);
	public void deleteOffre(Long id);
	public void deleteObjectif(Long id);
	public void deleteRessActivite(Long id);
	public void deleteDepensesFixes(Long id);
	
	
	
	
	
	//LISTE DES ACTIVITES D'UNE FICHE DE PROJET
	public List<Activite> getFicheProjetActivite(Long idFicheProjet);
	
	
	//LISTE DES RESSOURCES D'UNE FICHE DE PROJET
	public List<Ressource> getFicheProjetRessource(Long idFicheProjet);
	
	
	//LISTE DES ACTIONS D'UN USER 
	public List<Action> getUserAction(Long idUser);
	
	
	//ADRESSE D'UN CLIENT
	
	//AFFECTER RESS A FICHE PROJET
	public void ressProjet(FicheProjet ficheProjet);
	
	//public double pourcentageAtteintObjct(FicheProjet fiche);
	
	//public double tauxRentaMoyen(FicheProjet fiche);
	
	//public long delaiMoyenLivraison(FicheProjet fiche);
	
	
	//Assign Role to User
	public void assignUserRole(Long userId, Long roleId);
	
	//MODIFIER ETAT DU PROJET
	public void updateEtatFiche(Long id);
	
	//Unassign Role to User
	public void unassignUserRole(Long userId, Long roleId);
	
	public Collection<Role> getUserRoles(User user);
	
	Page<Ressource> findPaginatedRessource(int pageNo, int pageSize, String sortField, String sortDir);
	public Page<Profil> findPaginatedProfil(int pageNo, int pageSize, String sortField, String sortDir);
	Page<FicheProjet> findPaginatedFicheProj(int pageNo, int pageSize, String sortField, String sortDir);
	
	Page<TypeActivite> findPaginatedTypeAct(int pageNo, int pageSize);
	
	
	
	
	

}
