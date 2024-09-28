/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Book implements Comparable<Book> {

    private String title;
    private int recommendedAge;

    public Book(String title, int recommendedAge) {
        this.title = title;
        this.recommendedAge = recommendedAge;
    }

    public int getAge() {
        return this.recommendedAge;
    }
    
    public String getTitle(){
        return this.title;
    }

    public int compareTo(Book book) {
        return this.recommendedAge - book.getAge();
    }

    public String toString() {
        return this.title + " (recommended for " + this.recommendedAge + " years-olds or older";
    }

}
