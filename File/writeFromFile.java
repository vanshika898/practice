import java.io.*;

public class writeFromFile {
    public static void main(String args[]) throws IOException {
     OutputStream  os = System.out ;
    //  os.write(12);
     System.out.println();

     try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
        osw.write("Hello world");
        osw.write(97);
        osw.write(10);
        osw.write("\n");
        char [] arr = "HelloWorld".toCharArray();
        osw.write(arr);
     }

try(FileWriter osw = new FileWriter("notes.txt",true)){
       osw.write("शुभ रात्रि / नमस्कार");
       osw.write(System.lineSeparator());

       osw.write("------------------------------");
        osw.write(System.lineSeparator());

       osw.write('A');
          osw.write(System.lineSeparator());
     }


     try(BufferedWriter br = new BufferedWriter(new FileWriter("notes.txt",true))){
        br.write("शुभ रात्रि / नमस्कार buffer");
     }


    }


    
}
