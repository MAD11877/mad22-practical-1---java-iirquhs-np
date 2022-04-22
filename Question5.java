import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int loopLen = in.nextInt();

    ArrayList<Integer> data = new ArrayList<Integer>();
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < loopLen; i++) {
      int number = in.nextInt();
      data.add(number);
    }
    for (int number : data) {
      if (map.containsKey(number)) {
        map.put(number, map.get(number) + 1);
      } else {
        map.put(number, 1);
      }
    }


    // sorry cher i googled for this part
    // i have no idea what this is
    int highestOccur = (Collections.max(map.values()));
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue()==highestOccur) {
        System.out.println(entry.getKey());
      }
    }
  }
}
