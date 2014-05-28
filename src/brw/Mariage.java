package brw;

import java.util.Date;

/**
 * Created by majid on 18/01/14.
 */
public class Mariage {
    private Date date_M;
    private String lieu_M;
    private String statut;

    public Date getDate_M() {
        return date_M;
    }

    public void setDate_M(Date date_M) {
        this.date_M = date_M;
    }

    public String getLieu_M() {
        return lieu_M;
    }

    public void setLieu_M(String lieu_M) {
        this.lieu_M = lieu_M;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
