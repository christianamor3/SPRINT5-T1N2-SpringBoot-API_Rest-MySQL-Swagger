package cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n02.S05T01N02AmorLopezChristian.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name="Flores")
public class FlorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pk_FlorID;

    @Column(name="NOM")
    private String nomFlor;
    @Column(name="PAIS")
    private String paisFlor;

    public FlorEntity(int pk_FlorID, String nomFlor, String paisFlor) {
        this.pk_FlorID = pk_FlorID;
        this.nomFlor = nomFlor;
        this.paisFlor = paisFlor;
    }

    
    public FlorEntity(String nomFlor, String paisFlor) {
		this.nomFlor = nomFlor;
		this.paisFlor = paisFlor;
	}


	public FlorEntity() {
    }


	public int getPk_FlorID() {
		return pk_FlorID;
	}


	public void setPk_FlorID(int pk_FlorID) {
		this.pk_FlorID = pk_FlorID;
	}


	public String getNomFlor() {
		return nomFlor;
	}


	public void setNomFlor(String nomFlor) {
		this.nomFlor = nomFlor;
	}


	public String getPaisFlor() {
		return paisFlor;
	}


	public void setPaisFlor(String paisFlor) {
		this.paisFlor = paisFlor;
	}

    
}
