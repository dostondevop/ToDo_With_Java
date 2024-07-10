package service;

import model.Notification;
import model.User;

public class NotificationService {


    public void addNotification(Notification string, User user) {
        if (user.notifications == null) {
            user.notifications = new Notification[10];
            user.notifications[0] = string;
            user.notifyNumber ++;
            return;
        }else {
            for (int i = 0; i < user.notifications.length; i++) {
                if (user.notifications[i] == null) {
                    user.notifications[i] = string;
                    user.notifyNumber ++;
                    return;
                }
            }

        }
    }
}
