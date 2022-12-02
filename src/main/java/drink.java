public class drink {
    public drink(String name_dr, int count_dr, String char_dr) {
        this.name_dr = name_dr;
        this.count_dr = count_dr;
        this.char_dr = char_dr;
    }

    String name_dr;
    int count_dr;
    String char_dr;

    public String getName_dr() {
        return name_dr;
    }

    public void setName_dr(String name_dr) {
        this.name_dr = name_dr;
    }

    public int getCount_dr() {
        return count_dr;
    }

    public void setCount_dr(int count_dr) {
        this.count_dr = count_dr;
    }

    public String getChar_dr() {
        return char_dr;
    }

    public void setChar_dr(String char_dr) {
        this.char_dr = char_dr;
    }
}
