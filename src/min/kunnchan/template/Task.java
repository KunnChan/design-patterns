package min.kunnchan.template;
/*
 * Created by kunnchan on 01/09/2020
 * package :  min.kunnchan.template
 */

public abstract class Task {

    private AuditTrial auditTrial;
    public Task(){
        auditTrial = new AuditTrial();
    }
    public Task(AuditTrial auditTrial) {
        this.auditTrial = auditTrial;
    }
    public void execute(){
        auditTrial.record();

        doExecute();
    }
    protected abstract void doExecute();
}
