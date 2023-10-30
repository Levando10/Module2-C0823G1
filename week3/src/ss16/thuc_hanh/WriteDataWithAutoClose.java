package ss16.thuc_hanh;

 public class WriteDataWithAutoClose {

 public static void main(String[] args) throws Exception {

     java.io.File file = new java.io.File("newfile"); // tao file

     if (file.exists()) {

       System.out.println("File already exists");

       System.exit(0);

       }

     try (

// Create a file

     java.io.PrintWriter output = new java.io.PrintWriter(file);

 ) {

       // Write formatted output to the file

       output.println("John T Smith aaa ");

       output.println(90);

       output.print("Eric K Jones ");

       output.println(85);

       }

     }

 }