
package Entities;

public class MRPI {
    
     String mp; 
    
     float ene,feb,mar,abr,may,jun,jul,ago,sep,oct,nov,dic; 

    public MRPI(String mp, float ene, float feb, float mar, float abr, float may, float jun, float jul, float ago, float sep, float oct, float nov, float dic) {
        this.mp = mp;
        this.ene = ene;
        this.feb = feb;
        this.mar = mar;
        this.abr = abr;
        this.may = may;
        this.jun = jun;
        this.jul = jul;
        this.ago = ago;
        this.sep = sep;
        this.oct = oct;
        this.nov = nov;
        this.dic = dic;
    }

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp;
    }

    public float getEne() {
        return ene;
    }

    public void setEne(float ene) {
        this.ene = ene;
    }

    public float getFeb() {
        return feb;
    }

    public void setFeb(float feb) {
        this.feb = feb;
    }

    public float getMar() {
        return mar;
    }

    public void setMar(float mar) {
        this.mar = mar;
    }

    public float getAbr() {
        return abr;
    }

    public void setAbr(float abr) {
        this.abr = abr;
    }

    public float getMay() {
        return may;
    }

    public void setMay(float may) {
        this.may = may;
    }

    public float getJun() {
        return jun;
    }

    public void setJun(float jun) {
        this.jun = jun;
    }

    public float getJul() {
        return jul;
    }

    public void setJul(float jul) {
        this.jul = jul;
    }

    public float getAgo() {
        return ago;
    }

    public void setAgo(float ago) {
        this.ago = ago;
    }

    public float getSep() {
        return sep;
    }

    public void setSep(float sep) {
        this.sep = sep;
    }

    public float getOct() {
        return oct;
    }

    public void setOct(float oct) {
        this.oct = oct;
    }

    public float getNov() {
        return nov;
    }

    public void setNov(float nov) {
        this.nov = nov;
    }

    public float getDic() {
        return dic;
    }

    public void setDic(float dic) {
        this.dic = dic;
    }

    @Override
    public String toString() {
        return "MRPI{" + "mp=" + mp + ", ene=" + ene + ", feb=" + feb + ", mar=" + mar + ", abr=" + abr + ", may=" + may + ", jun=" + jun + ", jul=" + jul + ", ago=" + ago + ", sep=" + sep + ", oct=" + oct + ", nov=" + nov + ", dic=" + dic + '}';
    }

   
    
}
