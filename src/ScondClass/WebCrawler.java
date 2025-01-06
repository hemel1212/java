package ScondClass;

import java.util.Scanner;
import java.util.ArrayList;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class WebCrawler {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine();  // Corrected the URL input assignment

        crawler(url); // Traverse the Web from the starting URL
    }

    // The crawler method that crawls from the starting URL
    public static void crawler(String startingURL) {

        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);

        // Limit the crawl to 100 URLs
        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {

            String urlString = listOfPendingURLs.remove(0); // Corrected method call

            // If the URL has not been visited yet
            if (!listOfTraversedURLs.contains(urlString)) {

                listOfTraversedURLs.add(urlString);  // Add the URL to visited list
                System.out.println("Crawling: " + urlString);  // Printing URL being crawled

                // Get sub-URLs from the current page and add them to the pending list
                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s)) {
                        listOfPendingURLs.add(s);
                    }
                }
            }
        }
    }

    // Method to fetch sub-URLs (i.e., URLs on the given page)
    public static ArrayList<String> getSubURLs(String urlString) {

        ArrayList<String> list = new ArrayList<>();

        try {
            // Create a URL object and open a stream to read from it
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            int current;

            // Read the webpage line by line
            while ((line = reader.readLine()) != null) {

                current = line.indexOf("http://");  // Find "http://" URLs
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        // Add the URL found to the list
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http://", endIndex);  // Continue looking for more URLs
                    } else {
                        current = -1;  // No more URLs in this line
                    }
                }

                // Look for https:// URLs as well
                current = line.indexOf("https://");
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("https://", endIndex);  // Continue looking for more URLs
                    } else {
                        current = -1;  // No more URLs in this line
                    }
                }
            }

            reader.close();  // Close the reader

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());  // Catch any errors and print the message
        }

        return list;
    }
}
