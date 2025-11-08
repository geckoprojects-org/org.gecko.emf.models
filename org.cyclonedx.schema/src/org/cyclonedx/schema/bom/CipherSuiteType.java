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
 * A representation of the model object '<em><b>Cipher Suite Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.CipherSuiteType#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CipherSuiteType#getAlgorithms <em>Algorithms</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CipherSuiteType#getIdentifiers <em>Identifiers</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCipherSuiteType()
 * @model extendedMetaData="name='cipherSuite_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CipherSuiteType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             A common name for the cipher suite. For example: TLS_DHE_RSA_WITH_AES_128_CCM
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCipherSuiteType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CipherSuiteType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Algorithms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             A list of algorithms related to the cipher suite.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithms</em>' containment reference.
	 * @see #setAlgorithms(AlgorithmsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCipherSuiteType_Algorithms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='algorithms' namespace='##targetNamespace'"
	 * @generated
	 */
	AlgorithmsType getAlgorithms();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CipherSuiteType#getAlgorithms <em>Algorithms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithms</em>' containment reference.
	 * @see #getAlgorithms()
	 * @generated
	 */
	void setAlgorithms(AlgorithmsType value);

	/**
	 * Returns the value of the '<em><b>Identifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             A list of common identifiers for the cipher suite.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifiers</em>' containment reference.
	 * @see #setIdentifiers(IdentifiersType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCipherSuiteType_Identifiers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifiersType getIdentifiers();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CipherSuiteType#getIdentifiers <em>Identifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiers</em>' containment reference.
	 * @see #getIdentifiers()
	 * @generated
	 */
	void setIdentifiers(IdentifiersType value);

} // CipherSuiteType
