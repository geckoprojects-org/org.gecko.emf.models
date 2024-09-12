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
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.MemberNamePropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Range Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set of adjacent wavelengths in the electro-magnetic spectrum with a common characteristic, such as the visible band
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDRangeDimensionType#getSequenceIdentifier <em>Sequence Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDRangeDimensionType#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDRangeDimensionType()
 * @model extendedMetaData="name='MD_RangeDimension_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDRangeDimensionType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Sequence Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Identifier</em>' containment reference.
	 * @see #setSequenceIdentifier(MemberNamePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDRangeDimensionType_SequenceIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequenceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	MemberNamePropertyType getSequenceIdentifier();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDRangeDimensionType#getSequenceIdentifier <em>Sequence Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Identifier</em>' containment reference.
	 * @see #getSequenceIdentifier()
	 * @generated
	 */
	void setSequenceIdentifier(MemberNamePropertyType value);

	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' containment reference.
	 * @see #setDescriptor(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDRangeDimensionType_Descriptor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='descriptor' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getDescriptor();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDRangeDimensionType#getDescriptor <em>Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' containment reference.
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(CharacterStringPropertyType value);

} // MDRangeDimensionType
