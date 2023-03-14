package org.example;

public class SitioWeb extends Documento{
    private String url;
    private String nomsitioweb;

    public SitioWeb() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNomsitioweb() {
        return nomsitioweb;
    }

    public void setNomsitioweb(String nomsitioweb) {
        this.nomsitioweb = nomsitioweb;
    }

    public SitioWeb(String url, String nomsitioweb) {
        this.url = url;
        this.nomsitioweb = nomsitioweb;
    }
}
