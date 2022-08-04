/**
 * Implementing interface and how interface helps in achieving multiple inheritance and also polymorphism in interface
 */
interface Camera{
    void takeSnap();
    void recordVideo();
}
interface Wifi{
    void connectedNetwork(String network);
    String[] getNetworks();
}
interface Mp3{
    void playingSong(String songName);
    String[] getSongs();
}
class CellPhone{
    void call(long phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
    void endCall(){
        System.out.println("Disconnecting..");
    }
}
class SmartPhone extends CellPhone implements Camera,Wifi,Mp3{
    @Override
    public void takeSnap() {
        System.out.println("Taking snap..");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video..");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList = {"Jio","Act","Airtel"};
        return networkList;
    }

    @Override
    public void connectedNetwork(String network) {
        System.out.println("Connecting to "+network+" network");
    }

    @Override
    public String[] getSongs() {
        System.out.println("Getting list of songs");
        String[] songs = {"Chak De India","Teri Mitti"};
        return songs;
    }

    @Override
    public void playingSong(String songName) {
        System.out.println("Connecting to"+ songName+" song..");
    }
}
public class July28_InterfacePolymorphMultipleInheritance {
    public static void main(String[] args) {
        Camera cam = new SmartPhone();//Can access only camera methods present in smartphone
        cam.recordVideo();
        cam.takeSnap();

        Wifi wifi = new SmartPhone();//Can access only wifi methods present in smartphone
        String[] networkList = wifi.getNetworks();
        for (int i = 0; i < networkList.length; i++) {
            System.out.print(networkList[i]+" ");
        }
        System.out.println();
        wifi.connectedNetwork("Act");

        Mp3 mp3Player = new SmartPhone();//Can access only mp3 methods present in smartphone
        String[] songs = mp3Player.getSongs();
        for (int i = 0; i < songs.length; i++) {
            System.out.print(songs[i]+" ");
        }
        System.out.println();
        mp3Player.playingSong("Teri Mitti");

        SmartPhone sp = new SmartPhone();//Can access all the methods present in smartphone as well as cellohone and all the interface methods
        sp.call(7901236548L);
        sp.pickCall();
        sp.endCall();
    }
}
