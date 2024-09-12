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
package de.dwd.cdc.forecast.pointforecast;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Format Cfg Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.FormatCfgType#getDefaultUndefSign <em>Default Undef Sign</em>}</li>
 * </ul>
 *
 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getFormatCfgType()
 * @model extendedMetaData="name='FormatCfg_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FormatCfgType extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Undef Sign</b></em>' attribute.
	 * The default value is <code>"-"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * this is the definition of the "classic" Character for an undefined value within the data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Undef Sign</em>' attribute.
	 * @see #isSetDefaultUndefSign()
	 * @see #unsetDefaultUndefSign()
	 * @see #setDefaultUndefSign(String)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getFormatCfgType_DefaultUndefSign()
	 * @model default="-" unsettable="true" dataType="de.dwd.cdc.forecast.pointforecast.UndefChar" required="true"
	 *        extendedMetaData="kind='element' name='DefaultUndefSign' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultUndefSign();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.FormatCfgType#getDefaultUndefSign <em>Default Undef Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Undef Sign</em>' attribute.
	 * @see #isSetDefaultUndefSign()
	 * @see #unsetDefaultUndefSign()
	 * @see #getDefaultUndefSign()
	 * @generated
	 */
	void setDefaultUndefSign(String value);

	/**
	 * Unsets the value of the '{@link de.dwd.cdc.forecast.pointforecast.FormatCfgType#getDefaultUndefSign <em>Default Undef Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultUndefSign()
	 * @see #getDefaultUndefSign()
	 * @see #setDefaultUndefSign(String)
	 * @generated
	 */
	void unsetDefaultUndefSign();

	/**
	 * Returns whether the value of the '{@link de.dwd.cdc.forecast.pointforecast.FormatCfgType#getDefaultUndefSign <em>Default Undef Sign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Undef Sign</em>' attribute is set.
	 * @see #unsetDefaultUndefSign()
	 * @see #getDefaultUndefSign()
	 * @see #setDefaultUndefSign(String)
	 * @generated
	 */
	boolean isSetDefaultUndefSign();

} // FormatCfgType
