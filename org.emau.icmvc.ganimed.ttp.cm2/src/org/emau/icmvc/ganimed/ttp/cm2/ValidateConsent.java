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
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validate Consent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#getConsent <em>Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#isAllowRevoke <em>Allow Revoke</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#isValidateScan <em>Validate Scan</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getValidateConsent()
 * @model extendedMetaData="name='validateConsent' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ValidateConsent extends EObject {
	/**
	 * Returns the value of the '<em><b>Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent</em>' containment reference.
	 * @see #setConsent(ConsentDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getValidateConsent_Consent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='consent'"
	 * @generated
	 */
	ConsentDTO getConsent();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#getConsent <em>Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent</em>' containment reference.
	 * @see #getConsent()
	 * @generated
	 */
	void setConsent(ConsentDTO value);

	/**
	 * Returns the value of the '<em><b>Allow Revoke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Revoke</em>' attribute.
	 * @see #isSetAllowRevoke()
	 * @see #unsetAllowRevoke()
	 * @see #setAllowRevoke(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getValidateConsent_AllowRevoke()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='allowRevoke'"
	 * @generated
	 */
	boolean isAllowRevoke();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#isAllowRevoke <em>Allow Revoke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Revoke</em>' attribute.
	 * @see #isSetAllowRevoke()
	 * @see #unsetAllowRevoke()
	 * @see #isAllowRevoke()
	 * @generated
	 */
	void setAllowRevoke(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#isAllowRevoke <em>Allow Revoke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowRevoke()
	 * @see #isAllowRevoke()
	 * @see #setAllowRevoke(boolean)
	 * @generated
	 */
	void unsetAllowRevoke();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#isAllowRevoke <em>Allow Revoke</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Revoke</em>' attribute is set.
	 * @see #unsetAllowRevoke()
	 * @see #isAllowRevoke()
	 * @see #setAllowRevoke(boolean)
	 * @generated
	 */
	boolean isSetAllowRevoke();

	/**
	 * Returns the value of the '<em><b>Validate Scan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Scan</em>' attribute.
	 * @see #isSetValidateScan()
	 * @see #unsetValidateScan()
	 * @see #setValidateScan(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getValidateConsent_ValidateScan()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='validateScan'"
	 * @generated
	 */
	boolean isValidateScan();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#isValidateScan <em>Validate Scan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Scan</em>' attribute.
	 * @see #isSetValidateScan()
	 * @see #unsetValidateScan()
	 * @see #isValidateScan()
	 * @generated
	 */
	void setValidateScan(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#isValidateScan <em>Validate Scan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidateScan()
	 * @see #isValidateScan()
	 * @see #setValidateScan(boolean)
	 * @generated
	 */
	void unsetValidateScan();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#isValidateScan <em>Validate Scan</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validate Scan</em>' attribute is set.
	 * @see #unsetValidateScan()
	 * @see #isValidateScan()
	 * @see #setValidateScan(boolean)
	 * @generated
	 */
	boolean isSetValidateScan();

} // ValidateConsent
