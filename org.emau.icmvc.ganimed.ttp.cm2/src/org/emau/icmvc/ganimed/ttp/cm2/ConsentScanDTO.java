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

import javax.xml.datatype.XMLGregorianCalendar;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Scan DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getBase64 <em>Base64</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getConsentKey <em>Consent Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getUploadDate <em>Upload Date</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentScanDTO()
 * @model extendedMetaData="name='consentScanDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConsentScanDTO extends FhirIdDTO {
	/**
	 * Returns the value of the '<em><b>Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base64</em>' attribute.
	 * @see #setBase64(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentScanDTO_Base64()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='base64'"
	 * @generated
	 */
	String getBase64();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getBase64 <em>Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base64</em>' attribute.
	 * @see #getBase64()
	 * @generated
	 */
	void setBase64(String value);

	/**
	 * Returns the value of the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Key</em>' containment reference.
	 * @see #setConsentKey(ConsentKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentScanDTO_ConsentKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consentKey'"
	 * @generated
	 */
	ConsentKeyDTO getConsentKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getConsentKey <em>Consent Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Key</em>' containment reference.
	 * @see #getConsentKey()
	 * @generated
	 */
	void setConsentKey(ConsentKeyDTO value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentScanDTO_FileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='fileName'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Type</em>' attribute.
	 * @see #setFileType(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentScanDTO_FileType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='fileType'"
	 * @generated
	 */
	String getFileType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getFileType <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Type</em>' attribute.
	 * @see #getFileType()
	 * @generated
	 */
	void setFileType(String value);

	/**
	 * Returns the value of the '<em><b>Upload Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upload Date</em>' attribute.
	 * @see #setUploadDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentScanDTO_UploadDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='uploadDate'"
	 * @generated
	 */
	XMLGregorianCalendar getUploadDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getUploadDate <em>Upload Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upload Date</em>' attribute.
	 * @see #getUploadDate()
	 * @generated
	 */
	void setUploadDate(XMLGregorianCalendar value);

} // ConsentScanDTO
