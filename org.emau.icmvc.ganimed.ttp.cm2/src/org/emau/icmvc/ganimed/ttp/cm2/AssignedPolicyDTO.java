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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assigned Policy DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getExpirationProperties <em>Expiration Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedPolicyDTO()
 * @model extendedMetaData="name='assignedPolicyDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AssignedPolicyDTO extends FhirIdDTO {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedPolicyDTO_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Properties</em>' containment reference.
	 * @see #setExpirationProperties(ExpirationPropertiesDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedPolicyDTO_ExpirationProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationProperties'"
	 * @generated
	 */
	ExpirationPropertiesDTO getExpirationProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getExpirationProperties <em>Expiration Properties</em>}' containment reference.
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
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedPolicyDTO_ExternProperties()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='externProperties'"
	 * @generated
	 */
	String getExternProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getExternProperties <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extern Properties</em>' attribute.
	 * @see #getExternProperties()
	 * @generated
	 */
	void setExternProperties(String value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference.
	 * @see #setPolicy(PolicyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAssignedPolicyDTO_Policy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policy'"
	 * @generated
	 */
	PolicyDTO getPolicy();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getPolicy <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' containment reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(PolicyDTO value);

} // AssignedPolicyDTO
