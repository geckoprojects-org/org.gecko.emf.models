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

import org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getConfig <em>Config</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getCtVersionConverter <em>Ct Version Converter</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getExpirationProperties <em>Expiration Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#isFinalised <em>Finalised</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getLogo <em>Logo</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getModuleVersionConverter <em>Module Version Converter</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getName <em>Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getPolicyVersionConverter <em>Policy Version Converter</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getSignerIdTypes <em>Signer Id Types</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getUpdateDate <em>Update Date</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO()
 * @model extendedMetaData="name='domainDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DomainDTO extends FhirIdDTO {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(DomainConfig)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_Config()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='config'"
	 * @generated
	 */
	DomainConfig getConfig();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(DomainConfig value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_CreationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='creationDate'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Ct Version Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ct Version Converter</em>' attribute.
	 * @see #setCtVersionConverter(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_CtVersionConverter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ctVersionConverter'"
	 * @generated
	 */
	String getCtVersionConverter();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getCtVersionConverter <em>Ct Version Converter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ct Version Converter</em>' attribute.
	 * @see #getCtVersionConverter()
	 * @generated
	 */
	void setCtVersionConverter(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Properties</em>' containment reference.
	 * @see #setExpirationProperties(ExpirationPropertiesDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_ExpirationProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationProperties'"
	 * @generated
	 */
	ExpirationPropertiesDTO getExpirationProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getExpirationProperties <em>Expiration Properties</em>}' containment reference.
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
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_ExternProperties()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='externProperties'"
	 * @generated
	 */
	String getExternProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getExternProperties <em>Extern Properties</em>}' attribute.
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
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_Finalised()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='finalised'"
	 * @generated
	 */
	boolean isFinalised();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#isFinalised <em>Finalised</em>}' attribute.
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
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#isFinalised <em>Finalised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinalised()
	 * @see #isFinalised()
	 * @see #setFinalised(boolean)
	 * @generated
	 */
	void unsetFinalised();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#isFinalised <em>Finalised</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo</em>' attribute.
	 * @see #setLogo(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_Logo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='logo'"
	 * @generated
	 */
	String getLogo();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getLogo <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo</em>' attribute.
	 * @see #getLogo()
	 * @generated
	 */
	void setLogo(String value);

	/**
	 * Returns the value of the '<em><b>Module Version Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Version Converter</em>' attribute.
	 * @see #setModuleVersionConverter(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_ModuleVersionConverter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='moduleVersionConverter'"
	 * @generated
	 */
	String getModuleVersionConverter();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getModuleVersionConverter <em>Module Version Converter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Version Converter</em>' attribute.
	 * @see #getModuleVersionConverter()
	 * @generated
	 */
	void setModuleVersionConverter(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Policy Version Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Version Converter</em>' attribute.
	 * @see #setPolicyVersionConverter(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_PolicyVersionConverter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='policyVersionConverter'"
	 * @generated
	 */
	String getPolicyVersionConverter();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getPolicyVersionConverter <em>Policy Version Converter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Version Converter</em>' attribute.
	 * @see #getPolicyVersionConverter()
	 * @generated
	 */
	void setPolicyVersionConverter(String value);

	/**
	 * Returns the value of the '<em><b>Signer Id Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signer Id Types</em>' attribute list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_SignerIdTypes()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='signerIdTypes'"
	 * @generated
	 */
	EList<String> getSignerIdTypes();

	/**
	 * Returns the value of the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Date</em>' attribute.
	 * @see #setUpdateDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDomainDTO_UpdateDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='updateDate'"
	 * @generated
	 */
	XMLGregorianCalendar getUpdateDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getUpdateDate <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Date</em>' attribute.
	 * @see #getUpdateDate()
	 * @generated
	 */
	void setUpdateDate(XMLGregorianCalendar value);

} // DomainDTO
