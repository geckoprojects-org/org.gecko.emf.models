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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EX Geographic Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.EXGeographicDescriptionType#getGeographicIdentifier <em>Geographic Identifier</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getEXGeographicDescriptionType()
 * @model extendedMetaData="name='EX_GeographicDescription_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EXGeographicDescriptionType extends AbstractEXGeographicExtentType {
	/**
	 * Returns the value of the '<em><b>Geographic Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographic Identifier</em>' containment reference.
	 * @see #setGeographicIdentifier(MDIdentifierPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getEXGeographicDescriptionType_GeographicIdentifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geographicIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	MDIdentifierPropertyType getGeographicIdentifier();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.EXGeographicDescriptionType#getGeographicIdentifier <em>Geographic Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographic Identifier</em>' containment reference.
	 * @see #getGeographicIdentifier()
	 * @generated
	 */
	void setGeographicIdentifier(MDIdentifierPropertyType value);

} // EXGeographicDescriptionType
