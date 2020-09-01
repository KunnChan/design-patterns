package min.kunnchan.command;
/*
 * Created by kunnchan on 01/09/2020
 * package :  min.kunnchan.command
 */

import min.kunnchan.command.fx.Command;

public class AddCustomerCommand implements Command {

    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
