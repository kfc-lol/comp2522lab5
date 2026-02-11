package ca.bcit.comp2522.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Bookstore
{

    private final String name;
    private final List<Novel> references;

    public Bookstore(final String name)
    {
        this.name = name;
        this.references = new ArrayList<>();

        final Novel taoam;
        taoam = new Novel("The Adventures of Augie March",
                       "Saul Bellow",
                       1953);

        references.add(taoam);
    }
}
