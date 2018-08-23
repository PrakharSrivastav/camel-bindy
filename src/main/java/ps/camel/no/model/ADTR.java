package ps.camel.no.model;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

@FixedLengthRecord(ignoreTrailingChars = true, ignoreMissingChars = true)
public class ADTR extends BaseInfo {

    @DataField(pos = 1, length = 16, trim = true)
    private String fileId;

    @DataField(pos = 17, length = 3, trim = true)
    private String recordId;

    @DataField(pos = 20, length = 4, trim = true)
    private String product;

    @DataField(pos = 24, length = 16, trim = true)
    private String egenId;

    @DataField(pos = 40, length = 2, trim = true)
    private String treffNiva;

    @DataField(pos = 42, length = 1, trim = true)
    private String snuNivaNavn;

    @DataField(pos = 43, length = 1, trim = true)
    private String activeOrHistoric;

    @DataField(pos = 46, length = 1, trim = true)
    private String sikkerUnique;

    @DataField(pos = 47, length = 25, trim = true)
    private String coAddresse;

    @DataField(pos = 72, length = 30, trim = true)
    private String postAdrDel1;

    @DataField(pos = 102, length = 30, trim = true)
    private String postAdrDel2;

    @DataField(pos = 132, length = 30, trim = true)
    private String postAdrDel3;

    @DataField(pos = 162, length = 8, trim = true)
    private String flyttedato;

    @DataField(pos = 170, length = 5, trim = true)
    private String boligNr;

    @DataField(pos = 175, length = 25, trim = true)
    private String gateNavn;

    @DataField(pos = 200, length = 5, trim = true)
    private String gateNr;

    @DataField(pos = 205, length = 4, trim = true)
    private String husNr;

    @DataField(pos = 209, length = 1, trim = true)
    private String bokstav;

    @DataField(pos = 210, length = 5, trim = true)
    private String gard;

    @DataField(pos = 215, length = 4, trim = true)
    private String bruksNr;

    @DataField(pos = 219, length = 4, trim = true)
    private String festeNr;

    @DataField(pos = 223, length = 1, trim = true)
    private String adresseKode;

    @DataField(pos = 224, length = 8, trim = true)
    private String adresseKodeDato;

    @DataField(pos = 232, length = 3, trim = true)
    private String postAdrLandKode;

    @DataField(pos = 235, length = 30, trim = true)
    private String postAdrLandNavn;

    @DataField(pos = 265, length = 2, trim = true)
    private String skolekretsBydel;

    @DataField(pos = 267, length = 2, trim = true)
    private String skolekrets;

    @DataField(pos = 269, length = 2, trim = true)
    private String valgkretsBydel;

    @DataField(pos = 271, length = 2, trim = true)
    private String valgkrets;

    @DataField(pos = 273, length = 8, trim = true)
    private String regaAdr;

    @DataField(pos = 281, length = 1, trim = true)
    private String adrtAdrType;

    @DataField(pos = 282, length = 4, trim = true)
    private String adrtUnderNr;

    @DataField(pos = 286, length = 8, trim = true)
    private String utvanderRegdat;

    @DataField(pos = 294, length = 3, trim = true)
    private String utvanderLandKode;

    @DataField(pos = 297, length = 30, trim = true)
    private String utvanderLandNavn;

    @DataField(pos = 327, length = 8, trim = true)
    private String postAdrRegDato;

    @DataField(pos = 335, length = 4, trim = true)
    private String grunnKrets;

    @DataField(pos = 385, length = 6, trim = true)
    private String sortId;

    @DataField(pos = 391, length = 1, trim = true)
    private String sortPrio;

    @DataField(pos = 392, length = 9, trim = true)
    private String lopeNr;

    public String getFileId() {
        return fileId;
    }


    public String getRecordId() {
        return recordId.trim();
    }

    public String getProduct() {
        return product.trim();
    }

    public String getEgenId() {
        return egenId.trim();
    }

    public String getTreffNiva() {
        return treffNiva.trim();
    }

    public String getSnuNivaNavn() {
        return snuNivaNavn.trim();
    }

    public String getActiveOrHistoric() {
        return activeOrHistoric.trim();
    }

    public String getSikkerUnique() {
        return sikkerUnique.trim();
    }

    public String getCoAddresse() {
        return coAddresse.trim();
    }

    public String getPostAdrDel1() {
        return postAdrDel1.trim();
    }

    public String getPostAdrDel2() {
        return postAdrDel2.trim();
    }

    public String getPostAdrDel3() {
        return postAdrDel3.trim();
    }

    public String getFlyttedato() {
        return flyttedato.trim();
    }

    public String getBoligNr() {
        return boligNr.trim();
    }

