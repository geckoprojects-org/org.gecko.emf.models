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
package org.isotc211._2005.gmd;

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RS Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.RSIdentifierType#getCodeSpace <em>Code Space</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.RSIdentifierType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getRSIdentifierType()
 * @model extendedMetaData="name='RS_Identifier_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RSIdentifierType extends MDIdentifierType {
	/**
	 * Returns the value of the '<em><b>Code Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Space</em>' containment reference.
	 * @see #setCodeSpace(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getRSIdentifierType_CodeSpace()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getCodeSpace();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.RSIdentifierType#getCodeSpace <em>Code Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Space</em>' containment reference.
	 * @see #getCodeSpace()
	 * @generated
	 */
	void setCodeSpace(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getRSIdentifierType_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getVersion();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.RSIdentifierType#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(CharacterStringPropertyType value);

} // RSIdentifierType
