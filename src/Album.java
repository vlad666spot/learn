import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name=name;
        this.artist=artist;
        this.songs=new ArrayList<Song>();
    }

    public boolean addSong(String titleOfSong, double durationOfSong){
        if(findSong(titleOfSong)==null){
            Song song = new Song(titleOfSong,durationOfSong);
            this.songs.add(song);
            System.out.println(titleOfSong + " - Song successfully added to list \n");
            return true;
        }
        System.out.println(titleOfSong + " - Song was not possible to add to list ");
        return false;
    }

    private Song findSong(String songTitle){
        for (Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(songTitle)){
                System.out.println(songTitle + " - Song already exist at list");
                return checkedSong;
            }
        }
        System.out.println(songTitle+ " - Song doesn't exist at list");
        return null;
    }

    public boolean addToPlayList(int numberOfSongInAlbum, LinkedList<Song> playlist){
        int index = numberOfSongInAlbum -1;
        if((index>=0)&&(numberOfSongInAlbum<=this.songs.size())){
            playlist.add(this.songs.get(index));
            System.out.println("Song with index: "+numberOfSongInAlbum+" is successfully added to playlist \n");
            return true;
        }
        System.out.println("Song with index: "+numberOfSongInAlbum+" is NOT added to playlist \n");
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playlist){
        if (findSong(titleOfSong)!=null){
            playlist.add(findSong(titleOfSong));
            System.out.println(titleOfSong+" - added to playlist");
            return true;
        }
        System.out.println(titleOfSong+ " -  NOT added to playlist ");
        return false;
    }
}
