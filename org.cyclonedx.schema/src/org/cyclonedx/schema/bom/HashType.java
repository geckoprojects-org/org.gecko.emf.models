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
 * A representation of the model object '<em><b>Hash Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies the file hash of the component
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.HashType#getValue <em>Value</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.HashType#getAlg <em>Alg</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getHashType()
 * @model extendedMetaData="name='hashType' kind='simple'"
 * @generated
 */
@ProviderType
public interface HashType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getHashType_Value()
	 * @model dataType="org.cyclonedx.schema.bom.HashValue"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.HashType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Alg</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.HashAlg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the algorithm used to create the hash
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alg</em>' attribute.
	 * @see org.cyclonedx.schema.bom.HashAlg
	 * @see #isSetAlg()
	 * @see #unsetAlg()
	 * @see #setAlg(HashAlg)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getHashType_Alg()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='alg'"
	 * @generated
	 */
	HashAlg getAlg();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.HashType#getAlg <em>Alg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alg</em>' attribute.
	 * @see org.cyclonedx.schema.bom.HashAlg
	 * @see #isSetAlg()
	 * @see #unsetAlg()
	 * @see #getAlg()
	 * @generated
	 */
	void setAlg(HashAlg value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.HashType#getAlg <em>Alg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlg()
	 * @see #getAlg()
	 * @see #setAlg(HashAlg)
	 * @generated
	 */
	void unsetAlg();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.HashType#getAlg <em>Alg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alg</em>' attribute is set.
	 * @see #unsetAlg()
	 * @see #getAlg()
	 * @see #setAlg(HashAlg)
	 * @generated
	 */
	boolean isSetAlg();

} // HashType
