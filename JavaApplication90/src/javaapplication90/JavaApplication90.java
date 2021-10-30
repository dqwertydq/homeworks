package javaapplication90;

public class JavaApplication90 {

    public static void main(String[] args) {
            
        Author author1 = new Author("Самуель","Клеманс","Марк Твен");
        System.out.print(author1);
        Book book1= new Book("Приключения Тома Соера",
                             1895,
                             1900,
                             author1,
                             "Издатель в Америке");
        
        
        
        
        
        
        System.out.println(book1)
    }
    
}
