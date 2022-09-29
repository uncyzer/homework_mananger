package task;
import java.util.Date;

import exception.AlreadyExistsException;

/**
 * Class task 
 * @author Enzo ROCAMORA
 * @version 1.0
 */
public class Task {
    private long creator;
    private long id;
    private String name;
    private String description;
    private Date dueDate;
    private Date creationDate;

    /**
     * Constructor
     * @param creator
     * @param id
     * @param name
     * @param description
     * @param dueDate
     * @param creationDate
     */
    public Task(long creator, long id, String name, String description, Date dueDate, Date creationDate) {
        this.creator = creator;
        this.id = id;
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.creationDate = creationDate;
    }

    /**
     * Default constructor
     */
    public Task() {
        this((long) 0, (long) 0, "", "", new Date(), new Date());
    }

    /**
     * Save the task in the database
     * @throws AlreadyExistsException
     */
    public void save() throws AlreadyExistsException {
        if(isExist()) {
            throw new AlreadyExistsException(this, "The task already exists");
        }
        // Todo: save the task
    }

    public static void delete(Task t) throws AlreadyExistsException {
        if(!t.isExist())
            throw new AlreadyExistsException(t, "The task doesn't exist");
        // Todo: delete the task
    }

    /**
     * Verify in data if the task already exists in the database
     * @return boolean
     */
    public boolean isExist() {
        if(true)
            return true;
        return false;
    }
    
    /**
     * @return the creator
     */
    public long getCreator() {
        return creator;
    }

    /**
     * @param creator the creator to set
     */
    public void setCreator(long creator) {
        this.creator = creator;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Task [creator=" + creator + ", creationDate=" + creationDate + ", description=" + description + ", dueDate="
                + dueDate + ", id=" + id + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Task)) {
            return false;
        }
        Task task = (Task) o;
        return (creator == task.creator)
        && (id == task.id)
        && (name == task.name)
        && (description == task.description)
        && (dueDate.equals(task.dueDate))
        && (creationDate.equals(task.creationDate));
    }
}
