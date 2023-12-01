import java.util.ArrayList;
import java.util.Iterator;
/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class BetterNotebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<Note> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public BetterNotebook()
    {
        notes = new ArrayList<Note>();
    }

    public static BetterNotebook test2(){
        BetterNotebook notebook = new BetterNotebook();
        notebook.storeNote("a");
        notebook.storeNote("bc");
        return notebook;
    }
    public static BetterNotebook test(){
        BetterNotebook notebook1 = new BetterNotebook();
        notebook1.storeNote("a");
        notebook1.storeNote("b");
        notebook1.storeNote("b");
        notebook1.storeNote("b");
        notebook1.storeNote("c");
        return notebook1;
    }
    
       public static BetterNotebook test3(){
        BetterNotebook notebook1 = new BetterNotebook();
        notebook1.storeNote("a");
        notebook1.storeNote("b");
        notebook1.storeNote("b");
        notebook1.storeNote("b");
        notebook1.storeNote("c");
        notebook1.removeWithIndex("b");
        notebook1.printAll();   
        return notebook1;
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        if ((null == note) || "".equals(note)) return;
        notes.add(new Note("Note 1",note));
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Print a note.
     * @param noteNumber The number of the note to be shown.
     */
    public void printNote(int noteNumber)
    {
        if(noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }

    public String getAll(){
        String result = "";
        for (Note note : notes){
            result += note.text+"\n";
        }
        return result;
    }

    
     public void printAll(){
        
        for (Note note : notes){
            System.out.println(note);
        }
        
    }
    public void removeWithIndex(String searchString){
        int size = notes.size();
        for(int i=0;i<size;i++){
        
            if (notes.get(i).text.contains(searchString)){
                notes.remove(i);
                i--;
            }
        }
        
    }

    public String getNotesWith(String searchString){
        String result = "";
        result = result +"??" +"\n";
        return result;

    }

}
