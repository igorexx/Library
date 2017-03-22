package data;

/**
 * Created by VADMIN on 2017-03-22.
 */
public class Magazine extends Publication {
    private String month;
    private int day;
    private String language;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Magazine(String title, String publisher, String language, int year,
                    String month, int day) {
        setTitle(title);
        setPublisher(publisher);
        setLanguage(language);
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void printInfo() {
        String info = getTitle() + "; " + getPublisher() + "; " + getYear()
                + "-" + getMonth() + "-" + getDay() + " ;" + getLanguage();
        System.out.println(info);
    }
}
