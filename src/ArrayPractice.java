public class ArrayPractice {
  public static void main(String[] args) {
    String[] names = {"Tom", "Allen", "Marcello"};
    StringBuilder roster = new StringBuilder("Roster: ")
      int prefixLength = "Roster: ".length();
    
    for (String name : names) {
      if (roster.length() > prefixLength) roster.append(", ");
      roster.append(name);
      System.out.println(roster);
    }
  }
}
