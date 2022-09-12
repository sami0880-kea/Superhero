public class Database {
    private Superhero[] helte;
    public Database() {
        Superhero s1 = new Superhero("Batman");
        this.helte = new Superhero[]{s1};
    }

    public String getAlleNavne() {
        for(Superhero helt : helte) {
            System.out.println(helt.getNavn());
        }
        return null;
    }
}
