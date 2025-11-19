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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAnnotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TAnnotations#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TAnnotations#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TAnnotations#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAnnotations()
 * @model extendedMetaData="name='TAnnotations' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TAnnotations extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAnnotations_Annotation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see #setQualifier(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAnnotations_Qualifier()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier"
	 *        extendedMetaData="kind='attribute' name='Qualifier'"
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TAnnotations#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAnnotations_Target()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TTarget" required="true"
	 *        extendedMetaData="kind='attribute' name='Target'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TAnnotations#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // TAnnotations
