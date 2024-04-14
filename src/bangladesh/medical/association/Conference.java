/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangladeshmedicalassociation;

/**
 *
 * @author David
 */
public class Conference {
    private String id;
    private String title;
    private int attendeeCount;
    private String host;
    private String details;

    public Conference(String id, String title, int attendeeCount, String host, String details) {
        this.id = id;
        this.title = title;
        this.attendeeCount = attendeeCount;
        this.host = host;
        this.details = details;
    }

    public Conference() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAttendeeCount(int attendeeCount) {
        this.attendeeCount = attendeeCount;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getAttendeeCount() {
        return attendeeCount;
    }

    public String getHost() {
        return host;
    }

    public String getDetails() {
        return details;
    }
    
}
