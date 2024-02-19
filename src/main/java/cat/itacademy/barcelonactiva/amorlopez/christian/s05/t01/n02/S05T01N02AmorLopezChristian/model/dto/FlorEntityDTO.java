package cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n02.S05T01N02AmorLopezChristian.model.dto;

import java.util.Arrays;
import java.util.List;

import cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n02.S05T01N02AmorLopezChristian.model.domain.FlorEntity;

public class FlorEntityDTO {

    private int pk_FlorID;
    private String nomFlor;
    private String paisFlor;

    private String tipusFlor;

    private static final List<String> paises = Arrays.asList("Alemania", "Austria", "Bélgica", "Bulgaria",
            "Chipre", "Croacia", "Dinamarca", "Eslovaquia", "Eslovenia", "España", "Estonia", "Finlandia", "Francia",
            "Grecia", "Hungría", "Irlanda", "Italia", "Letonia", "Lituania", "Luxemburgo", "Malta", "Países Bajos",
            "Polonia", "Portugal", "República Checa", "Rumanía", "Suecia");

    public FlorEntityDTO() {
    }

    public FlorEntityDTO(int pk_FlorID, String nomFlor, String paisFlor, String tipusFlor) {
        this.pk_FlorID = pk_FlorID;
        this.nomFlor = nomFlor;
        this.paisFlor = paisFlor;
        this.tipusFlor = tipusFlor;
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

    public String getTipusFlor() {
        return tipusFlor;
    }

    public void setTipusFlor(String tipusFlor) {
        this.tipusFlor = tipusFlor;
    }

    public static FlorEntityDTO toDTO(FlorEntity flor){
        FlorEntityDTO florEntityDTO = new FlorEntityDTO();

        florEntityDTO.setPk_FlorID(flor.getPk_FlorID());
        florEntityDTO.setNomFlor(flor.getNomFlor());
        florEntityDTO.setPaisFlor(flor.getPaisFlor());

        if (paises.contains(flor.getPaisFlor())){
            florEntityDTO.setTipusFlor("UE");
        } else {
            florEntityDTO.setTipusFlor("Fora UE");
        }

        return florEntityDTO;
    }

    public static FlorEntity toEntity(FlorEntityDTO florDTO){
        FlorEntity florEntity = new FlorEntity();

        florEntity.setPk_FlorID(florDTO.getPk_FlorID());
        florEntity.setNomFlor(florDTO.getNomFlor());
        florEntity.setPaisFlor(florDTO.getPaisFlor());
        
        return florEntity;
    }
}
