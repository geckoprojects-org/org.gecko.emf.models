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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Module In Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse#getModuleKey <em>Module Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse#getShortText <em>Short Text</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse#getAssignedPolicies <em>Assigned Policies</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateModuleInUse()
 * @model extendedMetaData="name='updateModuleInUse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UpdateModuleInUse extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Key</em>' containment reference.
	 * @see #setModuleKey(ModuleKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateModuleInUse_ModuleKey()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='moduleKey'"
	 * @generated
	 */
	ModuleKeyDTO getModuleKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse#getModuleKey <em>Module Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Key</em>' containment reference.
	 * @see #getModuleKey()
	 * @generated
	 */
	void setModuleKey(ModuleKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateModuleInUse_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Short Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Text</em>' attribute.
	 * @see #setShortText(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateModuleInUse_ShortText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='shortText'"
	 * @generated
	 */
	String getShortText();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse#getShortText <em>Short Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Text</em>' attribute.
	 * @see #getShortText()
	 * @generated
	 */
	void setShortText(String value);

	/**
	 * Returns the value of the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extern Properties</em>' attribute.
	 * @see #setExternProperties(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateModuleInUse_ExternProperties()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='externProperties'"
	 * @generated
	 */
	String getExternProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse#getExternProperties <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extern Properties</em>' attribute.
	 * @see #getExternProperties()
	 * @generated
	 */
	void setExternProperties(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateModuleInUse_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Assigned Policies</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Policies</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateModuleInUse_AssignedPolicies()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='assignedPolicies'"
	 * @generated
	 */
	EList<AssignedPolicyDTO> getAssignedPolicies();

} // UpdateModuleInUse
