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
 * A representation of the model object '<em><b>TReferential Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TReferentialConstraint#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TReferentialConstraint#getProperty <em>Property</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TReferentialConstraint#getReferencedProperty <em>Referenced Property</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTReferentialConstraint()
 * @model extendedMetaData="name='TReferentialConstraint' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TReferentialConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTReferentialConstraint_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTReferentialConstraint_Property()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TPath" required="true"
	 *        extendedMetaData="kind='attribute' name='Property'"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TReferentialConstraint#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Property</em>' attribute.
	 * @see #setReferencedProperty(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTReferentialConstraint_ReferencedProperty()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TPath" required="true"
	 *        extendedMetaData="kind='attribute' name='ReferencedProperty'"
	 * @generated
	 */
	String getReferencedProperty();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TReferentialConstraint#getReferencedProperty <em>Referenced Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Property</em>' attribute.
	 * @see #getReferencedProperty()
	 * @generated
	 */
	void setReferencedProperty(String value);

} // TReferentialConstraint
