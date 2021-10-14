import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist){
        this.name=name;
        this.artist=artist;
        this.songs=new SongList();
    }

    public boolean addSong(String titleOfSong, double durationOfSong){
        return this.songs.add(titleOfSong,durationOfSong);
    }

    public boolean addToPlayList(int numberOfSongInAlbum, LinkedList<Song> playlist){
        Song checkedSong = this.songs.findSong(numberOfSongInAlbum);
        if(checkedSong!=null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track "+ numberOfSongInAlbum);
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playlist){
        if (this.songs.findSong(titleOfSong)!=null){
            playlist.add(this.songs.findSong(titleOfSong));
            System.out.println(titleOfSong+" - added to playlist");
            return true;
        }
        System.out.println(titleOfSong+ " -  NOT added to playlist ");
        return false;
    }

    private class SongList{
        private ArrayList<Song> songs;

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

        private Song findSong(int songNumber){
            int index = songNumber -1;
            if ((index>0)&&(index<songs.size())){
                return songs.get(index);
            }
            return null;
        }

        public boolean add (String titleOfSong, double durationOfSong){
            if(findSong(titleOfSong)==null){
                Song song = new Song(titleOfSong,durationOfSong);
                this.songs.add(song);
                System.out.println(titleOfSong + " - Song successfully added to list \n");
                return true;
            }
            System.out.println(titleOfSong + " - Song was not possible to add to list ");
            return false;
        }
    }
}