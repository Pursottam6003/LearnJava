
interface gallery
{
    void crop_image();
    void play_video();
    void play_recording();
   
}

interface Vlc_mediaplayer extends gallery
{
    void upload();
    void share();
    void open_camera();
}

class media_player implements Vlc_mediaplayer
{
    public void upload()
    {
        System.out.println("Your image is uploaded");
    }

    public void share()
    {
        System.out.println("share in whats app face book instagram");
    }

    public void open_camera()
    {
        System.out.println("Camera is opened");
    }

    public void crop_image()
    {
        System.out.println("Your image is croped");
    }
    public void play_recording()
    {
        System.out.println("select and play the recorded video");
    }

    public void play_video()
    {
        System.out.println("rick roll ");
    }

    void music()
    {
        System.out.println("By please dont go\n");
    }

    void makeCall()
    {
        System.out.println("Call is ringinh \n");
    }

    void acceptCall(String num)
    {
        System.out.println("You have a call from "+num);
    }
}

public class Interface_inheritence
{
    public static void main(String [] args)
    {
        media_player mx=new media_player();
        mx.open_camera();
        mx.crop_image();
        mx.acceptCall("alpha34");
    }
}

