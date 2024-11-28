/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.emau.icmvc.ganimed.ttp.cm2.config.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType;

import org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.ApplicationConfigImpl#getTemplateTypes <em>Template Types</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.ApplicationConfigImpl#getChromedriverPath <em>Chromedriver Path</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.ApplicationConfigImpl#isEnableChromePdfExport <em>Enable Chrome Pdf Export</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationConfigImpl extends MinimalEObjectImpl.Container implements ApplicationConfig {
	/**
	 * The cached value of the '{@link #getTemplateTypes() <em>Template Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentTemplateType> templateTypes;

	/**
	 * The default value of the '{@link #getChromedriverPath() <em>Chromedriver Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChromedriverPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CHROMEDRIVER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChromedriverPath() <em>Chromedriver Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChromedriverPath()
	 * @generated
	 * @ordered
	 */
	protected String chromedriverPath = CHROMEDRIVER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableChromePdfExport() <em>Enable Chrome Pdf Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableChromePdfExport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_CHROME_PDF_EXPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableChromePdfExport() <em>Enable Chrome Pdf Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableChromePdfExport()
	 * @generated
	 * @ordered
	 */
	protected boolean enableChromePdfExport = ENABLE_CHROME_PDF_EXPORT_EDEFAULT;

	/**
	 * This is true if the Enable Chrome Pdf Export attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableChromePdfExportESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.APPLICATION_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentTemplateType> getTemplateTypes() {
		if (templateTypes == null) {
			templateTypes = new EDataTypeEList<ConsentTemplateType>(ConsentTemplateType.class, this, ConfigPackage.APPLICATION_CONFIG__TEMPLATE_TYPES);
		}
		return templateTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChromedriverPath() {
		return chromedriverPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChromedriverPath(String newChromedriverPath) {
		String oldChromedriverPath = chromedriverPath;
		chromedriverPath = newChromedriverPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.APPLICATION_CONFIG__CHROMEDRIVER_PATH, oldChromedriverPath, chromedriverPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableChromePdfExport() {
		return enableChromePdfExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableChromePdfExport(boolean newEnableChromePdfExport) {
		boolean oldEnableChromePdfExport = enableChromePdfExport;
		enableChromePdfExport = newEnableChromePdfExport;
		boolean oldEnableChromePdfExportESet = enableChromePdfExportESet;
		enableChromePdfExportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.APPLICATION_CONFIG__ENABLE_CHROME_PDF_EXPORT, oldEnableChromePdfExport, enableChromePdfExport, !oldEnableChromePdfExportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEnableChromePdfExport() {
		boolean oldEnableChromePdfExport = enableChromePdfExport;
		boolean oldEnableChromePdfExportESet = enableChromePdfExportESet;
		enableChromePdfExport = ENABLE_CHROME_PDF_EXPORT_EDEFAULT;
		enableChromePdfExportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.APPLICATION_CONFIG__ENABLE_CHROME_PDF_EXPORT, oldEnableChromePdfExport, ENABLE_CHROME_PDF_EXPORT_EDEFAULT, oldEnableChromePdfExportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEnableChromePdfExport() {
		return enableChromePdfExportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.APPLICATION_CONFIG__TEMPLATE_TYPES:
				return getTemplateTypes();
			case ConfigPackage.APPLICATION_CONFIG__CHROMEDRIVER_PATH:
				return getChromedriverPath();
			case ConfigPackage.APPLICATION_CONFIG__ENABLE_CHROME_PDF_EXPORT:
				return isEnableChromePdfExport();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.APPLICATION_CONFIG__TEMPLATE_TYPES:
				getTemplateTypes().clear();
				getTemplateTypes().addAll((Collection<? extends ConsentTemplateType>)newValue);
				return;
			case ConfigPackage.APPLICATION_CONFIG__CHROMEDRIVER_PATH:
				setChromedriverPath((String)newValue);
				return;
			case ConfigPackage.APPLICATION_CONFIG__ENABLE_CHROME_PDF_EXPORT:
				setEnableChromePdfExport((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigPackage.APPLICATION_CONFIG__TEMPLATE_TYPES:
				getTemplateTypes().clear();
				return;
			case ConfigPackage.APPLICATION_CONFIG__CHROMEDRIVER_PATH:
				setChromedriverPath(CHROMEDRIVER_PATH_EDEFAULT);
				return;
			case ConfigPackage.APPLICATION_CONFIG__ENABLE_CHROME_PDF_EXPORT:
				unsetEnableChromePdfExport();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigPackage.APPLICATION_CONFIG__TEMPLATE_TYPES:
				return templateTypes != null && !templateTypes.isEmpty();
			case ConfigPackage.APPLICATION_CONFIG__CHROMEDRIVER_PATH:
				return CHROMEDRIVER_PATH_EDEFAULT == null ? chromedriverPath != null : !CHROMEDRIVER_PATH_EDEFAULT.equals(chromedriverPath);
			case ConfigPackage.APPLICATION_CONFIG__ENABLE_CHROME_PDF_EXPORT:
				return isSetEnableChromePdfExport();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (templateTypes: ");
		result.append(templateTypes);
		result.append(", chromedriverPath: ");
		result.append(chromedriverPath);
		result.append(", enableChromePdfExport: ");
		if (enableChromePdfExportESet) result.append(enableChromePdfExport); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ApplicationConfigImpl
