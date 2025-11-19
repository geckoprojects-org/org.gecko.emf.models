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
 * A representation of the model object '<em><b>TRecord Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TRecordExpression#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TRecordExpression#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TRecordExpression#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TRecordExpression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTRecordExpression()
 * @model extendedMetaData="name='TRecordExpression' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TRecordExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTRecordExpression_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Property Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TPropertyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Value</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTRecordExpression_PropertyValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyValue' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TPropertyValue> getPropertyValue();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTRecordExpression_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTRecordExpression_Type()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TQualifiedName"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TRecordExpression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // TRecordExpression
