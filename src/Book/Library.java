package Book;

import java.util.*;

public class Library {
    public static void main(String[] args) {

        // наличие книг в библиотеке
        String pauloCoelho = "Alchemist/Eleven minutes/Magician's diary";
        String[] booksCoelho = pauloCoelho.split("/");

        String charlesDickens = "Great expectations/Antiquities shop/Bells";
        String[] booksDickens = charlesDickens.split("/");

        String williamShakespeare = "Hamlet/King Lear/Romeo and Juliet";
        String[] booksShakespeare = williamShakespeare.split("/");

        System.out.println("The library has the following books: \n" + Arrays.toString(booksCoelho) + "\n" +
                Arrays.toString(booksDickens) + "\n" + Arrays.toString(booksShakespeare) + "\n");

        // наличие книг Пауло Коэльо
        System.out.println("Books by Paulo Coelho: \n" + Arrays.toString(booksCoelho));
    }
}


