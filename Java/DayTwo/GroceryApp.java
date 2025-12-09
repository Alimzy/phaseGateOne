import java.util.Scanner;

public class GroceryApp{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
String[] myLists = new String[10];

String menu = """
    WELCOME TO ALIMZY GROCERY APP
1. Add Items
2. Remove Items
3. Show all available items
4. Exit

""";
System.out.println(menu);

System.out.println("Enter an options sir/ma");
int menuCase = input.nextInt();

switch(menuCase){
    case 1->{
       System.out.println("How many items do you want to add sir/ ma: ");
       int addNumber = input.nextInt();
        
       for(int count = 0; count <= addNumber;count++){
        System.out.println("Enter an item to add sir/ ma: ");
        String addItems = input.nextLine();
        
        myLists[count] += addItems;
        System.out.println("Added successful");
        
}
    case 2->{
        System.out.println("How many items do you want to remove sir/ ma: ");
        int removeNumber = input.nextInt();
        for(int count = 0;count <= removeNumber; count++){
        System.out.println("Enter an item you want to remove sir/ ma");
        
        } 
        

        


}
      
        


        }
        





}

}

}
