import java.util.HashMap;
import java.util.Set;

public class TrackList {
    
    public HashMap<String,String> createTracks() {
    HashMap<String, String> trackList = new HashMap<String, String>();
    trackList.put("Casterly Rock drop", "We will rock! Rock! Til gold spills from the ROCK!");
    trackList.put("Winterfell Storm", "Snow blinds my eyes, Whitewalkers deafen my ears, but I will always hear your voice! ");
    trackList.put("Riverrun Fun", "Fun, fun, in Riverrun.  Girls dance, and boys catch fish, all done in Riverrun.");
    trackList.put("Dragon's Landing", "RAGE!  I know what I see. CAGE!  I know where I am.  MAGE! I know what I used to be!  I am transformed into a drag-gon!");
        return trackList;
    }

    public String oneTrack(String name) {
        TrackList getTracks = new TrackList();
        HashMap<String, String> tracks = getTracks.createTracks();
        String singleTrack = tracks.get(name);
        System.out.println(singleTrack);
        return singleTrack;
    }
    public Set<String> allTracks() {
        TrackList getTracks = new TrackList();
        HashMap<String, String> trackList = getTracks.createTracks();
        Set<String> tracks = trackList.keySet();
        for (String track: tracks) {
            String sentence = String.format("Track: %s \n Lyrics: %s \n", track, trackList.get(track));
            System.out.println(sentence);
        }
        return tracks;
    }

}