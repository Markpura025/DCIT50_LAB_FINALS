package model;


public class Task extends AbstractTask {


public enum Status {
NOT_STARTED, ONGOING, DONE
}


private Status status;


public Task() {
this.status = Status.NOT_STARTED;
}


public Task(int ID, String NAME, String DESCRIPTION, Status STATUS) {
super(ID, Name, DESCRIPTION);
this.status = status;
}


@Override
public String getStatus() {
return status.name();
}


@Override
public void setStatus(String status) {
this.status = Status.valueOf(status);
}


public Status getStatusEnum() {
return status;
}


public void setStatusEnum(Status status) {
this.status = status;
}
}