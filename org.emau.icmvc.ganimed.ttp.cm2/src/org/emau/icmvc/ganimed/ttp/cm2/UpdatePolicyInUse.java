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
 * A representation of the model object '<em><b>Update Policy In Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUse#getPolicyKey <em>Policy Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUse#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUse#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUse#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdatePolicyInUse()
 * @model extendedMetaData="name='updatePolicyInUse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UpdatePolicyInUse extends EObject {
	/**
	 * Returns the value of the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Key</em>' containment reference.
	 * @see #setPolicyKey(PolicyKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdatePolicyInUse_PolicyKey()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='policyKey'"
	 * @generated
	 */
	PolicyKeyDTO getPolicyKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUse#getPolicyKey <em>Policy Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Key</em>' containment reference.
	 * @see #getPolicyKey()
	 * @generated
	 */
	void setPolicyKey(PolicyKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdatePolicyInUse_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUse#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extern Properties</em>' attribute.
	 * @see #setExternProperties(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdatePolicyInUse_ExternProperties()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='externProperties'"
	 * @generated
	 */
	String getExternProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUse#getExternProperties <em>Extern Properties</em>}' attribute.
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
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdatePolicyInUse_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUse#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // UpdatePolicyInUse
