import java.util.Scanner;
class CD
{
    String name;
    String extension;
    int data;
    String author;
    CD(String name,String extension,int data,String author)
    {
        this.name=name;
        this.extension=extension;
        this.data=data;
        this.author=author;
    }
}

class Application
{
    String name;
    String filetype;
    Application(String name,String filetype)
    {
        this.name=name;
        this.filetype=filetype;
    }
    void play()
    {
          if(filetype.equals("mp3")) System.out.println("The song "+ name+ " is playing with mp3 application");
          else if(filetype.equals("wav")) System.out.println("The song "+ name+ " is playing with wav application");
          else if(filetype.equals("flac")) System.out.println("The song "+ name+ " is playing with flac application");
          else if(filetype.equals("mp4")) System.out.println("The video "+ name+ " is playing with mp4 application");
          else if(filetype.equals("avi")) System.out.println("The video "+ name+ " is playing with avi application");
          else if(filetype.equals("mkv")) System.out.println("The video "+ name+ " is playing with mkv application");
    }

}

class Music extends Application
{     
      String author;
      Music(String name,String filetype,String author)
      {
          super(name,filetype);
          this.author=author;
      }

     
}

class Video extends Application{

    Video(String name,String filetype)
    {
        super(name,filetype);
    }
}





    
    



class File
{
    public static void main(String[] args)
    {    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the music or video name");
        String name=sc.nextLine();
        System.out.println("Enter the extension.");
        String ex=sc.nextLine();
        System.out.println("Enter the file size");
        int size=sc.nextInt();
        System.out.println("Enter the author name");
        String author=sc.nextLine();
        sc.nextLine();



        CD cd=new CD(name,ex,size,author);
        
        
        if(cd.extension.equals("mp3")||cd.extension.equals("wav")||cd.extension.equals("flac"))
        {
            Music app=new Music(cd.name,cd.extension,cd.author);
           
            app.play();
           
           


        }
        else if(cd.extension.equals("mp4")||cd.extension.equals("avi")||cd.extension.equals("mkv"))
        {
            Video app1=new Video(cd.name,cd.extension);
            
            app1.play();
        }


    }
}