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
 * A representation of the model object '<em><b>TSingleton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TSingleton#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TSingleton#getNavigationPropertyBinding <em>Navigation Property Binding</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TSingleton#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TSingleton#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TSingleton#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TSingleton#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTSingleton()
 * @model extendedMetaData="name='TSingleton' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TSingleton extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTSingleton_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Navigation Property Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Property Binding</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTSingleton_NavigationPropertyBinding()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NavigationPropertyBinding' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TNavigationPropertyBinding> getNavigationPropertyBinding();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTSingleton_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTSingleton_Name()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TSingleton#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #isSetNullable()
	 * @see #unsetNullable()
	 * @see #setNullable(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTSingleton_Nullable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Nullable'"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TSingleton#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isSetNullable()
	 * @see #unsetNullable()
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TSingleton#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullable()
	 * @see #isNullable()
	 * @see #setNullable(boolean)
	 * @generated
	 */
	void unsetNullable();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TSingleton#isNullable <em>Nullable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nullable</em>' attribute is set.
	 * @see #unsetNullable()
	 * @see #isNullable()
	 * @see #setNullable(boolean)
	 * @generated
	 */
	boolean isSetNullable();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTSingleton_Type()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TQualifiedName" required="true"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TSingleton#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // TSingleton
