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
package org.open.oasis.docs.odata.ns.edmx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.open.oasis.docs.odata.ns.edm.AnnotationType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TReference#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TReference#getInclude <em>Include</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TReference#getIncludeAnnotations <em>Include Annotations</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TReference#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TReference#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTReference()
 * @model extendedMetaData="name='TReference' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTReference_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edmx.TInclude}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTReference_Include()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Include' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TInclude> getInclude();

	/**
	 * Returns the value of the '<em><b>Include Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Annotations</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTReference_IncludeAnnotations()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IncludeAnnotations' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TIncludeAnnotations> getIncludeAnnotations();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTReference_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='http://docs.oasis-open.org/odata/ns/edm' group='#group:0'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTReference_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='Uri'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edmx.TReference#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // TReference
