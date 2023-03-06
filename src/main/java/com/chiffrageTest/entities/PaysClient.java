
  package com.chiffrageTest.entities;
  
  import java.util.Collection;
  
  import javax.persistence.CascadeType; import javax.persistence.Column; import
  javax.persistence.Entity; import javax.persistence.FetchType; import
  javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
  import javax.persistence.Id; import javax.persistence.OneToMany;
  
  import org.hibernate.validator.constraints.Length; import
  org.hibernate.validator.constraints.NotEmpty;
  
  @Entity public class PaysClient {
  
  
  @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
  
  @Column(unique=true)
  
  @NotEmpty
  
  @Length(min = 2, max = 20) private String nomPays;
  
  @Column(unique=true)
  
  @NotEmpty
  
  @Length(min = 2, max = 20) private String adress;
  
  
 // @OneToMany(mappedBy = "paysClient",cascade = CascadeType.ALL,fetch =
  //FetchType.LAZY) private Collection<Client> clients;
  
  
  
  public PaysClient() { 
	  super(); 
  // TODO Auto-generated constructor stub }
  }
  
  
  
  
  public PaysClient(String nomPays) { super(); this.nomPays = nomPays; }
  
  
  public Long getId() { return id; }
  
  
  public void setId(Long id) { this.id = id; }
  
  
  public String getNomPays() { return nomPays; }
  
  
  public void setNomPays(String nomPays) { this.nomPays = nomPays; }
  
  
  
  
  public String getAdress() { return adress; }
  
  
  public void setAdress(String adress) { this.adress = adress; }
  
  
  
  
  }
 