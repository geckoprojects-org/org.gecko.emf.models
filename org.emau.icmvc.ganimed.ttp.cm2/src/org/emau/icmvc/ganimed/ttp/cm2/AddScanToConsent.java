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
 * A representation of the model object '<em><b>Add Scan To Consent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getConsentKey <em>Consent Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getScanBase64 <em>Scan Base64</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddScanToConsent()
 * @model extendedMetaData="name='addScanToConsent' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AddScanToConsent extends EObject {
	/**
	 * Returns the value of the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Key</em>' containment reference.
	 * @see #setConsentKey(ConsentKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddScanToConsent_ConsentKey()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='consentKey'"
	 * @generated
	 */
	ConsentKeyDTO getConsentKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getConsentKey <em>Consent Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Key</em>' containment reference.
	 * @see #getConsentKey()
	 * @generated
	 */
	void setConsentKey(ConsentKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Scan Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scan Base64</em>' attribute.
	 * @see #setScanBase64(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddScanToConsent_ScanBase64()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='scanBase64'"
	 * @generated
	 */
	String getScanBase64();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getScanBase64 <em>Scan Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Base64</em>' attribute.
	 * @see #getScanBase64()
	 * @generated
	 */
	void setScanBase64(String value);

	/**
	 * Returns the value of the '<em><b>File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Type</em>' attribute.
	 * @see #setFileType(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddScanToConsent_FileType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='fileType'"
	 * @generated
	 */
	String getFileType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getFileType <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Type</em>' attribute.
	 * @see #getFileType()
	 * @generated
	 */
	void setFileType(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddScanToConsent_FileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='fileName'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // AddScanToConsent
