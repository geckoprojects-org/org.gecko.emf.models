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
package org.emau.icmvc.ganimed.ttp.cm2.config;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#getTemplateTypes <em>Template Types</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#getChromedriverPath <em>Chromedriver Path</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#isEnableChromePdfExport <em>Enable Chrome Pdf Export</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getApplicationConfig()
 * @model extendedMetaData="name='ApplicationConfig' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ApplicationConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Types</b></em>' attribute list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType}.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Types</em>' attribute list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getApplicationConfig_TemplateTypes()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='template-types'"
	 * @generated
	 */
	EList<ConsentTemplateType> getTemplateTypes();

	/**
	 * Returns the value of the '<em><b>Chromedriver Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chromedriver Path</em>' attribute.
	 * @see #setChromedriverPath(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getApplicationConfig_ChromedriverPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='chromedriver-path'"
	 * @generated
	 */
	String getChromedriverPath();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#getChromedriverPath <em>Chromedriver Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chromedriver Path</em>' attribute.
	 * @see #getChromedriverPath()
	 * @generated
	 */
	void setChromedriverPath(String value);

	/**
	 * Returns the value of the '<em><b>Enable Chrome Pdf Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Chrome Pdf Export</em>' attribute.
	 * @see #isSetEnableChromePdfExport()
	 * @see #unsetEnableChromePdfExport()
	 * @see #setEnableChromePdfExport(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getApplicationConfig_EnableChromePdfExport()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='enable-chrome-pdf-export'"
	 * @generated
	 */
	boolean isEnableChromePdfExport();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#isEnableChromePdfExport <em>Enable Chrome Pdf Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Chrome Pdf Export</em>' attribute.
	 * @see #isSetEnableChromePdfExport()
	 * @see #unsetEnableChromePdfExport()
	 * @see #isEnableChromePdfExport()
	 * @generated
	 */
	void setEnableChromePdfExport(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#isEnableChromePdfExport <em>Enable Chrome Pdf Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnableChromePdfExport()
	 * @see #isEnableChromePdfExport()
	 * @see #setEnableChromePdfExport(boolean)
	 * @generated
	 */
	void unsetEnableChromePdfExport();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#isEnableChromePdfExport <em>Enable Chrome Pdf Export</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enable Chrome Pdf Export</em>' attribute is set.
	 * @see #unsetEnableChromePdfExport()
	 * @see #isEnableChromePdfExport()
	 * @see #setEnableChromePdfExport(boolean)
	 * @generated
	 */
	boolean isSetEnableChromePdfExport();

} // ApplicationConfig
