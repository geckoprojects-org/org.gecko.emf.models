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
package org.isotc211._2005.gco;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MemberName is a LocalName that references either an attribute slot in a record or  recordType or an attribute, operation, or association role in an object instance or  type description in some form of schema. The stored value "aName" is the returned value for the "aName()" operation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.MemberNameType#getAName <em>AName</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.MemberNameType#getAttributeType <em>Attribute Type</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gco.GCOPackage#getMemberNameType()
 * @model extendedMetaData="name='MemberName_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MemberNameType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>AName</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AName</em>' containment reference.
	 * @see #setAName(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gco.GCOPackage#getMemberNameType_AName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aName' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getAName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.MemberNameType#getAName <em>AName</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AName</em>' containment reference.
	 * @see #getAName()
	 * @generated
	 */
	void setAName(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' containment reference.
	 * @see #setAttributeType(TypeNamePropertyType)
	 * @see org.isotc211._2005.gco.GCOPackage#getMemberNameType_AttributeType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='attributeType' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeNamePropertyType getAttributeType();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.MemberNameType#getAttributeType <em>Attribute Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type</em>' containment reference.
	 * @see #getAttributeType()
	 * @generated
	 */
	void setAttributeType(TypeNamePropertyType value);

} // MemberNameType
