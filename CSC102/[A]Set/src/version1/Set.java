package version1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet; // Order set

/*
@author Tanakrid 62130500210
*/

// ========================================================
// --------------------- CAUTION --------------------- 
// ========================================================
// - ArrayList, and every helper methods in Arrays Class are forbidden.
// ========================================================
// ========================================================
public class Set {
  // !! Do NOT modify this attribute !!
  // - Otherwise, any marks from this problem will not be given.
  private double[] number;

  // === Note that the way to construct an new empty set can be these following
  // ways:
  // 1. Set mySet = new Set();
  // 2. Set mySet = new Set(new int[] {});
  // Whenever the variable named number contains nothing, that means the set is
  // empty.
  // ==================================================================================

  // !! It is needed to implement. !!
  public Set() {
    number = new double[0];
  }

  // !! It is needed to implement. !!
  public Set(double[] number) {
    this.number = number.clone(); // to separate reference from the parameter
    this.removeDuplicate();
    this.sortNumber();

  }

  // !! It is needed to implement. !!
  public Set(int[] number) {
    this.number = new double[number.length];
    for (int i = 0; i < number.length; i++) {
      this.number[i] = (double) number[i];
    }
    this.removeDuplicate();
    this.sortNumber();

  }

  // !! It is needed to implement. !!
  // Any methods provided by Java API for sorting or manipulating elements in an
  // array are prohibitted.
  // Please implement on your own only. Otherwise, your work will not be
  // considered.
  // ==> This method will sort elements in this set.
  private void sortNumber() {
    for (int i = 0; i < number.length - 1; i++) { // somewhat bigO
      int min = i;
      double tempo = number[i];
      for (int j = i + 1; j < number.length; j++) {
        if (number[j] < tempo) {
          tempo = number[j];
          min = j;
        }
      }
      double temp = number[i];
      number[i] = number[min];
      number[min] = temp;
    }
  }

  // !! It is needed to implement. !!
  // Any methods provided by Java API for manipulating an array are prohibitted.
  // Please implement on your own only. Otherwise, your work will not be
  // considered.
  // ==> This method will remove the duplicated elements in this set.
  private void removeDuplicate() {
    java.util.Set result = new HashSet<Double>();
    for (double i : number) {
      result.add(i);
    }

    Iterator<Double> num = result.iterator();
    number = new double[result.size()];
    for (int i = 0; i < number.length; i++) {
      number[i] = num.next();
    }
    /*
     * double arr[] = new double[result.size()]; for (int i = 0; i < arr.length;
     * i++) { // arr[i] = Double.valueOf(result.toArray()[i].toString()); // No
     * iterator arr[i] = (double) num.next();
     * //Double.valueOf(num.next().toString()); } number = arr.clone(); // remove
     * reference
     */

  }

  // !! It is needed to implement. !!
  // ==> This method will return length of the set.
  // ==> Note that: this method will not count the duplicated elements.
  public int length() {
    return number.length;
  }

  // !! It is needed to implement. !!
  // ==> This method will return TRUE/FALSE whether this set belongs to set Set.
  public boolean belongsTo(Set set) {
    java.util.Set result = new HashSet<Double>();
    for (int i = 0; i < number.length; i++) {
      for (int j = 0; j < set.length(); j++) {
        if (number[i] == set.getValueInArray()[j]) {
          result.add(number[i]);
          break;
        }
      }
    }
    return result.size() == length();

  }

  // !! It is needed to implement. !!
  // ==> This method will return the set composed of elements in A or B.
  // ==> HINT : A U B
  // ==> {1.0, 2.0, 3.0} U {2.0, 4.0, 5.0, 6.0} equals {1.0, 2.0, 3.0, 4.0, 5.0,
  // 6.0}
  public Set union(Set set) {
    java.util.Set result = new HashSet<Double>();
    for (double i : number) {
      result.add(i);
    }
    for (double i : set.getValueInArray()) {
      result.add(i);
    }
    double[] arr = new double[result.size()]; // convert to set
    Iterator<Double> num = result.iterator();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Double.valueOf(num.next().toString());
    }
    Set s = new Set(arr.clone());
    return s;
  }

  // !! It is needed to implement. !!
  // ==> This method will return the set composed of elements being available both
  // in A and B.
  // ==> HINT : A ∩ B
  // ==> {1.0, 2.0, 3.0} ∩ {2.0, 4.0, 5.0, 6.0} equals {2.0}
  public Set intersect(Set set) {
    java.util.Set result = new HashSet<Double>();
    for (int i = 0; i < number.length; i++) {
      for (int j = 0; j < set.length(); j++) {
        if (number[i] == set.getValueInArray()[j]) {
          result.add(number[i]);
          break;
        }
      }
    }
    double[] arr = new double[result.size()];
    Iterator<Double> num = result.iterator();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Double.valueOf(num.next().toString());
    }
    Set s = new Set(arr.clone());
    return s;
  }

  // !! It is needed to implement. !!
  // ==> This method will return the set composed of elements being in A except B.
  // ==> HINT : A - B
  // ==> {1.0, 2.0, 3.0} - {2.0, 4.0, 5.0, 6.0} equals {1.0, 3.0}
  public Set differ(Set set) {
    java.util.Set result = new HashSet<Double>();
    for (int i = 0; i < number.length; i++) {
      boolean zero = true;
      for (int j = 0; j < set.length(); j++) {
        if (number[i] == set.getValueInArray()[j]) {
          zero = false;
          break;
        }
      }
      if (zero) {
        result.add(number[i]);
      }
    }
    double[] arr = new double[result.size()];
    Iterator<Double> num = result.iterator();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Double.valueOf(num.next().toString());
    }
    Set s = new Set(arr.clone());
    return s;
  }

  // !! Do NOT modify this method !!
  // - Otherwise, any marks from this problem will not be given.
  public double[] getValueInArray() { // Leaked
    return number;
  }

  // !! It is needed to implement. !!
  // ==> This method will return TRUE/FALSE depending on whether this set equals
  // to set Set or not.
  public boolean equals(Set set) {
    java.util.Set result = new LinkedHashSet<Double>(); // Arrays.asList() inside parenthess
    java.util.Set result2 = new LinkedHashSet<Double>();
    for (double i : this.number) {
      result.add(i);
    }
    for (double i : set.getValueInArray()) {
      result2.add(i);
    }
    return result.equals(result2);
  }

  // !! It is needed to implement. !!
  // ==> This method will return the String which shows the (sorted) list of
  // elements in this set.
  // ==> e.g. {1.0, 2.0, 3.5, 5.0}
  public String getStringValue() {
    java.util.Set result = new LinkedHashSet<Double>();
    for (double i : number) {
      result.add(i);
    }
    return result.toString();
  }

  // !! Do NOT modify this method !!
  // - Otherwise, any marks from this problem will not be given.
  public void print() {
    System.out.println(getStringValue());
  }

  // !! It is needed to implement. !!
  // ==> This method will return the summation of all elements in this set.
  // ==> if you have {1.0, 2.0, 3.5, 5.0}, you will get 11.5.
  public static double sumAllNumberInSet(Set set) {
    double sum = 0;
    for (double i : set.getValueInArray()) {
      sum += i;
    }
    return sum;
  }
}
