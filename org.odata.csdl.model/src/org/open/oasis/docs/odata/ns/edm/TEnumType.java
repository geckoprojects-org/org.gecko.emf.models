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
package org.open.oasis.docs.odata.ns.edm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEnum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEnumType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEnumType#getMember <em>Member</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEnumType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEnumType#isIsFlags <em>Is Flags</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEnumType#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEnumType#getUnderlyingType <em>Underlying Type</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEnumType()
 * @model extendedMetaData="name='TEnumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TEnumType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEnumType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TEnumTypeMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEnumType_Member()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Member' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TEnumTypeMember> getMember();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEnumType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Is Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Flags</em>' attribute.
	 * @see #isSetIsFlags()
	 * @see #unsetIsFlags()
	 * @see #setIsFlags(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEnumType_IsFlags()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsFlags'"
	 * @generated
	 */
	boolean isIsFlags();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TEnumType#isIsFlags <em>Is Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Flags</em>' attribute.
	 * @see #isSetIsFlags()
	 * @see #unsetIsFlags()
	 * @see #isIsFlags()
	 * @generated
	 */
	void setIsFlags(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TEnumType#isIsFlags <em>Is Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsFlags()
	 * @see #isIsFlags()
	 * @see #setIsFlags(boolean)
	 * @generated
	 */
	void unsetIsFlags();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TEnumType#isIsFlags <em>Is Flags</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Flags</em>' attribute is set.
	 * @see #unsetIsFlags()
	 * @see #isIsFlags()
	 * @see #setIsFlags(boolean)
	 * @generated
	 */
	boolean isSetIsFlags();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEnumType_Name()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TEnumType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Underlying Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underlying Type</em>' attribute.
	 * @see #setUnderlyingType(Object)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEnumType_UnderlyingType()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TTypeName"
	 *        extendedMetaData="kind='attribute' name='UnderlyingType'"
	 * @generated
	 */
	Object getUnderlyingType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TEnumType#getUnderlyingType <em>Underlying Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underlying Type</em>' attribute.
	 * @see #getUnderlyingType()
	 * @generated
	 */
	void setUnderlyingType(Object value);

} // TEnumType
