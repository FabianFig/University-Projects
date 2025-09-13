import java.util.ArrayList;

public class DisasterResponseCoordinator {
    private ArrayList<EmergencySupport> responders;

    public DisasterResponseCoordinator() {
        responders = new  ArrayList<>();
    }
    public void registerResponder(EmergencySupport responder){
        responders.add(responder);
    }

    public void deployAll() {
        System.out.print("Deploying all emergency units:\n");
        for (EmergencySupport responder : responders) {
            responder.deployAid();
        }
    }

    public void printAllReadinessReports() {
        System.out.println("Emergency Readiness Reports:");
        for (EmergencySupport responder : responders) {
            System.out.println(responder.getEmergencyReadinessReport());
        }
    }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("DisasterResponseCoordinator [responders=\n");
            for (EmergencySupport responder : responders) {
                result.append(responder.toString()).append("\n");
            }
            //result.append("]");
            return result.toString();
        }

}
