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
 * A representation of the model object '<em><b>Assigned Module DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getDefaultConsentStatus <em>Default Consent Status</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getDisplayCheckboxes <em>Display Checkboxes</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getExpirationProperties <em>Expiration Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getModule <em>Module</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getOrderNumber <em>Order Number</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedModuleDTO()
 * @model extendedMetaData="name='assignedModuleDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AssignedModuleDTO extends FhirIdDTO {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedModuleDTO_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Default Consent Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Consent Status</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus
	 * @see #isSetDefaultConsentStatus()
	 * @see #unsetDefaultConsentStatus()
	 * @see #setDefaultConsentStatus(ConsentStatus)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedModuleDTO_DefaultConsentStatus()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='defaultConsentStatus'"
	 * @generated
	 */
	ConsentStatus getDefaultConsentStatus();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getDefaultConsentStatus <em>Default Consent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Consent Status</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus
	 * @see #isSetDefaultConsentStatus()
	 * @see #unsetDefaultConsentStatus()
	 * @see #getDefaultConsentStatus()
	 * @generated
	 */
	void setDefaultConsentStatus(ConsentStatus value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getDefaultConsentStatus <em>Default Consent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultConsentStatus()
	 * @see #getDefaultConsentStatus()
	 * @see #setDefaultConsentStatus(ConsentStatus)
	 * @generated
	 */
	void unsetDefaultConsentStatus();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getDefaultConsentStatus <em>Default Consent Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Consent Status</em>' attribute is set.
	 * @see #unsetDefaultConsentStatus()
	 * @see #getDefaultConsentStatus()
	 * @see #setDefaultConsentStatus(ConsentStatus)
	 * @generated
	 */
	boolean isSetDefaultConsentStatus();

	/**
	 * Returns the value of the '<em><b>Display Checkboxes</b></em>' attribute list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Checkboxes</em>' attribute list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedModuleDTO_DisplayCheckboxes()
	 * @model unique="false" dataType="org.emau.icmvc.ganimed.ttp.cm2.ConsentStatusObject"
	 *        extendedMetaData="kind='element' name='displayCheckboxes'"
	 * @generated
	 */
	EList<ConsentStatus> getDisplayCheckboxes();

	/**
	 * Returns the value of the '<em><b>Expiration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Properties</em>' containment reference.
	 * @see #setExpirationProperties(ExpirationPropertiesDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedModuleDTO_ExpirationProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationProperties'"
	 * @generated
	 */
	ExpirationPropertiesDTO getExpirationProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getExpirationProperties <em>Expiration Properties</em>}' containment reference.
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
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedModuleDTO_ExternProperties()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='externProperties'"
	 * @generated
	 */
	String getExternProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getExternProperties <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extern Properties</em>' attribute.
	 * @see #getExternProperties()
	 * @generated
	 */
	void setExternProperties(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #isSetMandatory()
	 * @see #unsetMandatory()
	 * @see #setMandatory(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedModuleDTO_Mandatory()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='mandatory'"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#isMandatory <em>Mandatory</em>}' attribute.
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
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMandatory()
	 * @see #isMandatory()
	 * @see #setMandatory(boolean)
	 * @generated
	 */
	void unsetMandatory();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#isMandatory <em>Mandatory</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference.
	 * @see #setModule(ModuleDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedModuleDTO_Module()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='module'"
	 * @generated
	 */
	ModuleDTO getModule();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getModule <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' containment reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(ModuleDTO value);

	/**
	 * Returns the value of the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Number</em>' attribute.
	 * @see #isSetOrderNumber()
	 * @see #unsetOrderNumber()
	 * @see #setOrderNumber(int)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedModuleDTO_OrderNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='orderNumber'"
	 * @generated
	 */
	int getOrderNumber();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getOrderNumber <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Number</em>' attribute.
	 * @see #isSetOrderNumber()
	 * @see #unsetOrderNumber()
	 * @see #getOrderNumber()
	 * @generated
	 */
	void setOrderNumber(int value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getOrderNumber <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrderNumber()
	 * @see #getOrderNumber()
	 * @see #setOrderNumber(int)
	 * @generated
	 */
	void unsetOrderNumber();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getOrderNumber <em>Order Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order Number</em>' attribute is set.
	 * @see #unsetOrderNumber()
	 * @see #getOrderNumber()
	 * @see #setOrderNumber(int)
	 * @generated
	 */
	boolean isSetOrderNumber();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(ModuleKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedModuleDTO_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent'"
	 * @generated
	 */
	ModuleKeyDTO getParent();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ModuleKeyDTO value);

} // AssignedModuleDTO
