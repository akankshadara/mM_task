package mMTask ;
import java.util.Arrays;
import java.io.FileReader;
import java.lang.String;
import java.io.FileWriter;

public class App
{
    public static void main( String[] args )
    {
        System.out.println(Arrays.toString(args));

        //take the input file name
        String fname = Arrays.toString(args);
        fname = fname.substring(1, fname.length()-1) ;
        System.out.println("File entered: " + fname);

        //read the input file
        System.out.println("Reading file...");

        String contents = "";
        try{
            //FileReader fr=new FileReader("C:\\Users\\DIVAKAR\\Desktop\\input_file.tex");
            FileReader fr = new FileReader(fname) ;
            int i;
            while((i=fr.read())!=-1)
                contents = contents + (char)i;
            String modified_contents = convertmM(contents);
            System.out.println("file converted....\nwriting file to output.tex...");

            //write the modified string to a new file
            try{
                FileWriter fw=new FileWriter("output.tex");
                fw.write(modified_contents);
                fw.close();
            }catch(Exception e){System.out.println(e);}
            System.out.println("file written!");
        }
        catch (Exception e){
            System.out.println(e);
        }

        // System.out.println(contents);  // printing the read contents of the input file.

    }

    public static String convertmM(String contents)
    {
        String modified_contents = "";          //modified string (afer replacing m with M and vice versa)

        for (char ch: contents.toCharArray()) {
            if(ch == 'm'){
                modified_contents = modified_contents + "M";
            }
            else if(ch == 'M'){
                modified_contents = modified_contents + "m";
            }
            else{
                modified_contents = modified_contents + ch;
            }
        }
//        System.out.println(modified_contents);
        return modified_contents ;
    }

}

//sample string    //String contents = "Mhms is a random Monkey.\nMy room.\nMs. Segal was the reporter who was giving Leland Anderson and the department such a hard time over the missing Wassermann twins.";
