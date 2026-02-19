package ca.bcit.comp2522.bookstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Bookstore
{
    public static final  int         FIRST_INDEX           = 0;
    public static final  int         DECADE_RANGE          = 10;
    private static final int         PERCENTAGE_MULTIPLIER = 100;
    public static final  int         INITIAL_AMOUNT        = 0;
    private final        String      name;
    private final        List<Novel> references;

    public Bookstore(final String name)
    {
        this.name       = name;
        this.references = new ArrayList<>();

        final Novel novel1;
        final Novel novel2;
        final Novel novel3;
        final Novel novel4;
        final Novel novel5;
        final Novel novel6;
        final Novel novel7;
        final Novel novel8;
        final Novel novel9;
        final Novel novel10;
        final Novel novel11;
        final Novel novel12;
        final Novel novel13;
        final Novel novel14;
        final Novel novel15;
        final Novel novel16;
        final Novel novel17;
        final Novel novel18;
        final Novel novel19;
        final Novel novel20;
        final Novel novel21;
        final Novel novel22;
        final Novel novel23;
        final Novel novel24;
        final Novel novel25;
        final Novel novel26;
        final Novel novel27;
        final Novel novel28;
        final Novel novel29;
        final Novel novel30;
        final Novel novel31;
        final Novel novel32;
        final Novel novel33;
        final Novel novel34;
        final Novel novel35;
        final Novel novel36;
        final Novel novel37;
        final Novel novel38;
        final Novel novel39;
        final Novel novel40;
        final Novel novel41;
        final Novel novel42;
        final Novel novel43;
        final Novel novel44;
        final Novel novel45;
        final Novel novel46;
        final Novel novel47;
        final Novel novel48;
        final Novel novel49;
        final Novel novel50;
        final Novel novel51;
        final Novel novel52;
        final Novel novel53;
        final Novel novel54;
        final Novel novel55;
        final Novel novel56;
        final Novel novel57;
        final Novel novel58;
        final Novel novel59;
        final Novel novel60;
        final Novel novel61;
        final Novel novel62;
        final Novel novel63;
        final Novel novel64;
        final Novel novel65;
        final Novel novel66;
        final Novel novel67;
        final Novel novel68;
        final Novel novel69;
        final Novel novel70;
        final Novel novel71;
        final Novel novel72;
        final Novel novel73;
        final Novel novel74;
        final Novel novel75;
        final Novel novel76;
        final Novel novel77;
        final Novel novel78;
        final Novel novel79;
        final Novel novel80;
        final Novel novel81;
        final Novel novel82;
        final Novel novel83;
        final Novel novel84;
        final Novel novel85;
        final Novel novel86;
        final Novel novel87;
        final Novel novel88;
        final Novel novel89;
        final Novel novel90;
        final Novel novel91;
        final Novel novel92;
        final Novel novel93;
        final Novel novel94;
        final Novel novel95;
        final Novel novel96;
        final Novel novel97;
        final Novel novel98;
        final Novel novel99;
        final Novel novel100;


        novel1 = new Novel("The Adventures of Augie March",
                           "Saul Bellow",
                           1953);

        novel2 = new Novel("All the King's Men",
                           "Robert Penn Warren",
                           1946);

        novel3 = new Novel("American Pastoral",
                           "Philip Roth",
                           1997);

        novel4 = new Novel("An American Tragedy",
                           "Theodore Dreiser",
                           1925);

        novel5 = new Novel("Animal Farm",
                           "George Orwell",
                           1946);

        novel6 = new Novel("Appointment in Samarra",
                           "John O'Hara",
                           1934);

        novel7 = new Novel("Are You There God? It's Me, Margaret.",
                           "Judy Blume",
                           1970);

        novel8 = new Novel("The Assistant",
                           "Bernard Malamud",
                           1957);

        novel9 = new Novel("At Swim-Two-Birds",
                           "Flann O'Brien",
                           1938);

        novel10 = new Novel("Atonement",
                            "Ian McEwan",
                            2002);

        novel11 = new Novel("Beloved",
                            "Toni Morrison",
                            1987);

        novel12 = new Novel("The Berlin Stories",
                            "Christopher Isherwood",
                            1946);

        novel13 = new Novel("The Big Sleep",
                            "Raymond Chandler",
                            1939);

        novel14 = new Novel("The Blind Assassin",
                            "Margaret Atwood",
                            2000);

        novel15 = new Novel("Blood Meridian",
                            "Cormac McCarthy",
                            1986);

        novel16 = new Novel("Brideshead Revisited",
                            "Evelyn Waugh",
                            1946);

        novel17 = new Novel("The Bridge of San Luis Rey",
                            "Thornton Wilder",
                            1927);

        novel18 = new Novel("Call It Sleep",
                            "Henry Roth",
                            1935);

        novel19 = new Novel("Catch-22",
                            "Joseph Heller",
                            1961);

        novel20 = new Novel("The Catcher in the Rye",
                            "J.D. Salinger",
                            1951);

        novel21 = new Novel("A Clockwork Orange",
                            "Anthony Burgess",
                            1963);

        novel22 = new Novel("The Confessions of Nat Turner",
                            "William Styron",
                            1967);

        novel23 = new Novel("The Corrections",
                            "Jonathan Franzen",
                            2001);

        novel24 = new Novel("The Crying of Lot 49",
                            "Thomas Pynchon",
                            1966);

        novel25 = new Novel("A Dance to the Music of Time",
                            "Anthony Powell",
                            1951);

        novel26 = new Novel("The Day of the Locust",
                            "Nathanael West",
                            1939);

        novel27 = new Novel("Death Comes for the Archbishop",
                            "Willa Cather",
                            1927);

        novel28 = new Novel("A Death in the Family",
                            "James Agee",
                            1958);

        novel29 = new Novel("The Death of the Heart",
                            "Elizabeth Bowen",
                            1958);

        novel30 = new Novel("Deliverance",
                            "James Dickey",
                            1970);

        novel31 = new Novel("Dog Soldiers",
                            "Robert Stone",
                            1974);

        novel32 = new Novel("Falconer",
                            "John Cheever",
                            1977);

        novel33 = new Novel("The French Lieutenant's",
                            "John Fowles",
                            1969);

        novel34 = new Novel("The Golden Notebook",
                            "Doris Lessing",
                            1962);

        novel35 = new Novel("Go Tell It on the Mountain",
                            "James Baldwin",
                            1953);

        novel36 = new Novel("Gone with the Wind",
                            "Margaret Mitchell",
                            1936);

        novel37 = new Novel("The Grapes of Wrath",
                            "John Steinbeck",
                            1939);

        novel38 = new Novel("Gravity's Rainbow",
                            "Thomas Pynchon",
                            1973);

        novel39 = new Novel("The Great Gatsby",
                            "F. Scott Fitzgerald",
                            1925);

        novel40 = new Novel("A Handful of Dust",
                            "Evelyn Waugh",
                            1934);

        novel41 = new Novel("The Heart Is a Lonely Hunter",
                            "Carson McCullers",
                            1940);

        novel42 = new Novel("The Heart of the Matter",
                            "Graham Greene",
                            1948);

        novel43 = new Novel("Herzog",
                            "Saul Bellow",
                            1964);

        novel44 = new Novel("Housekeeping",
                            "Marilynne Robinson",
                            1981);

        novel45 = new Novel("A House for Mr.Biswas",
                            "V.S. Naipaul",
                            1953);

        novel46 = new Novel("I, Claudius",
                            "Robert Graves",
                            1934);

        novel47 = new Novel("Infinite Jest",
                            "David Foster Wallace",
                            1996);

        novel48 = new Novel("Invisible Man",
                            "Ralph Ellison",
                            1952);

        novel49 = new Novel("Light in August",
                            "William Faulkner",
                            1932);

        novel50 = new Novel("The Lion, The Witch and the Wardrobe",
                            "C.S. Lewis",
                            1950);

        novel51 = new Novel("Lolita",
                            "Vladimir Nabokov",
                            1955);

        novel52 = new Novel("Lord of the Flies",
                            "William Golding",
                            1954);

        novel53 = new Novel("The Lord of the Rings",
                            "J.R.R Tolkien",
                            1954);

        novel54 = new Novel("Loving",
                            "Henry Green ",
                            1945);

        novel55 = new Novel("Lucky Jim",
                            "Kingsley Amis",
                            1954);

        novel56 = new Novel("The Man Who Loved Children",
                            "Christina Stead",
                            1940);

        novel57 = new Novel("Midnight's Children",
                            "Salman Rushdie",
                            1981);

        novel58 = new Novel("Money",
                            "Martin Amis",
                            1984);

        novel59 = new Novel("The Moviegoer",
                            "Walker Percy",
                            1961);

        novel60 = new Novel("Mrs. Dalloway",
                            "Virginia Woolf",
                            1925);

        novel61 = new Novel("Naked Lunch",
                            "William Burroughs",
                            1959);

        novel62 = new Novel("Native Son",
                            "Richard Wright",
                            1940);

        novel63 = new Novel("Neuromancer",
                            "William Gibson",
                            1984);

        novel64 = new Novel("Never Let Me Go",
                            "Kazuo Ishiguro",
                            2005);

        novel65 = new Novel("1984",
                            "George Orwell",
                            1948);

        novel66 = new Novel("On the Road",
                            "Jack Kerouac",
                            1957);

        novel67 = new Novel("One Flew Over the Cuckoo's Nest",
                            "Ken Kesey",
                            1962);

        novel68 = new Novel("The Painted Bird",
                            "Jerzy Kosinski",
                            1965);

        novel69 = new Novel("Pale Fire",
                            "Vladimir Nabokov",
                            1962);

        novel70 = new Novel("A Passage to India",
                            "E.M. Forster",
                            1924);

        novel71 = new Novel("Play It as It Lays",
                            "Joan Didion",
                            1970);

        novel72 = new Novel("Portnoy's Complaint",
                            "Philip Roth",
                            1969);

        novel73 = new Novel("Possession",
                            "A.S. Byatt",
                            1990);

        novel74 = new Novel("The Power and the Glory",
                            "Graham Greene",
                            1939);

        novel75 = new Novel("The Prime of Miss Jean Brodie",
                            "Muriel Spark",
                            1961);

        novel76 = new Novel("Rabbit, Run",
                            "John Updike",
                            1960);

        novel77 = new Novel("Ragtime",
                            "E.L. Doctorow",
                            1975);

        novel78 = new Novel("The Recognitions",
                            "William Gaddis",
                            1955);

        novel79 = new Novel("Red Harvest",
                            "Dashiell Hammett",
                            1929);

        novel80 = new Novel("Revolutionary Road",
                            "Richard Yates",
                            1961);

        novel81 = new Novel("The Sheltering Sky",
                            "Paul Bowles",
                            1949);

        novel82 = new Novel("Slaughterhouse-Five",
                            "Kurt Vonnegut",
                            1969);

        novel83 = new Novel("Snow Crash",
                            "Neal Stephenson",
                            1992);

        novel84 = new Novel("The Sot-Weed Factor",
                            "John Barth",
                            1960);

        novel85 = new Novel("The Sound and the Fury",
                            "William Faulkner",
                            1929);

        novel86 = new Novel("The Sportswriter",
                            "Richard Ford",
                            1986);

        novel87 = new Novel("The Spy Who Came in from the Cold",
                            "John le Carré",
                            1964);

        novel88 = new Novel("The Sun Also Rises",
                            "Ernest Hemingway",
                            1926);

        novel89 = new Novel("Their Eyes Were Watching God",
                            "Zora Neale Hurston",
                            1937);

        novel90 = new Novel("Things Fall Apart",
                            "Chinua Achebe",
                            1959);

        novel91 = new Novel("To Kill a Mockingbird",
                            "Harper Lee",
                            1960);

        novel92 = new Novel("To the Lighthouse",
                            "Virginia Woolf",
                            1929);

        novel93 = new Novel("Tropic of Cancer",
                            "Henry Miller",
                            1934);

        novel94 = new Novel("Ubik",
                            "Philip K. Dick",
                            1969);

        novel95 = new Novel("Under the Net",
                            "Iris Murdoch",
                            1954);

        novel96 = new Novel("Under the Volcano",
                            "Malcolm Lowry",
                            1947);

        novel97 = new Novel("Watchmen",
                            "Alan Moore and Dave Gibbons",
                            1986);

        novel98 = new Novel("White Noise",
                            "Don DeLillo",
                            1985);

        novel99 = new Novel("White Teeth",
                            "Zadie Smith",
                            2000);

        novel100 = new Novel("Wide Sargasso Sea",
                             "Jean Rhys",
                             1966);


        references.add(novel1);
        references.add(novel2);
        references.add(novel3);
        references.add(novel4);
        references.add(novel5);
        references.add(novel6);
        references.add(novel7);
        references.add(novel8);
        references.add(novel9);
        references.add(novel10);
        references.add(novel11);
        references.add(novel12);
        references.add(novel13);
        references.add(novel14);
        references.add(novel15);
        references.add(novel16);
        references.add(novel17);
        references.add(novel18);
        references.add(novel19);
        references.add(novel20);
        references.add(novel21);
        references.add(novel22);
        references.add(novel23);
        references.add(novel24);
        references.add(novel25);
        references.add(novel26);
        references.add(novel27);
        references.add(novel28);
        references.add(novel29);
        references.add(novel30);
        references.add(novel31);
        references.add(novel32);
        references.add(novel33);
        references.add(novel34);
        references.add(novel35);
        references.add(novel36);
        references.add(novel37);
        references.add(novel38);
        references.add(novel39);
        references.add(novel40);
        references.add(novel41);
        references.add(novel42);
        references.add(novel43);
        references.add(novel44);
        references.add(novel45);
        references.add(novel46);
        references.add(novel47);
        references.add(novel48);
        references.add(novel49);
        references.add(novel50);
        references.add(novel51);
        references.add(novel52);
        references.add(novel53);
        references.add(novel54);
        references.add(novel55);
        references.add(novel56);
        references.add(novel57);
        references.add(novel58);
        references.add(novel59);
        references.add(novel60);
        references.add(novel61);
        references.add(novel62);
        references.add(novel63);
        references.add(novel64);
        references.add(novel65);
        references.add(novel66);
        references.add(novel67);
        references.add(novel68);
        references.add(novel69);
        references.add(novel70);
        references.add(novel71);
        references.add(novel72);
        references.add(novel73);
        references.add(novel74);
        references.add(novel75);
        references.add(novel76);
        references.add(novel77);
        references.add(novel78);
        references.add(novel79);
        references.add(novel80);
        references.add(novel81);
        references.add(novel82);
        references.add(novel83);
        references.add(novel84);
        references.add(novel85);
        references.add(novel86);
        references.add(novel87);
        references.add(novel88);
        references.add(novel89);
        references.add(novel90);
        references.add(novel91);
        references.add(novel92);
        references.add(novel93);
        references.add(novel94);
        references.add(novel95);
        references.add(novel96);
        references.add(novel97);
        references.add(novel98);
        references.add(novel99);
        references.add(novel100);

    }

    /**
     * Accesses name parameter.
     *
     * @return name of bookstore
     */
    public String getName()
    {
        return name;
    }

    /**
     * Accesses references.
     *
     * @return list of novels
     */
    public List<Novel> getReferences()
    {
        return references;
    }

    /**
     * Prints all titles to uppercase.
     */
    public void printAllTitles()
    {
        for (final Novel reference : references)
        {
            String title;

            title = reference.getTitle();
            title = title.toUpperCase();

            System.out.println(title);
        }
    }

    /**
     * Finds all books that contain a keyword and prints them.
     *
     * @param title keyword to check
     */
    public void printBookTitle(final String title)
    {
        for (final Novel reference : references)
        {
            final String refTitle;
            refTitle = reference.getTitle();

            if (refTitle.contains(title))
            {
                System.out.println(refTitle);
            }
        }
    }


    /**
     * Prints all titles in alphabetical order.
     *
     */
    public void printTitlesInAlphaOrder()
    {
        ArrayList<Novel> sorted;
        sorted = (ArrayList<Novel>) references;
        Collections.sort(sorted);

        for (final Novel sortedRef : sorted)
        {
            System.out.println(sortedRef.getTitle());
        }
    }

    /**
     * Prints all titles that were released in a decade's timeframe.
     *
     * @param decade range of years
     */
    public void printGroupByDecade(final int decade)
    {
        final int decadeEnds;
        decadeEnds = decade + DECADE_RANGE;

        for (final Novel reference : references)
        {
            if (reference.getYearPublished() >= decade &&
                reference.getYearPublished() < decadeEnds)
            {
                System.out.println(reference.getTitle());
            }
        }
    }

    /**
     * Finds and prints the longest title in the reference list.
     */
    public void getLongest()
    {
        int longestLength  = INITIAL_AMOUNT;
        int indexOfLongest = FIRST_INDEX;

        for (int i = FIRST_INDEX; i < references.size(); i++)
        {
            final String title;
            final Novel  currentNovel;

            currentNovel = references.get(i);
            title        = currentNovel.getTitle();

            if (title.length() > longestLength)
            {
                longestLength  = title.length();
                indexOfLongest = i;
            }
        }

        final Novel  longestNovel;
        final String titleOfLongest;

        longestNovel   = references.get(indexOfLongest);
        titleOfLongest = longestNovel.getTitle();

        System.out.println(titleOfLongest);
    }

    /**
     * Determines if a novel in the reference list was written on a year.
     *
     * @param year year that novel could be written
     * @return if a novel was written in that year
     */
    public boolean isThereABookWrittenIn(final int year)
    {
        for (final Novel reference : references)
        {
            final int referenceYear;
            referenceYear = reference.getYearPublished();

            if (referenceYear == year)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Finds how many books contain a keyword in their title.
     *
     * @param word word
     * @return count of books containing word
     */
    public int howManyBooksContain(final String word)
    {
        int count = INITIAL_AMOUNT;

        for (final Novel reference : references)
        {
            final String title;
            title = reference.getTitle();

            if (title.toLowerCase().contains(word.toLowerCase()))
            {
                count++;
            }
        }
        return count;
    }

    /**
     * Finds and returns percentage of books whose
     * yearPublished is in between first and last
     *
     * @param first lower bound year
     * @param last  upper bound year
     * @return integer percentage of valid books of total books
     */
    public int whichPercentWrittenBetween(final int first,
                                          final int last)
    {
        final int totalBooks;
        int       validBooks;

        validBooks = INITIAL_AMOUNT;
        totalBooks = references.size();

        for (final Novel reference : references)
        {
            final int refYear;
            refYear = reference.getYearPublished();

            if (refYear >= first &&
                refYear <= last)
            {
                validBooks++;
            }
        }

        return validBooks * PERCENTAGE_MULTIPLIER / totalBooks;
    }

    /**
     * Finds and returns the oldest novel in the reference list.
     *
     * @return reference with lowest yearPublished
     */
    public Novel getOldestBook()
    {
        Novel oldest;
        int   oldestYear;
        oldest     = references.get(FIRST_INDEX);
        oldestYear = oldest.getYearPublished();

        for (final Novel reference : references)
        {
            final int refYear;
            refYear = reference.getYearPublished();

            if (refYear < oldestYear)
            {
                oldest     = reference;
                oldestYear = reference.getYearPublished();
            }
        }

        return oldest;
    }

    /**
     * Removes all the novels in the list which have a title
     * that isn't the length of titleLength.
     *
     * @param titleLength length of title needed to stay on list
     * @return list of books with a length of titleLength
     */
    public List<Novel> getBooksThisLength(final int titleLength)
    {
        final List<Novel> booksThisLength;
        booksThisLength = references;

        Iterator<Novel> it;
        it = booksThisLength.iterator();

        while (it.hasNext())
        {
            final Novel  currentNovel;
            final String currentTitle;

            currentNovel = it.next();
            currentTitle = currentNovel.getTitle();

            if (currentTitle.length() != titleLength)
            {
                it.remove();
            }
        }

        return booksThisLength;
    }

    /**
     * Main method.
     *
     * @param args unused
     */
    public static void main(final String[] args)
    {
        final Bookstore   bookstore;
        final Novel       oldest;
        final List<Novel> fifteenCharTitles;
        bookstore = new Bookstore("Classic Novels Collection");

        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();

        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");

        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();

        System.out.println("\nBooks from the 2000s:");
        bookstore.printGroupByDecade(2000);

        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();

        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenIn(1950));

        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));

        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");

        System.out.println("\nOldest book:");
        oldest = bookstore.getOldestBook();
        System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " +
                           oldest.getYearPublished());

        System.out.println("\nBooks with titles 15 characters long:");
        fifteenCharTitles = bookstore.getBooksThisLength(15);
        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));
    }
}
