package hello.hellospring.domain;

public class Stock {
    int code;
    String name;
    int date;
    int svoluem;
    int bvolume;
    int pbvolume;
    int spayment;
    int bpayment;
    int psvolume;
    String market;
    String buyer;

    public Stock(int code, String name, int date, int svoluem, int bvolume, int pbvolume, int spayment, int bpayment, int psvolume, String market, String buyer) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.svoluem = svoluem;
        this.bvolume = bvolume;
        this.pbvolume = pbvolume;
        this.spayment = spayment;
        this.bpayment = bpayment;
        this.psvolume = psvolume;
        this.market = market;
        this.buyer = buyer;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getSvoluem() {
        return svoluem;
    }

    public void setSvoluem(int svoluem) {
        this.svoluem = svoluem;
    }

    public int getBvolume() {
        return bvolume;
    }

    public void setBvolume(int bvolume) {
        this.bvolume = bvolume;
    }

    public int getPbvolume() {
        return pbvolume;
    }

    public void setPbvolume(int pbvolume) {
        this.pbvolume = pbvolume;
    }

    public int getSpayment() {
        return spayment;
    }

    public void setSpayment(int spayment) {
        this.spayment = spayment;
    }

    public int getBpayment() {
        return bpayment;
    }

    public void setBpayment(int bpayment) {
        this.bpayment = bpayment;
    }

    public int getPsvolume() {
        return psvolume;
    }

    public void setPsvolume(int psvolume) {
        this.psvolume = psvolume;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }
}
