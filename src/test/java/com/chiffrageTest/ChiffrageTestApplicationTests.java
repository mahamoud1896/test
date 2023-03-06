/*
 * package com.chiffrageTest;
 * 
 * import java.util.List;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * import com.chiffrageTest.dao.ActionRepository; import
 * com.chiffrageTest.dao.ActiviteRepository; import
 * com.chiffrageTest.dao.FicheProjetRepository; import
 * com.chiffrageTest.dao.ProfilRepository; import
 * com.chiffrageTest.dao.RessourceRepository; import
 * com.chiffrageTest.dao.RoleRepository; import
 * com.chiffrageTest.dao.TypeActiviteRepository; import
 * com.chiffrageTest.dao.TypeProjetRepository; import
 * com.chiffrageTest.dao.UserRepository; import
 * com.chiffrageTest.entities.Profil; import
 * com.chiffrageTest.entities.Ressource; import
 * com.chiffrageTest.entities.TypeActivite; import
 * com.chiffrageTest.service.IchiffrageService;
 * 
 * @SpringBootTest class ChiffrageTestApplicationTests {
 * 
 * 
 * @Autowired private RessourceRepository ressourceRepository;
 * 
 * @Autowired private ActiviteRepository activiteRepository;
 * 
 * @Autowired private FicheProjetRepository ficheProjetRepository;
 * 
 * @Autowired private RoleRepository roleRepository;
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * @Autowired private ProfilRepository profilRepository;
 * 
 * @Autowired private ActionRepository actionRepository;
 * 
 * @Autowired private TypeActiviteRepository typeActiviteRepository;
 * 
 * @Autowired private TypeProjetRepository typeProjetRepository;
 * 
 * @Autowired private IchiffrageService ichiffrageService;
 * 
 * 
 * public static void main(String[] args) {
 * 
 * 
 * 
 * }
 * 
 * @Test void contextLoads() {
 * 
 * 
 * Profil p1 = profilRepository.save(new Profil("DEV-SENIOR", 2000)); Profil p2
 * = profilRepository.save(new Profil("TESTEUR", 1000)); Profil p3 =
 * profilRepository.save(new Profil("DESIGNER", 500));
 * 
 * 
 * Ressource r1 = ressourceRepository.save(new Ressource("TOURE", "Momo",
 * "UserInterne", p3)); Ressource r2 = ressourceRepository.save(new
 * Ressource("KONE", "Junior", "UserInterne", p1)); Ressource r3 =
 * ressourceRepository.save(new Ressource("FALL", "Adja", "UserInterne", p2));
 * 
 * TypeActivite ta1 = typeActiviteRepository.save(new
 * TypeActivite("CONCEPTION")); TypeActivite ta2 =
 * typeActiviteRepository.save(new TypeActivite("Developpement")); TypeActivite
 * ta3 = typeActiviteRepository.save(new TypeActivite("TEST"));
 * 
 * //TypeProjet tp1 = typeProjetRepository.save(new TypeProjet("Design"));
 * //TypeProjet tp2 = typeProjetRepository.save(new TypeProjet("Scoring"));
 * 
 * 
 * //FicheProjet fp1 = ficheProjetRepository.save(new FicheProjet(null,
 * "scoringTpe", "Projet de scoring Tpe", "Momo", new Date(2022-05-05), new
 * Date(2022-10-26), new Date(2022-05-12), new Date(2022-10-25), null, tp2) );
 * 
 * List<Profil> lp1 = ichiffrageService.listProfil(); List<Ressource> lr1 =
 * ichiffrageService.listRessource(); List<TypeActivite> tp1 =
 * ichiffrageService.listTypeActivite();
 * 
 * System.out.println(lp1 + "\n"); System.out.println(lr1 +"\n");
 * System.out.println(tp1 +"\n"); }
 * 
 * }
 */