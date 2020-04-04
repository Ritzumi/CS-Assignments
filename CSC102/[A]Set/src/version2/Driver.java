package version2;

// ========================================================
// --------------------- CAUTION --------------------- 
// ========================================================
// - Do NOT modify any code below here.
// - Otherwise, any marks from this problem will not be given.
// ========================================================
// ========================================================
public class Driver {
  // !! Do NOT modify this method !!
  // - Otherwise, any marks from this problem will not be given.
  public static void main(String[] args) {
    System.out.println("Set 1");
    System.out.println("===========");
    Set Set1 = new Set();
    Set1.print();
    System.out.println("");
    
    System.out.println("Set 2");
    System.out.println("===========");
    Set Set2 = new Set(new int[] {8,1,2,3,5,5,7,8,8,8,9});
    Set2.print();
    System.out.println(Set2.length());
    System.out.println("");
    
    System.out.println("Set 3");
    System.out.println("===========");
    Set Set3 = new Set(new int[] {8,7,7,6,5,1,-30});
    Set3.print();
    System.out.println(Set3.length());
    System.out.println("");
    
    System.out.println("Set 4");
    System.out.println("===========");
    Set Set4 = new Set(new int[] {9,4});
    Set4.print();
    System.out.println(Set4.length());
    System.out.println("");
    
    System.out.println("Set 5");
    System.out.println("===========");
    Set Set5 = Set2.intersect(Set3);
    Set5.print();
    System.out.println(Set5.length());
    System.out.println("");
    
    System.out.println("Set 6");
    System.out.println("===========");
    Set Set6 = Set2.union(Set5);
    Set6.print();
    System.out.println("");
    
    System.out.println("Set 7");
    System.out.println("===========");
    Set Set7 = new Set();
    Set7 = Set7.union(Set2).union(new Set(new int[] {20,45,80,100,50}));
    Set7.print();
    System.out.println("");
    
    System.out.println("Set 8");
    System.out.println("===========");
    Set Set8 = new Set();
    Set8 = Set8.union(Set1).union(Set1).union(Set1).union(Set1);
    Set8.print();
    System.out.println("");
    
    System.out.println("Set 9");
    System.out.println("===========");
    Set Set9 = new Set();
    Set9 = Set7.differ(Set5);
    Set9.print();
    System.out.println("");
    
    System.out.println("Set 10");
    System.out.println("===========");
    Set Set10 = new Set();
    Set10 = Set1.differ(Set1.union(Set2));
    Set10 = Set10.differ(Set10).union(Set3);
    Set10.print();
    System.out.println("");
    
    System.out.println("Set 11");
    System.out.println("===========");
    Set Set11 = new Set();
    Set11 = new Set(new int[] {4,9}).differ(Set5).union(Set4);
    Set11.print();
    System.out.println("Is Set11 equivalent to Set1 ? ==> "+ (Set11.equals(Set1)?"Yes":"No"));
    System.out.println("Is Set11 equivalent to Set2 ? ==> "+ (Set11.equals(Set2)?"Yes":"No"));
    System.out.println("Is Set11 equivalent to Set3 ? ==> "+ (Set11.equals(Set3)?"Yes":"No"));
    System.out.println("Is Set11 equivalent to Set4 ? ==> "+ (Set11.equals(Set4)?"Yes":"No"));
    System.out.println("");
    
    System.out.println("Set 12");
    System.out.println("===========");
    Set Set12 = new Set();
    Set12 = new Set(new int[] {});
    Set12.print();
    System.out.println("Is Set12 equivalent to Empty Set ? ==> "+ (Set12.equals(new Set())?"Yes":"No"));
    System.out.println("Is Set12 equivalent to Empty Set ? ==> "+ (Set12.equals(new Set(new int[] {}))?"Yes":"No"));
    System.out.println("Is Set12 equivalent to Empty Set ? ==> "+ (Set12.equals(Set1)?"Yes":"No"));
    System.out.println("");
   
    System.out.println("Set 13");
    System.out.println("===========");
    Set Set13 = new Set();
    Set13 = new Set(new int[] {5,6,7});
    Set13.print();
    System.out.println("Do {5, 6, 7} belong to Set 10 ? ==> "+ (Set13.belongsTo(Set10)?"Yes":"No"));
    Set13 = new Set(new int[] {5,7,8});
    System.out.println("Do {5, 7, 8} belong to Set 10 ? ==> "+ (Set13.belongsTo(Set10)?"Yes":"No"));
    Set13 = new Set(new int[] {1, 2, 5, 98});
    System.out.println("Do {1, 2, 5, 98} belong to Set 10 ? ==> "+ (Set13.belongsTo(Set10)?"Yes":"No"));
    System.out.println("");
    
    System.out.println("Set 14");
    System.out.println("===========");
    System.out.println("Empty Set U {2,5,6,7} ==> "+ new Set().union(new Set(new int[] {2, 5, 6, 7})).getStringValue());
    System.out.println("{2,5,6,7} U Empty Set ==> "+ new Set(new int[] {2, 5, 6, 7}).union(new Set()).getStringValue());
    System.out.println("");
    
    System.out.println("Set 15");
    System.out.println("===========");
    System.out.println("{} - {2,5,6,7} ==> "+ new Set().differ(new Set(new int[] {2, 5, 6, 7})).getStringValue());
    System.out.println("{2,5,6,7} - {} ==> "+ new Set(new int[] {2, 5, 6, 7}).differ(new Set()).getStringValue());
    System.out.println("");
    
    System.out.println("Set 16");
    System.out.println("===========");
    Set1.union(Set2).union(Set3).union(Set4).union(Set5).union(Set6).intersect(Set1).print();
    System.out.println("");
    
    System.out.println("Set 17");
    System.out.println("===========");
    System.out.println("Summation of all numbers in ((Set2 - Set2) - Set1) U Set5 equals "+ Set.sumAllNumberInSet(Set2.differ(Set2).differ(Set1).union(Set5)));
    System.out.println("");
    
    System.out.println("Set 18");
    System.out.println("===========");
    Set Set18 = new Set(new double[] {Math.log(10), Math.pow(2.5, 2.5), Math.cos(14), Math.PI, Math.asin(0.5), Math.tan(20)});
    Set18.print();
    System.out.println("");
    
    System.out.println("Set 19");
    System.out.println("===========");
    Set Set19 = new Set(new double[] {125d, 168.366666, 14D, 0.2, 1, 3f, 25L, 54f, 010});
    Set19.print();
    System.out.println("");
    
    System.out.println("Set 20");
    System.out.println("===========");
    Set Set20 = new Set(new double[] {0x4, 0x1, 25L, 011}).intersect(Set10);
    Set20.print();
    System.out.println("");
  }
}