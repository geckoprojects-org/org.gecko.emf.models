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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Template DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getAssignedModules <em>Assigned Modules</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getExpirationProperties <em>Expiration Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#isFinalised <em>Finalised</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getFreeTextDefs <em>Free Text Defs</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getHeader <em>Header</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getKey <em>Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedConsentTemplates <em>Mapped Consent Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedObjectionTemplates <em>Mapped Objection Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedOptOutConsentTemplates <em>Mapped Opt Out Consent Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedRefusalTemplates <em>Mapped Refusal Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedRevocationTemplates <em>Mapped Revocation Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getScanBase64 <em>Scan Base64</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getScanFileType <em>Scan File Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getTitle <em>Title</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getType <em>Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getValidFromProperties <em>Valid From Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getVersionLabel <em>Version Label</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO()
 * @model extendedMetaData="name='consentTemplateDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConsentTemplateDTO extends FhirIdDTO {
	/**
	 * Returns the value of the '<em><b>Assigned Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Modules</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_AssignedModules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assignedModules'"
	 * @generated
	 */
	EList<AssignedModuleDTO> getAssignedModules();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_CreationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='creationDate'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getCreationDate <em>Creation Date</em>}' attribute.
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
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_ExpirationProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationProperties'"
	 * @generated
	 */
	ExpirationPropertiesDTO getExpirationProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getExpirationProperties <em>Expiration Properties</em>}' containment reference.
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
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_ExternProperties()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='externProperties'"
	 * @generated
	 */
	String getExternProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getExternProperties <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extern Properties</em>' attribute.
	 * @see #getExternProperties()
	 * @generated
	 */
	void setExternProperties(String value);

	/**
	 * Returns the value of the '<em><b>Finalised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalised</em>' attribute.
	 * @see #isSetFinalised()
	 * @see #unsetFinalised()
	 * @see #setFinalised(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_Finalised()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='finalised'"
	 * @generated
	 */
	boolean isFinalised();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#isFinalised <em>Finalised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalised</em>' attribute.
	 * @see #isSetFinalised()
	 * @see #unsetFinalised()
	 * @see #isFinalised()
	 * @generated
	 */
	void setFinalised(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#isFinalised <em>Finalised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinalised()
	 * @see #isFinalised()
	 * @see #setFinalised(boolean)
	 * @generated
	 */
	void unsetFinalised();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#isFinalised <em>Finalised</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Finalised</em>' attribute is set.
	 * @see #unsetFinalised()
	 * @see #isFinalised()
	 * @see #setFinalised(boolean)
	 * @generated
	 */
	boolean isSetFinalised();

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' attribute.
	 * @see #setFooter(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_Footer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='footer'"
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getFooter <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' attribute.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(String value);

	/**
	 * Returns the value of the '<em><b>Free Text Defs</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Text Defs</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_FreeTextDefs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='freeTextDefs'"
	 * @generated
	 */
	EList<FreeTextDefDTO> getFreeTextDefs();

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_Header()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='header'"
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(ConsentTemplateKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_Key()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='key'"
	 * @generated
	 */
	ConsentTemplateKeyDTO getKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(ConsentTemplateKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Mapped Consent Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Consent Templates</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_MappedConsentTemplates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mappedConsentTemplates'"
	 * @generated
	 */
	EList<ConsentTemplateKeyDTO> getMappedConsentTemplates();

	/**
	 * Returns the value of the '<em><b>Mapped Objection Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Objection Templates</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_MappedObjectionTemplates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mappedObjectionTemplates'"
	 * @generated
	 */
	EList<ConsentTemplateKeyDTO> getMappedObjectionTemplates();

	/**
	 * Returns the value of the '<em><b>Mapped Opt Out Consent Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Opt Out Consent Templates</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_MappedOptOutConsentTemplates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mappedOptOutConsentTemplates'"
	 * @generated
	 */
	EList<ConsentTemplateKeyDTO> getMappedOptOutConsentTemplates();

	/**
	 * Returns the value of the '<em><b>Mapped Refusal Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Refusal Templates</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_MappedRefusalTemplates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mappedRefusalTemplates'"
	 * @generated
	 */
	EList<ConsentTemplateKeyDTO> getMappedRefusalTemplates();

	/**
	 * Returns the value of the '<em><b>Mapped Revocation Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Revocation Templates</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_MappedRevocationTemplates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mappedRevocationTemplates'"
	 * @generated
	 */
	EList<ConsentTemplateKeyDTO> getMappedRevocationTemplates();

	/**
	 * Returns the value of the '<em><b>Scan Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scan Base64</em>' attribute.
	 * @see #setScanBase64(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_ScanBase64()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='scanBase64'"
	 * @generated
	 */
	String getScanBase64();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getScanBase64 <em>Scan Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Base64</em>' attribute.
	 * @see #getScanBase64()
	 * @generated
	 */
	void setScanBase64(String value);

	/**
	 * Returns the value of the '<em><b>Scan File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scan File Type</em>' attribute.
	 * @see #setScanFileType(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_ScanFileType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='scanFileType'"
	 * @generated
	 */
	String getScanFileType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getScanFileType <em>Scan File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan File Type</em>' attribute.
	 * @see #getScanFileType()
	 * @generated
	 */
	void setScanFileType(String value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(ConsentTemplateStructureDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_Structure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structure'"
	 * @generated
	 */
	ConsentTemplateStructureDTO getStructure();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(ConsentTemplateStructureDTO value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ConsentTemplateType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='type'"
	 * @generated
	 */
	ConsentTemplateType getType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(ConsentTemplateType value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ConsentTemplateType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ConsentTemplateType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Date</em>' attribute.
	 * @see #setUpdateDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_UpdateDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='updateDate'"
	 * @generated
	 */
	XMLGregorianCalendar getUpdateDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getUpdateDate <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Date</em>' attribute.
	 * @see #getUpdateDate()
	 * @generated
	 */
	void setUpdateDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Valid From Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From Properties</em>' containment reference.
	 * @see #setValidFromProperties(ValidFromPropertiesDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_ValidFromProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validFromProperties'"
	 * @generated
	 */
	ValidFromPropertiesDTO getValidFromProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getValidFromProperties <em>Valid From Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From Properties</em>' containment reference.
	 * @see #getValidFromProperties()
	 * @generated
	 */
	void setValidFromProperties(ValidFromPropertiesDTO value);

	/**
	 * Returns the value of the '<em><b>Version Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Label</em>' attribute.
	 * @see #setVersionLabel(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateDTO_VersionLabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='versionLabel'"
	 * @generated
	 */
	String getVersionLabel();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getVersionLabel <em>Version Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Label</em>' attribute.
	 * @see #getVersionLabel()
	 * @generated
	 */
	void setVersionLabel(String value);

} // ConsentTemplateDTO
