public class User {
    String imie;
    int wiek;

    public User(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    String getImie() {
        return this.imie;
    }

    int getWiek() {
        return this.wiek;
    }

    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        User[] users = {anna, betty, carl, david, eva, frankie};
        int ilosc = users.length;
        double sum = 0.0;


 for (int i=0; i < users.length; i++) {
      sum = sum +users[i].wiek;

 }
 double average = sum/ilosc;
 System.out.println(average);
 for(int i=0; i < users.length; i++) {
     if (users[i].wiek < average) {
         System.out.println(users[i].imie);
     }
 }
    }

}