    public String getGateNavn() {
        return gateNavn.trim();
    }

    public String getGateNr() {
        return gateNr.trim();
    }

    public String getHusNr() {
        return husNr.trim();
    }

    public String getBokstav() {
        return bokstav.trim();
    }

    public String getGard() {
        return gard.trim();
    }

    public String getBruksNr() {
        return bruksNr.trim();
    }

    public String getFesteNr() {
        return festeNr.trim();
    }

    public String getAdresseKode() {
        return adresseKode.trim();
    }

    public String getAdresseKodeDato() {
        return adresseKodeDato.trim();
    }

    public String getPostAdrLandKode() {
        return postAdrLandKode.trim();
    }

    public String getPostAdrLandNavn() {
        return postAdrLandNavn.trim();
    }

    public String getSkolekretsBydel() {
        return skolekretsBydel.trim();
    }

    public String getSkolekrets() {
        return skolekrets.trim();
    }

    public String getValgkretsBydel() {
        return valgkretsBydel.trim();
    }

    public String getValgkrets() {
        return valgkrets.trim();
    }

    public String getRegaAdr() {
        return regaAdr.trim();
    }

    public String getAdrtAdrType() {
        return adrtAdrType.trim();
    }

    public String getAdrtUnderNr() {
        return adrtUnderNr.trim();
    }

    public String getUtvanderRegdat() {
        return utvanderRegdat.trim();
    }

    public String getUtvanderLandKode() {
        return utvanderLandKode.trim();
    }

    public String getUtvanderLandNavn() {
        return utvanderLandNavn.trim();
    }

    public String getPostAdrRegDato() {
        return postAdrRegDato.trim();
    }

    public String getGrunnKrets() {
        return grunnKrets.trim();
    }

    public String getSortId() {
        return sortId.trim();
    }

    public String getSortPrio() {
        return sortPrio.trim();
    }

    public String getLopeNr() {
        return lopeNr.trim();
    }

    @Override
    public String toString() {
        return "ADTR{" +
                "fileId='" + getFileId() + '\'' +
                ", recordId='" + getRecordId() + '\'' +
                ", product='" + getProduct() + '\'' +
                ", egenId='" + getEgenId() + '\'' +
                ", treffNiva='" + getTreffNiva() + '\'' +
                ", snuNivaNavn='" + getSnuNivaNavn() + '\'' +
                ", activeOrHistoric='" + getActiveOrHistoric() + '\'' +
                ", sikkerUnique='" + getSikkerUnique() + '\'' +
                ", coAddresse='" + getCoAddresse() + '\'' +
                ", postAdrDel1='" + getPostAdrDel1() + '\'' +
                ", postAdrDel2='" + getPostAdrDel2() + '\'' +
                ", postAdrDel3='" + getPostAdrDel3() + '\'' +
                ", flyttedato='" + getFlyttedato() + '\'' +
                ", boligNr='" + getBoligNr() + '\'' +
                ", gateNavn='" + getGateNavn() + '\'' +
                ", gateNr='" + getGateNr() + '\'' +
                ", husNr='" + getHusNr() + '\'' +
                ", bokstav='" + getBokstav() + '\'' +
                ", gard='" + getGard() + '\'' +
                ", bruksNr='" + getBruksNr() + '\'' +
                ", festeNr='" + getFesteNr() + '\'' +
                ", adresseKode='" + getAdresseKode() + '\'' +
                ", adresseKodeDato='" + getAdresseKodeDato() + '\'' +
                ", postAdrLandKode='" + getPostAdrLandKode() + '\'' +
                ", postAdrLandNavn='" + getPostAdrLandNavn() + '\'' +
                ", skolekretsBydel='" + getSkolekretsBydel() + '\'' +
                ", skolekrets='" + getSkolekrets() + '\'' +
                ", valgkretsBydel='" + getValgkretsBydel() + '\'' +
                ", valgkrets='" + getValgkrets() + '\'' +
                ", regaAdr='" + getRegaAdr() + '\'' +
                ", adrtAdrType='" + getAdrtAdrType() + '\'' +
                ", adrtUnderNr='" + getAdrtUnderNr() + '\'' +
                ", utvanderRegdat='" + getUtvanderRegdat() + '\'' +
                ", utvanderLandKode='" + getUtvanderLandKode() + '\'' +
                ", utvanderLandNavn='" + getUtvanderLandNavn() + '\'' +
                ", postAdrRegDato='" + getPostAdrRegDato() + '\'' +
                ", grunnKrets='" + getGrunnKrets() + '\'' +
                ", sortId='" + getSortId() + '\'' +
                ", sortPrio='" + getSortPrio() + '\'' +
                ", lopeNr='" + getLopeNr() + '\'' +
                '}';
    }
}
