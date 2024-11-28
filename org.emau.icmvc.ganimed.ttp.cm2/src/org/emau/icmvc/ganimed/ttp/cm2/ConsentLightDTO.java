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
 * A representation of the model object '<em><b>Consent Light DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getConsentDates <em>Consent Dates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getExpirationProperties <em>Expiration Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#isHasPatientSignature <em>Has Patient Signature</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getKey <em>Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getModuleStates <em>Module States</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#isPatientSignatureIsFromGuardian <em>Patient Signature Is From Guardian</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPatientSigningDate <em>Patient Signing Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPatientSigningPlace <em>Patient Signing Place</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPhysicianId <em>Physician Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPhysicianSigningDate <em>Physician Signing Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPhysicianSigningPlace <em>Physician Signing Place</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getQualityControl <em>Quality Control</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getTemplateType <em>Template Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getValidFromProperties <em>Valid From Properties</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO()
 * @model extendedMetaData="name='consentLightDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConsentLightDTO extends FhirIdDTO {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Consent Dates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Dates</em>' containment reference.
	 * @see #setConsentDates(ConsentDateValuesDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_ConsentDates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consentDates'"
	 * @generated
	 */
	ConsentDateValuesDTO getConsentDates();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getConsentDates <em>Consent Dates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Dates</em>' containment reference.
	 * @see #getConsentDates()
	 * @generated
	 */
	void setConsentDates(ConsentDateValuesDTO value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_CreationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='creationDate'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Expiration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Properties</em>' containment reference.
	 * @see #setExpirationProperties(ExpirationPropertiesDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_ExpirationProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationProperties'"
	 * @generated
	 */
	ExpirationPropertiesDTO getExpirationProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getExpirationProperties <em>Expiration Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Properties</em>' containment reference.
	 * @see #getExpirationProperties()
	 * @generated
	 */
	void setExpirationProperties(ExpirationPropertiesDTO value);

	/**
	 * Returns the value of the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extern Properties</em>' attribute.
	 * @see #setExternProperties(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_ExternProperties()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='externProperties'"
	 * @generated
	 */
	String getExternProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getExternProperties <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extern Properties</em>' attribute.
	 * @see #getExternProperties()
	 * @generated
	 */
	void setExternProperties(String value);

	/**
	 * Returns the value of the '<em><b>Has Patient Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Patient Signature</em>' attribute.
	 * @see #isSetHasPatientSignature()
	 * @see #unsetHasPatientSignature()
	 * @see #setHasPatientSignature(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_HasPatientSignature()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='hasPatientSignature'"
	 * @generated
	 */
	boolean isHasPatientSignature();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#isHasPatientSignature <em>Has Patient Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Patient Signature</em>' attribute.
	 * @see #isSetHasPatientSignature()
	 * @see #unsetHasPatientSignature()
	 * @see #isHasPatientSignature()
	 * @generated
	 */
	void setHasPatientSignature(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#isHasPatientSignature <em>Has Patient Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasPatientSignature()
	 * @see #isHasPatientSignature()
	 * @see #setHasPatientSignature(boolean)
	 * @generated
	 */
	void unsetHasPatientSignature();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#isHasPatientSignature <em>Has Patient Signature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Patient Signature</em>' attribute is set.
	 * @see #unsetHasPatientSignature()
	 * @see #isHasPatientSignature()
	 * @see #setHasPatientSignature(boolean)
	 * @generated
	 */
	boolean isSetHasPatientSignature();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(ConsentKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_Key()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='key'"
	 * @generated
	 */
	ConsentKeyDTO getKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(ConsentKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Module States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module States</em>' containment reference.
	 * @see #setModuleStates(ModuleStatesType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_ModuleStates()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='moduleStates'"
	 * @generated
	 */
	ModuleStatesType getModuleStates();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getModuleStates <em>Module States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module States</em>' containment reference.
	 * @see #getModuleStates()
	 * @generated
	 */
	void setModuleStates(ModuleStatesType value);

	/**
	 * Returns the value of the '<em><b>Patient Signature Is From Guardian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Signature Is From Guardian</em>' attribute.
	 * @see #isSetPatientSignatureIsFromGuardian()
	 * @see #unsetPatientSignatureIsFromGuardian()
	 * @see #setPatientSignatureIsFromGuardian(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_PatientSignatureIsFromGuardian()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='patientSignatureIsFromGuardian'"
	 * @generated
	 */
	boolean isPatientSignatureIsFromGuardian();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#isPatientSignatureIsFromGuardian <em>Patient Signature Is From Guardian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Signature Is From Guardian</em>' attribute.
	 * @see #isSetPatientSignatureIsFromGuardian()
	 * @see #unsetPatientSignatureIsFromGuardian()
	 * @see #isPatientSignatureIsFromGuardian()
	 * @generated
	 */
	void setPatientSignatureIsFromGuardian(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#isPatientSignatureIsFromGuardian <em>Patient Signature Is From Guardian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPatientSignatureIsFromGuardian()
	 * @see #isPatientSignatureIsFromGuardian()
	 * @see #setPatientSignatureIsFromGuardian(boolean)
	 * @generated
	 */
	void unsetPatientSignatureIsFromGuardian();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#isPatientSignatureIsFromGuardian <em>Patient Signature Is From Guardian</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Patient Signature Is From Guardian</em>' attribute is set.
	 * @see #unsetPatientSignatureIsFromGuardian()
	 * @see #isPatientSignatureIsFromGuardian()
	 * @see #setPatientSignatureIsFromGuardian(boolean)
	 * @generated
	 */
	boolean isSetPatientSignatureIsFromGuardian();

	/**
	 * Returns the value of the '<em><b>Patient Signing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Signing Date</em>' attribute.
	 * @see #setPatientSigningDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_PatientSigningDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='patientSigningDate'"
	 * @generated
	 */
	XMLGregorianCalendar getPatientSigningDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPatientSigningDate <em>Patient Signing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Signing Date</em>' attribute.
	 * @see #getPatientSigningDate()
	 * @generated
	 */
	void setPatientSigningDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Patient Signing Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Signing Place</em>' attribute.
	 * @see #setPatientSigningPlace(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_PatientSigningPlace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='patientSigningPlace'"
	 * @generated
	 */
	String getPatientSigningPlace();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPatientSigningPlace <em>Patient Signing Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Signing Place</em>' attribute.
	 * @see #getPatientSigningPlace()
	 * @generated
	 */
	void setPatientSigningPlace(String value);

	/**
	 * Returns the value of the '<em><b>Physician Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physician Id</em>' attribute.
	 * @see #setPhysicianId(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_PhysicianId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='physicianId'"
	 * @generated
	 */
	String getPhysicianId();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPhysicianId <em>Physician Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physician Id</em>' attribute.
	 * @see #getPhysicianId()
	 * @generated
	 */
	void setPhysicianId(String value);

	/**
	 * Returns the value of the '<em><b>Physician Signing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physician Signing Date</em>' attribute.
	 * @see #setPhysicianSigningDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_PhysicianSigningDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='physicianSigningDate'"
	 * @generated
	 */
	XMLGregorianCalendar getPhysicianSigningDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPhysicianSigningDate <em>Physician Signing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physician Signing Date</em>' attribute.
	 * @see #getPhysicianSigningDate()
	 * @generated
	 */
	void setPhysicianSigningDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Physician Signing Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physician Signing Place</em>' attribute.
	 * @see #setPhysicianSigningPlace(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_PhysicianSigningPlace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='physicianSigningPlace'"
	 * @generated
	 */
	String getPhysicianSigningPlace();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPhysicianSigningPlace <em>Physician Signing Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physician Signing Place</em>' attribute.
	 * @see #getPhysicianSigningPlace()
	 * @generated
	 */
	void setPhysicianSigningPlace(String value);

	/**
	 * Returns the value of the '<em><b>Quality Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Control</em>' containment reference.
	 * @see #setQualityControl(Qcdto)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_QualityControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualityControl'"
	 * @generated
	 */
	Qcdto getQualityControl();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getQualityControl <em>Quality Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Control</em>' containment reference.
	 * @see #getQualityControl()
	 * @generated
	 */
	void setQualityControl(Qcdto value);

	/**
	 * Returns the value of the '<em><b>Template Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Type</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType
	 * @see #isSetTemplateType()
	 * @see #unsetTemplateType()
	 * @see #setTemplateType(ConsentTemplateType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_TemplateType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='templateType'"
	 * @generated
	 */
	ConsentTemplateType getTemplateType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getTemplateType <em>Template Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Type</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType
	 * @see #isSetTemplateType()
	 * @see #unsetTemplateType()
	 * @see #getTemplateType()
	 * @generated
	 */
	void setTemplateType(ConsentTemplateType value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getTemplateType <em>Template Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTemplateType()
	 * @see #getTemplateType()
	 * @see #setTemplateType(ConsentTemplateType)
	 * @generated
	 */
	void unsetTemplateType();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getTemplateType <em>Template Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Template Type</em>' attribute is set.
	 * @see #unsetTemplateType()
	 * @see #getTemplateType()
	 * @see #setTemplateType(ConsentTemplateType)
	 * @generated
	 */
	boolean isSetTemplateType();

	/**
	 * Returns the value of the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Date</em>' attribute.
	 * @see #setUpdateDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_UpdateDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='updateDate'"
	 * @generated
	 */
	XMLGregorianCalendar getUpdateDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getUpdateDate <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Date</em>' attribute.
	 * @see #getUpdateDate()
	 * @generated
	 */
	void setUpdateDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From Date</em>' attribute.
	 * @see #setValidFromDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_ValidFromDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='validFromDate'"
	 * @generated
	 */
	XMLGregorianCalendar getValidFromDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getValidFromDate <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From Date</em>' attribute.
	 * @see #getValidFromDate()
	 * @generated
	 */
	void setValidFromDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Valid From Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From Properties</em>' containment reference.
	 * @see #setValidFromProperties(ValidFromPropertiesDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentLightDTO_ValidFromProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validFromProperties'"
	 * @generated
	 */
	ValidFromPropertiesDTO getValidFromProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getValidFromProperties <em>Valid From Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From Properties</em>' containment reference.
	 * @see #getValidFromProperties()
	 * @generated
	 */
	void setValidFromProperties(ValidFromPropertiesDTO value);

} // ConsentLightDTO
