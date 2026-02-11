package ca.bcit.comp2522.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Bookstore
{

    private final String      name;
    private final List<Novel> references;

    public Bookstore(final String name)
    {
        this.name = name;
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
     * Prints all novel's titles to uppercase.
     */
    public void printAllTitles()
    {
        for (final Novel reference: references)
        {
            final String title;
            title = reference.getTitle();
            System.out.println(title.toUpperCase());
        }
    }


}
