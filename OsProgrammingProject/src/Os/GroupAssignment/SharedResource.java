package Os.GroupAssignment;

public class SharedResource {
    int id;
    int data;

    public void addRecord(){
        id = (int)Math.floor(Math.random()*(20)+1);
        data = (int)Math.floor(Math.random()*100+1);
    }

    public void removeRecord(){
        id = (int)Math.floor(Math.random()*(20)+1);
        data = 0;
    }

    public void retrieveRecord(){
        id = (int)Math.floor(Math.random()*(20)+1);

    }

    public void calculateRecordDataTotal(){

    }
}

