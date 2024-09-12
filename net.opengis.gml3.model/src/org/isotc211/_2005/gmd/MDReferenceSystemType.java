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

import org.isotc211._2005.gco.AbstractObjectType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDReferenceSystemType#getReferenceSystemIdentifier <em>Reference System Identifier</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDReferenceSystemType()
 * @model extendedMetaData="name='MD_ReferenceSystem_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDReferenceSystemType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Reference System Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference System Identifier</em>' containment reference.
	 * @see #setReferenceSystemIdentifier(RSIdentifierPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDReferenceSystemType_ReferenceSystemIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSystemIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	RSIdentifierPropertyType getReferenceSystemIdentifier();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDReferenceSystemType#getReferenceSystemIdentifier <em>Reference System Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference System Identifier</em>' containment reference.
	 * @see #getReferenceSystemIdentifier()
	 * @generated
	 */
	void setReferenceSystemIdentifier(RSIdentifierPropertyType value);

} // MDReferenceSystemType
