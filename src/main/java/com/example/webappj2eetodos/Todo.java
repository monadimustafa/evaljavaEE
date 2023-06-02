package com.example.webappj2eetodos;

public class Todo {

    private int id;
    private String description;
    private int statut;
    private String username;

    public Todo() {
    }

    public Todo(int id,String description, int statut) {
        this.description = description;
        this.statut = statut;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
