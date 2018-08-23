package ps.camel.no.model;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

@FixedLengthRecord(ignoreTrailingChars = true, ignoreMissingChars = true)
public class GRUI extends BaseInfo {
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

    @DataField(pos = 47, length = 6, trim = true)
    private String fodselsdato;

    @DataField(pos = 53, length = 5, trim = true)
    private String persnr;

    @DataField(pos = 58, length = 26, trim = true)
    private String navnSamsatt;

    @DataField(pos = 84, length = 30, trim = true)
    private String addresse;

    @DataField(pos = 114, length = 4, trim = true)
    private String postnr;

    @DataField(pos = 118, length = 14, trim = true)
    private String komnr;

    @DataField(pos = 122, length = 50, trim = true)
    private String slektsNavn;

    @DataField(pos = 172, length = 50, trim = true)
    private String foreNavn;

    @DataField(pos = 222, length = 50, trim = true)
    private String mellomNavn;

    @DataField(pos = 272, length = 20, trim = true)
    private String poststed;

    @DataField(pos = 292, length = 20, trim = true)
    private String kommuneNavn;

    @DataField(pos = 312, length = 1, trim = true)
    private String status;

    @DataField(pos = 313, length = 8, trim = true)
    private String statusDato;


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

    public String getFodselsdato() {
        return fodselsdato.trim();
    }

    public String getPersnr() {
        return persnr.trim();
    }

    public String getNavnSamsatt() {
        return navnSamsatt.trim();
    }

    public String getAddresse() {
        return addresse.trim();
    }

    public String getPostnr() {
        return postnr.trim();
    }

    public String getKomnr() {
        return komnr.trim();
    }

    public String getSlektsNavn() {
        return slektsNavn.trim();
    }

    public String getForeNavn() {
        return foreNavn.trim();
    }

    public String getMellomNavn() {
        return mellomNavn.trim();
    }

    public String getPoststed() {
        return poststed.trim();
    }

    public String getKommuneNavn() {
        return kommuneNavn.trim();
    }

    public String getStatus() {
        return status.trim();
    }

    public String getStatusDato() {
        return statusDato.trim();
    }

    @Override
    public String toString() {
        return "GRUI{" +
                "fileId='" + getFileId() + '\'' +
                ", recordId='" + getRecordId() + '\'' +
                ", product='" + getProduct() + '\'' +
                ", egenId='" + getEgenId() + '\'' +
                ", treffNiva='" + getTreffNiva() + '\'' +
                ", snuNivaNavn='" + getSnuNivaNavn() + '\'' +
                ", activeOrHistoric='" + getActiveOrHistoric() + '\'' +
                ", sikkerUnique='" + getSikkerUnique() + '\'' +
                ", fodselsdato='" + getFodselsdato() + '\'' +
                ", persnr='" + getPersnr() + '\'' +
                ", navnSamsatt='" + getNavnSamsatt() + '\'' +
                ", addresse='" + getAddresse() + '\'' +
                ", postnr='" + getPostnr() + '\'' +
                ", komnr='" + getKomnr() + '\'' +
                ", slektsNavn='" + getSlektsNavn() + '\'' +
                ", foreNavn='" + getForeNavn() + '\'' +
                ", mellomNavn='" + getMellomNavn() + '\'' +
                ", poststed='" + getPoststed() + '\'' +
                ", kommuneNavn='" + getKommuneNavn() + '\'' +
                ", status='" + getStatus() + '\'' +
                ", statusDato='" + getStatusDato() + '\'' +
                '}';
    }
}
