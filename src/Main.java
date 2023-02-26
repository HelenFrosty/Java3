
import com.bethecoder.ascii_table.ASCIITable;
import java.util.ArrayList;
import java.util.LinkedList;



public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<Integer>();
        LinkedList<Integer> linkList = new LinkedList<Integer>();
        
        
        Clock t = new Clock();
        
        
        String [] headers = { " ", ".add()", ".get()",".delete()"};

        String[][] tableData = {
                    { "ArrayList/iterations", "5000000", "5000000", "500"  },
                    { "ArrayList/time", "", "", "" },
                    { "LinkedList/iterations", "5000000", "5000000", "500"  },
                    { "LinkedList/time", "", "", "" },
        };

        
        t.start();
        for(int i=0; i<5000000; i++) arList.add(i);
        tableData[1][1] = t.stop()+"";
        
        t.start();
        for(int i=0; i<5000000; i++) arList.get(i);
        System.out.println("time: " + t.stop() + " ms");
        tableData[1][2] = t.stop()+"";
        
        t.start();
        for(int i=0; i<500; i++) arList.remove(i);
        tableData[1][3] = t.stop()+"";
        
        //---------------
        
        t.start();
        for(int i=0; i<5000000; i++) linkList.add(i);
        tableData[3][1] = t.stop()+"";
        
        
        t.start();
        for(int i=0; i<500000; i++) linkList.get(i);
        tableData[3][2] = t.stop()+"";
        
   
        t.start();
        for(int i=0; i<500; i++) linkList.remove(i);
        tableData[3][3] = t.stop()+"";
        
        
        
        

        // Таблица выводится с помощью готовой библиотеки
        ASCIITable.getInstance().printTable(headers, tableData);
        
    }
    
}
