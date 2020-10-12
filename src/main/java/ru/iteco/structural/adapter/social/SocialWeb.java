package ru.iteco.structural.adapter.social;

/**
 * SocialWeb.
 *
 * @author Ilya_Sukhachev
 */
public interface SocialWeb {

    void getFriends(int userId);

    boolean postMessage(String message, int userId);

}
