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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scans Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig#getSizeLimit <em>Size Limit</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getScansConfig()
 * @model extendedMetaData="name='ScansConfig' kind='empty'"
 * @generated
 */
@ProviderType
public interface ScansConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #isSetMandatory()
	 * @see #unsetMandatory()
	 * @see #setMandatory(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getScansConfig_Mandatory()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='mandatory'"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isSetMandatory()
	 * @see #unsetMandatory()
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMandatory()
	 * @see #isMandatory()
	 * @see #setMandatory(boolean)
	 * @generated
	 */
	void unsetMandatory();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig#isMandatory <em>Mandatory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mandatory</em>' attribute is set.
	 * @see #unsetMandatory()
	 * @see #isMandatory()
	 * @see #setMandatory(boolean)
	 * @generated
	 */
	boolean isSetMandatory();

	/**
	 * Returns the value of the '<em><b>Size Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Limit</em>' attribute.
	 * @see #isSetSizeLimit()
	 * @see #unsetSizeLimit()
	 * @see #setSizeLimit(int)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getScansConfig_SizeLimit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='size-limit'"
	 * @generated
	 */
	int getSizeLimit();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig#getSizeLimit <em>Size Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Limit</em>' attribute.
	 * @see #isSetSizeLimit()
	 * @see #unsetSizeLimit()
	 * @see #getSizeLimit()
	 * @generated
	 */
	void setSizeLimit(int value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig#getSizeLimit <em>Size Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeLimit()
	 * @see #getSizeLimit()
	 * @see #setSizeLimit(int)
	 * @generated
	 */
	void unsetSizeLimit();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig#getSizeLimit <em>Size Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size Limit</em>' attribute is set.
	 * @see #unsetSizeLimit()
	 * @see #getSizeLimit()
	 * @see #setSizeLimit(int)
	 * @generated
	 */
	boolean isSetSizeLimit();

} // ScansConfig
