
import java.util.ArrayList;
import java.util.List;

class Competition {

    private List<Participant> participants;
    private List<Participant> classifiedParticipants;

    private double qualifyingRecord;
    private int distance;

    public Competition(double qualifyingRecord, int distance) {
        this.qualifyingRecord = qualifyingRecord;
        this.distance = distance;
        this.participants = new ArrayList<>();
        this.classifiedParticipants = new ArrayList<>();
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public double getQualifyingRecord() {
        return qualifyingRecord;
    }

    public void setQualifyingRecord(double qualifyingRecord) {
        this.qualifyingRecord = qualifyingRecord;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }  

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public void classification() {
        for (Participant participant : participants) {
            double record = Math.random()*(20) + (qualifyingRecord - 10);

            if (record <= qualifyingRecord) {
                classifiedParticipants.add(participant);
            }
            
        }
    }

    


}
