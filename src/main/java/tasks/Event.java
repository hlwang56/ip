package tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Event extends Task {
    String at;

    public Event(String name, String at) {
        super(name);
        this.at = at;
        setListName();
    }

    @Override
    public void setListName() {
        if(!isDone){
            this.listName = "[E]" + this.unmarkedStatus + this.taskName + "(at: " + at + ")";
        }else{
            this.listName = "[E]" + this.markedStatus + this.taskName + "(at: " + at + ")";
        }
    }
}