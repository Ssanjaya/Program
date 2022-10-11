package com.counselling;
import com.database.SelectQueries;
import com.thread.CreatingThread;
import com.validation.Validations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class VerifyToCounsel {

    private final Date SLOT1DATE = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("20-07-2022 10:00:00");
    private final Date SLOT2DATE = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("21-07-2022 14:00:00");
    private final Date SLOT3DATE = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("20-07-2022 15:00:00");
    private final Date SLOT4DATE = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("21-07-2022 18:00:00");

    public VerifyToCounsel() throws ParseException
    {
    }

    public void generateSlot(String userId) throws Exception
    {
        String[] usersList;
        int usersCount;
        CreatingThread creatingThread = new CreatingThread();
        float cutOff;
        Date currentDate = new Date();

        cutOff = SelectQueries.selectCutOff(userId);
        if (cutOff == 0.0)
        {
            System.out.println("Sorry You didn't applied for Counselling :(");
            return;
        }

        if ((cutOff <= 200 && cutOff > 170) && (currentDate.after(SLOT1DATE)))
        {
            usersCount = SelectQueries.slot1useridCount();
            usersList = SelectQueries.slot1userid();
            creatingThread.generateThread(userId, usersList, usersCount);
        }

        else if ((cutOff <= 170 && cutOff > 140) && (currentDate.after(SLOT2DATE)))
        {
            usersCount = SelectQueries.slot2useridCount();
            usersList = SelectQueries.slot2userid();
            creatingThread.generateThread(userId, usersList, usersCount);
        }

        else if ((cutOff <= 140 && cutOff > 110) && (currentDate.after(SLOT3DATE)))
        {
            usersCount = SelectQueries.slot3useridCount();
            usersList = SelectQueries.slot3userid();
            creatingThread.generateThread(userId, usersList, usersCount);
        }

        else if ((cutOff <= 110 && cutOff > 70) && (currentDate.after(SLOT4DATE)))
        {
            usersCount = SelectQueries.slot4useridCount();
            usersList = SelectQueries.slot4userid();
            creatingThread.generateThread(userId, usersList, usersCount);
        }
        else
            System.out.println(Validations.displayInfo(cutOff));
    }

    public Date getSLOT1DATE()
    {
        return SLOT1DATE;
    }

}
