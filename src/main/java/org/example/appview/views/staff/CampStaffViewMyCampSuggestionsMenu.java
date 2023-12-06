package org.example.appview.views.staff;

import org.example.appview.interfaces.IAppView;
/**
 * The {@code CampStaffViewMyCampSuggestionsMenu} class represents a view for displaying menu options
 * related to suggestions for a staff member managing a camp in the application.
 * It implements the {@code IAppView} interface to provide the display functionality.
 * This class is part of the {@code org.example.appview.views.staff} package.
 *
 * @author Group1
 * @version 1.0
 */
public class CampStaffViewMyCampSuggestionsMenu implements IAppView {
	/**
     * Displays menu options related to suggestions for a staff member managing a camp with navigation choices.
     */
    @Override
    public void display() {
        System.out.println("Select an option to navigate: ");
        System.out.println("1. Accept suggestion");
        System.out.println("2. Reject suggestion");
        System.out.println("3. Back");
    }
}
