/**
 * Copyright (C) 2014 OpenTravel Alliance (info@opentravel.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opentravel.modelcheck;

import org.opentravel.application.common.AbstractOTMApplication;
import org.opentravel.application.common.AbstractUserSettings;
import org.opentravel.schemacompiler.util.OTM16Upgrade;

/**
 * JavaFX application for the Model Check Utility.
 */
public class ModelCheckApplication extends AbstractOTMApplication {
	
	/**
	 * Main method invoked from the command-line.
	 * 
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * @see org.opentravel.application.common.AbstractOTMApplication#getMainWindowFxmlLocation()
	 */
	@Override
	protected String getMainWindowFxmlLocation() {
		return ModelCheckController.FXML_FILE;
	}

	/**
	 * @see org.opentravel.application.common.AbstractOTMApplication#getUserSettings()
	 */
	@Override
	protected AbstractUserSettings getUserSettings() {
		return UserSettings.load();
	}

	/**
	 * @see org.opentravel.application.common.AbstractOTMApplication#getMainWindowTitle()
	 */
	@Override
	protected String getMainWindowTitle() {
		return "OTM Model Check Utility";
	}

	/**
	 * Since this is a read-only application, enable the OTM 1.6 file format for
	 * all operations.
	 */
	static {
		OTM16Upgrade.otm16Enabled = true;
	}
	
}
