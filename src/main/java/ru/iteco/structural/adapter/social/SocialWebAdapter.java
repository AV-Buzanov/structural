package ru.iteco.structural.adapter.social;

/**
 * SocialWebAdapter.
 *
 * @author Ilya_Sukhachev
 */
public class SocialWebAdapter implements SocialWeb {

    private Context context;

    @Override
    public void getFriends(int userId) {
        if (context instanceof Vk) {
            Vk vk = (Vk) context;
            vk.getFriends(userId);
        }

        if (context instanceof Fb) {
            Fb fb = (Fb) context;
            fb.getContacts(userId, null);
        }

    }

    @Override
    public boolean postMessage(String message, int userId) {
        if (context instanceof Vk) {
            Vk vk = (Vk) context;
            vk.post(message, userId, true);
        }

        if (context instanceof Fb) {
            Fb fb = (Fb) context;
            fb.postMessage(message, userId);
        }

        return true;
    }
}
