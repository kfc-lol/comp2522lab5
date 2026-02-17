package ca.bcit.comp2522.bookstore;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Bookshop
{
    private final Map<String, Novel> novels;
    private final Bookstore bookstore;
    private final Set<String> keySet;
    private final List<String> keyList;

    public Bookshop()
    {
        novels = new HashMap<>();
        bookstore = new Bookstore("Classic Novels Collection");

        for (Novel novel : bookstore.getReferences())
        {
            String key;
            key = novel.getTitle();

            novels.put(key, novel);
        }

        keySet = novels.keySet();

        printTitles();
        removeTitlesWithThe();

        keyList = new ArrayList<>(keySet);
        Collections.sort(keyList);
        for (String key : keyList) {
            System.out.println(novels.get(key));
        }

    }

    private void printTitles()
    {
        final Iterator<String> iterator;

        iterator = keySet.iterator();

        while (iterator.hasNext())
        {
            String key = iterator.next();
            Novel novel = novels.get(key);
            System.out.println(novel.getTitle());
        }
    }

    private void removeTitlesWithThe()
    {
        final Iterator<String> iterator;

        iterator = keySet.iterator();

        while (iterator.hasNext())
        {
            String key = iterator.next();
            Novel novel = novels.get(key);
            String refTitle = novel.getTitle();

            if (refTitle.toLowerCase().contains("the"))
            {
                iterator.remove();
            }
        }
    }

}
