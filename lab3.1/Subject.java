public class Subject implements Delivery{
    public int credit;
    public String name;
    public String description;
    public String tutor;
    public String room;

    public Subject (int credit, String name, String description) {
        this.credit = credit;
        this.name = name;
        this.description = description;
    }
    public int getCredit() {
        return credit;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getTutor(String tutor) {
        return tutor;
    }
    public String getRoom(String room) {
        return room;
    }

}

