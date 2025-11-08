/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secured By Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.SecuredByType#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.SecuredByType#getAlgorithmRef <em>Algorithm Ref</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getSecuredByType()
 * @model extendedMetaData="name='securedBy_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SecuredByType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Specifies the mechanism by which the cryptographic asset is secured by.
	 *                                                 Examples include HSM, TPM, XGX, Software, and None.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mechanism</em>' attribute.
	 * @see #setMechanism(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSecuredByType_Mechanism()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='mechanism' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMechanism();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SecuredByType#getMechanism <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' attribute.
	 * @see #getMechanism()
	 * @generated
	 */
	void setMechanism(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The bom-ref to the algorithm.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm Ref</em>' attribute.
	 * @see #setAlgorithmRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSecuredByType_AlgorithmRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='element' name='algorithmRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlgorithmRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SecuredByType#getAlgorithmRef <em>Algorithm Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Ref</em>' attribute.
	 * @see #getAlgorithmRef()
	 * @generated
	 */
	void setAlgorithmRef(String value);

} // SecuredByType
