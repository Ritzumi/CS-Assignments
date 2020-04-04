package module;

import java.sql.ResultSet;

public class DriverTest {
    public static void main(String[] args) {
        try {
            QueryModel q = new QueryModel();
            ResultSet res = q.getEmployeeInfo("Mantis", "Gips");
            if(res.next()){
                System.out.println(res.getString("salary"));
            } else {
                System.out.println("None");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
