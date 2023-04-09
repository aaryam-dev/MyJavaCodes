import java.util.HashMap;

class Main {
  public static void countFreq(int[] arr, int n) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < n; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    for (int key : map.keySet()) {
      System.out.println(key + " " + map.get(key));
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 7};
    int n = arr.length;

    countFreq(arr, n);
  }
}
