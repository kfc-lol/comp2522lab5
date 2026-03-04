package ca.bcit.comp2522.bookstore;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Holds maps, sets and lists of novels.
 *
 * @author India Murgatroyd
 * @version 1.0
 */
public class Bookshop
{
    private final Map<String, Novel> novels;
    private final Bookstore bookstore;
    private final Set<String> keySet;
    private final List<String> keyList;

    /**
     * Bookshop constructor creates many collections of novels.
     */
    public Bookshop()
    {
        novels = new HashMap<>();
        bookstore = new Bookstore("Classic Novels Collection");

        for (final Novel novel : bookstore.getReferences())
        {
            final String key;
            key = novel.getTitle();

            novels.put(key, novel);
        }

        keySet = novels.keySet();

        printTitles();

        final Iterator<String> iterator;

        iterator = keySet.iterator();

        while (iterator.hasNext())
        {
            final String key = iterator.next();
            final Novel novel = novels.get(key);
            final String refTitle = novel.getTitle();

            if (refTitle.toLowerCase().contains("the"))
            {
                iterator.remove();
            }
        }

        removeTitlesWithThe();

        keyList = new ArrayList<>(keySet);
        Collections.sort(keyList);
        for (final String key : keyList) {
            System.out.println(novels.get(key));
        }

    }

    /**
     * Prints all titles through an iterator.
     */
    private void printTitles()
    {
        final Iterator<String> iterator;

        iterator = keySet.iterator();

        while (iterator.hasNext())
        {
            final String key = iterator.next();
            final Novel currentNovel = novels.get(key);
            System.out.println(currentNovel.getTitle());
        }
    }

    /**
     * Filters Titles containing "the".
     */
    private void removeTitlesWithThe()
    {
        final Iterator<String> iterator;

        iterator = keySet.iterator();

        while (iterator.hasNext())
        {
            final String key = iterator.next();
            final Novel novel = novels.get(key);
            final String refTitle = novel.getTitle();

            if (refTitle.toLowerCase().contains("the"))
            {
                iterator.remove();
            }
        }
    }

}
