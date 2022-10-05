package com.thread;
import com.counselling.CounselSlot;
public class CreatingThread {

    public void generateThread(String userId, String[] usersList, int usersCount) throws Exception
    {
        int i, a;
        Thread thread;

        Runnable runnable = new CounselSlot(userId, usersList);
        thread = new Thread(runnable);
        thread.setName(userId);

        int userCount = usersList.length;
        for (i = 0; i < userCount; i ++)
        {
            a = i + 1;
            int priority = Math.abs((userCount - (10 + a)) % 10);
            if (priority == 0 && (userId.equals(usersList[i])))
                thread.setPriority(10);
            else if (userId.equals(usersList[i]))
                thread.setPriority(priority);
        }
        System.out.println("Thread priority = " + thread.getPriority());
        thread.setDaemon(true);
        thread.start();
        System.out.println(thread.getName());

        long slotTotalTime = (30000L * usersCount) + 60000;
        Thread.sleep(slotTotalTime);
        System.out.println(slotTotalTime);
        System.out.println("The given time for slot1 is completed");
        System.out.println("Exiting the main Thread");
        System.exit(0);
    }
}
