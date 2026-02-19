package ca.bcit.comp2522.bookstore;

/**
 * Represents a Novel, with a title, written by an author in a specific year.
 *
 * @author Kian Castro
 * @author India Murgatroyd
 * @version 1
 */
public class Novel
    implements Comparable<Novel>
{

    private static final int MIN_YEAR     = 1400;
    private static final int CURRENT_YEAR = 2026;
    private static final int MAX_YEAR     = CURRENT_YEAR;

    private final String title;
    private final String authorName;
    private final int    yearPublished;

    /**
     * Constructs a Novel object.
     *
     * @param title title of novel
     * @param authorName author that wrote novel
     * @param yearPublished year novel was published
     */
    public Novel(final String title,
                 final String authorName,
                 final int yearPublished)
    {

        validateTitle(title);
        validateAuthor(authorName);
        validateYear(yearPublished);

        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * Validates title parameter.
     *
     * @param title title must be valid
     */
    private static void validateTitle(final String title)
    {
        if(title == null || title.isEmpty())
        {
            throw new IllegalArgumentException("Title is invalid.");
        }
    }

    /**
     * Validates author parameter.
     *
     * @param authorName author must be valid
     */
    private static void validateAuthor(final String authorName)
    {
        if(authorName == null || authorName.isEmpty())
        {
            throw new IllegalArgumentException("Author's name is invalid.");
        }
    }

    /**
     * Validates yearPublished parameter.
     *
     * @param yearPublished year must be in between MIN_YEAR and MAX_YEAR
     */
    private static void validateYear(final int yearPublished)
    {
        if (yearPublished < MIN_YEAR || yearPublished > MAX_YEAR)
        {
            throw new IllegalArgumentException("Year is invalid.");
        }
    }

    /**
     * Accesses the title variable.
     *
     * @return title of novel
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Accesses the authorName variable.
     *
     * @return author's name
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Accesses yearPublished variable.
     *
     * @return year novel was published
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    @Override
    public int compareTo(Novel o)
    {
        return this.title.compareTo(o.getTitle());
    }
}
