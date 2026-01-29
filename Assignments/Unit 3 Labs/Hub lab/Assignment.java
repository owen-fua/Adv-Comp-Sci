public class Assignment {
    private String title;
    private String description;
    private int descriptionLength;

    public Assignment(String title, String description) {
        // Students: add your own validation and exceptions as you see fit
        setTitle(title);
        setDescription(description);
    }

    public void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("Title is null");
        }
        if (title.length() > 12) {
            throw new IllegalArgumentException("Title is too long");
        }
        this.title = title;

    }

    public void setDescription(String description) {
        for (int i = 0; i < description.length() - 3; i++) {
            if (description.substring(i, i + 4).equals("deez")) {
                throw new IllegalArgumentException("Can't say deez");
            }
        }
        for (int i = 0; i < description.length() - 1; i++) {
            if (description.substring(i, i + 2).equals("67")) {
                throw new IllegalArgumentException("Can't say 67 ");
            }
        }
        this.description = description;
        this.descriptionLength = (description == null) ? 0 : description.length();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDescriptionLength() {
        return descriptionLength;
    }
}
