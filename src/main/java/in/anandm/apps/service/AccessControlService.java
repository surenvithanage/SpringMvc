package in.anandm.apps.service;

/**
 * Project apps
 * User : suren_v
 * Date : 7/2/2020
 * Time : 11:37 AM
 */

public interface AccessControlService {

    boolean checkAccess(String method, String userRole);

}
