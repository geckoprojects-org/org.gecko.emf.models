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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getFreeTextVals <em>Free Text Vals</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getPatientSignatureBase64 <em>Patient Signature Base64</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getPhysicianSignatureBase64 <em>Physician Signature Base64</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getScans <em>Scans</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentDTO()
 * @model extendedMetaData="name='consentDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConsentDTO extends ConsentLightDTO {
	/**
	 * Returns the value of the '<em><b>Free Text Vals</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Text Vals</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentDTO_FreeTextVals()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='freeTextVals'"
	 * @generated
	 */
	EList<FreeTextValDTO> getFreeTextVals();

	/**
	 * Returns the value of the '<em><b>Patient Signature Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Signature Base64</em>' attribute.
	 * @see #setPatientSignatureBase64(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentDTO_PatientSignatureBase64()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='patientSignatureBase64'"
	 * @generated
	 */
	String getPatientSignatureBase64();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getPatientSignatureBase64 <em>Patient Signature Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Signature Base64</em>' attribute.
	 * @see #getPatientSignatureBase64()
	 * @generated
	 */
	void setPatientSignatureBase64(String value);

	/**
	 * Returns the value of the '<em><b>Physician Signature Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physician Signature Base64</em>' attribute.
	 * @see #setPhysicianSignatureBase64(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentDTO_PhysicianSignatureBase64()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='physicianSignatureBase64'"
	 * @generated
	 */
	String getPhysicianSignatureBase64();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getPhysicianSignatureBase64 <em>Physician Signature Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physician Signature Base64</em>' attribute.
	 * @see #getPhysicianSignatureBase64()
	 * @generated
	 */
	void setPhysicianSignatureBase64(String value);

	/**
	 * Returns the value of the '<em><b>Scans</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scans</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentDTO_Scans()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scans'"
	 * @generated
	 */
	EList<ConsentScanDTO> getScans();

} // ConsentDTO
