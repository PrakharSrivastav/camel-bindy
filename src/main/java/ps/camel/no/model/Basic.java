package ps.camel.no.model;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

@FixedLengthRecord(ignoreTrailingChars = true)
public final class Basic {
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

    @Override
    public String toString() {
        return "Basic{" +
                "fileId='" + fileId + '\'' +
                ", recordId='" + recordId + '\'' +
                ", product='" + product + '\'' +
                ", egenId='" + egenId + '\'' +
                ", treffNiva='" + treffNiva + '\'' +
                ", snuNivaNavn='" + snuNivaNavn + '\'' +
                ", activeOrHistoric='" + activeOrHistoric + '\'' +
                ", sikkerUnique='" + sikkerUnique + '\'' +
                ", fodselsdato='" + fodselsdato + '\'' +
                ", persnr='" + persnr + '\'' +
                ", navnSamsatt='" + navnSamsatt + '\'' +
                ", addresse='" + addresse + '\'' +
                ", postnr='" + postnr + '\'' +
                ", komnr='" + komnr + '\'' +
                ", slektsNavn='" + slektsNavn + '\'' +
                ", foreNavn='" + foreNavn + '\'' +
                ", mellomNavn='" + mellomNavn + '\'' +
                ", poststed='" + poststed + '\'' +
                ", kommuneNavn='" + kommuneNavn + '\'' +
                ", status='" + status + '\'' +
                ", statusDato='" + statusDato + '\'' +
                '}';
    }
}
