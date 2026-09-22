import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    double price;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public class LibraryManagement {
    public static int removeDuplicates(Book[] books, int n) {
        if (n == 0) {
            return 0;
        }
        int j = 1;
        for (int i = 1; i < n; i++) {
            if (books[i].bookId != books[i - 1].bookId) {
                books[j] = books[i];
                j++;
            }
        }
        return j;
    }

    public static void searchByTitle(Book[] books, int count, String query) {
        boolean found = false;
        query = query.toLowerCase();
        for (int i = 0; i < count; i++) {
            if (books[i].title.toLowerCase().contains(query)) {
                System.out.println(
                    books[i].bookId + " | " +
                    books[i].title + " | " +
                    books[i].author + " | " +
                    books[i].price
                );
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found.");
        }
    }

    public static void sortByPrice(Book[] books, int count) {

        int swaps = 0;

        for (int i = 0; i < count - 1; i++) {

            int min = i;

            for (int j = i + 1; j < count; j++) {

                if (books[j].price < books[min].price) {
                    min = j;
                }
            }

            if (min != i) {

                Book temp = books[i];
                books[i] = books[min];
                books[min] = temp;

                swaps++;
            }
        }

        System.out.println("Total swaps: " + swaps);
    }

    public static int searchByPrice(Book[] books, int count, double targetPrice) {

        int left = 0;
        int right = count - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (books[mid].price == targetPrice) {
                return mid;
            }

            if (books[mid].price < targetPrice) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int minBooksForTargetCost(
            Book[] books, int count, double targetCost) {

        double sum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < count; right++) {

            sum += books[right].price;

            while (sum >= targetCost) {

                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                }

                sum -= books[left].price;
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        // User enters/scans books
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            books[i] = new Book(id, title, author, price);
        }

        // Task 1
        int count = removeDuplicates(books, n);
        System.out.println("\nREMOVE DUPLICATES");
        System.out.println("Unique books: " + count);

        for (int i = 0; i < count; i++) {
            System.out.println(
                books[i].bookId + " | " +
                books[i].title + " | " +
                books[i].author + " | " +
                books[i].price
            );
        }

        // Task 2
        System.out.println("\nSEARCH BY TITLE");

        System.out.print("Enter title/word to search: ");
        String query = sc.nextLine();

        searchByTitle(books, count, query);

        // Task 3
        System.out.println("\nSORT BY PRICE");

        sortByPrice(books, count);

        for (int i = 0; i < count; i++) {
            System.out.println(
                books[i].bookId + " | " +
                books[i].title + " | " +
                books[i].author + " | " +
                books[i].price
            );
        }

        // Task 4
        System.out.println("\nSEARCH BY PRICE");

        System.out.print("Enter price to search: ");
        double targetPrice = sc.nextDouble();

        int index = searchByPrice(books, count, targetPrice);

        if (index != -1) {
            System.out.println("Book found at index: " + index);
            System.out.println(
                books[index].bookId + " | " +
                books[index].title + " | " +
                books[index].author + " | " +
                books[index].price
            );
        } else {
            System.out.println("Book not found.");
        }

        // Task 5
        System.out.println("\n MINIMUM BOOKS FOR TARGET COST");

        System.out.print("Enter target cost: ");
        double targetCost = sc.nextDouble();

        int result = minBooksForTargetCost(books, count, targetCost);

        if (result == 0) {
            System.out.println("No consecutive group found.");
        } else {
            System.out.println("Minimum number of consecutive books: " + result);
        }
    }
}