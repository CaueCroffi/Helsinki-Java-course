/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Film {
    private String name;
    private int ageRating;
    
    public Film(String filmName, int FilmAgeRating){
        this.name = filmName;
        this.ageRating = FilmAgeRating;
    }
    
    public String name(){
        return this.name;
    }
    
    public int ageRating(){
        return this.ageRating;
    }
}
