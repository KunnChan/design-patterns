package min.kunnchan.template;
/*
 * Created by kunnchan on 01/09/2020
 * package :  min.kunnchan.template
 */

public class TransferMoneyTask extends Task{

    public TransferMoneyTask(AuditTrial auditTrial) {
        super(auditTrial);
    }

    public TransferMoneyTask() { }

    @Override
    protected void doExecute() {
        System.out.println("Transfer Money Task");
    }
}
