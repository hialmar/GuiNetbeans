/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.torguet.projetgui;

import java.io.Serializable;

/**
 * Classe des contacts du carnet d'adresse
 * @author Patrice Torguet
 */
public class Contact implements Serializable {
    /**
     * nom du contact
     */
    private String nom;
    /**
     * prénom
     */
    private String prenom;
    /**
     * numéro de téléphone
     */
    private String numeroTel;
    /**
     * adresse
     */
    private String adresse;
    /**
     * code postal
     */
    private int codePostal;
    /**
     * ville
     */
    private String ville;

    /**
     * constructeur par défaut
     */
    public Contact() {
    }
    
    /**
     * constructeur par recopie
     * @param c l'objet à copier
     */
    public Contact(Contact c) {
        // on recopie tous les attributs
        // vu le fonctionnement des chaines de caractères qui sont constantes
        // il n'y a pas de duplication à réaliser pour elles
        this.adresse = c.adresse;
        this.codePostal = c.codePostal;
        this.nom = c.nom;
        this.numeroTel = c.numeroTel;
        this.prenom = c.prenom;
        this.ville = c.ville;
    }

    /**
     * Renvoie le nom
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Change le nom
     * @param nom le nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Renvoie le prénom
     * @return le prénom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Change le prénom
     * @param prenom le nouveau prénom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Renvoie le numéro de téléphone
     * @return le numéro de téléphone
     */
    public String getNumeroTel() {
        return numeroTel;
    }

    /**
     * Change le numéro de téléphone
     * @param numeroTel le nouveau numéro de téléphone
     */
    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    /**
     * Renvoie l'adresse
     * @return l'adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Change l'adresse
     * @param adresse la nouvelle adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Renvoie le code postal
     * @return le code postal
     */
    public int getCodePostal() {
        return codePostal;
    }

    /**
     * Change le code postal
     * @param codePostal le nouveau code postal
     */
    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    /**
     * Renvoie la ville
     * @return la ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * Change la ville
     * @param ville  la nouvelle ville
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * Méthode appelée pour afficher le contact dans la liste graphique
     * @return 
     */
    @Override
    public String toString() {
        return nom + ' ' + prenom;
    }

    /**
     * Méthode pour la copie système
     * @return 
     */
    public String toFullString() {
        return "Contact :\nNom : " + nom + ", Prénom : " + prenom + 
                "\nNuméro de Téléphone : " + numeroTel + 
                "\nAdresse=" + adresse + 
                "\n" + codePostal + " " + ville + '\n';
    }
  
}
