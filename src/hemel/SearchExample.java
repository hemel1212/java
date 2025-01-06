package hemel;
//write a java program to create an interface Searchable with a method search ( String Keyboard) that searches for a given keyboard in a text document.
// create two classes Document and WebPage that implement the Searchable  interface and provide their own implementation of the search() method


import java.util.ArrayList;
import java.util.List;


public class SearchExample {
    public static void main(String[] args) {

        List<searchable> items = new ArrayList<>();


        items.add(new Document("This is a simple text document about Java programming."));

        String keyword = "coding";

        for (searchable item : items) {
            if (item.search(keyword)) {
                if (item instanceof WebPage) {
                    System.out.println("Keyword found in WebPage with URL: " + ((WebPage) item));
                } else {
                    System.out.println("Keyword found in Document.");
                }
            } else {
                System.out.println("Keyword not found.");
            }
        }
    }
}
