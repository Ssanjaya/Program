package com.menu;
import com.applyForCounselling.ApplyForCounselling;
import com.applyForCounselling.EditStudentDetails;
import com.counselling.VerifyToCounsel;
import com.database.SelectQueries;
import com.database.DeleteQueries;
import com.validation.Validations;

import java.util.Date;
import java.util.Scanner;
public class Menu extends Validations
{

    public void menu(Scanner scanner, String userId) throws Exception
    {

        ApplyForCounselling applyForCounselling = new ApplyForCounselling();
        EditStudentDetails editStudentDetails = new EditStudentDetails();
        VerifyToCounsel verifyToCounsel = new VerifyToCounsel();
        final Date SLOT = verifyToCounsel.getSLOT1DATE();
        boolean isApplied;
        int option;
        float cutOff;
        Date currentDate = new Date();
        if(SelectQueries.isCounselled(userId))
        {
            System.out.println("Sorry!, Your Counsel process is already completed");
            return;
        }
        if(currentDate.after(SLOT))
        {
            verifyToCounsel.generateSlot(userId);

            return;
        }

        isApplied = SelectQueries.isApplied(userId);
        if (! isApplied)
            applyForCounselling.applyForCounselling(scanner, userId);

        while (true)
        {
            System.out.println("Choose your choice\n1.Edit Details\n2.Show details\n3.Check My Slot\n4.Cancel Application\n5.Home Page");
            option = scanner.nextInt();

            if (option == 5)
                break;
            switch (option)
            {
                case 1:
                    editStudentDetails.updateStudentDetails(scanner, userId);
                    break;

                case 2:
                    Validations.displayStudentDetails(userId);
                    break;

                case 3:
                    cutOff = SelectQueries.selectCutOff(userId);
                    System.out.println(Validations.displayInfo(cutOff));
                    break;

                case 4:
                    DeleteQueries.deleteStudentAcademicDetails(userId);
                    DeleteQueries.deleteStudentPersonalDetails(userId);

                    System.out.println("Successfully Cancelled your Application");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Option!!");
            }
        }
    }
}
