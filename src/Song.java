public class Song {
    private String title;
    private double duration;

    public Song(String titleOfSong, double durationOfSong){
        this.title=titleOfSong;
        this.duration=durationOfSong;
    }

    public String getTitle(){
        return this.title;
    }

    @Override
    public String toString(){
        return this.title+": "+this.duration;
    }
}