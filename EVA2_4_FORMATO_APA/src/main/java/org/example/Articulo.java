package org.example;

public class Articulo extends Documento{
    private String journal;
    private String nomjournal;

    public Articulo() {
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getNomjournal() {
        return nomjournal;
    }

    public void setNomjournal(String nomjournal) {
        this.nomjournal = nomjournal;
    }

    public Articulo(String journal, String nomjournal) {
        this.journal = journal;
        this.nomjournal = nomjournal;
    }
}
