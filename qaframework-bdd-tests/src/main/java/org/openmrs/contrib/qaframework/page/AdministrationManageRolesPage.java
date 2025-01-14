/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 * 
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.contrib.qaframework.page;

import org.openmrs.contrib.qaframework.helper.Page;
import org.openqa.selenium.By;

public class AdministrationManageRolesPage extends Page {

	private static final String PAGE_URL = "/openmrs/admin/users/role.list";
	private static final By ADD_NEW_ROLE_LINK= By.cssSelector("#content > a");
	private static final By DELETE_SELECTED_ROLES_BUTTON = By.cssSelector("#content form input[type=submit]");
	private static final By CHECKBOX = By.cssSelector("#content form table tbody input[type=checkbox");

	public AdministrationManageRolesPage(Page parent) {
		super(parent);
	}
	
	public AddNewRolePage goToAddNewRolePage() {
		clickOn(ADD_NEW_ROLE_LINK);
		return new AddNewRolePage(this);
	}
	
	public void goToEditRolePage(String roleName) {
	    if (roleName == null || roleName.isEmpty()) {
	        throw new IllegalArgumentException("roleName must be provided");
	    }
	    clickOn(By.linkText(roleName));
	}
	
	public void deleteSelectedRoles() {
		clickOn(DELETE_SELECTED_ROLES_BUTTON);
	}
	
	public void selectRole() {
		clickOn(CHECKBOX);
	}

	@Override
	public String getPageUrl() {
		return PAGE_URL;
	}
}
