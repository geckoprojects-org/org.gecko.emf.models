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

import org.open.oasis.docs.odata.ns.edm.AnnotationType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TInclude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TInclude#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TInclude#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TInclude#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTInclude()
 * @model extendedMetaData="name='TInclude' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TInclude extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTInclude_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='http://docs.oasis-open.org/odata/ns/edm'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTInclude_Alias()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier"
	 *        extendedMetaData="kind='attribute' name='Alias'"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edmx.TInclude#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTInclude_Namespace()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TNamespaceName" required="true"
	 *        extendedMetaData="kind='attribute' name='Namespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edmx.TInclude#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

} // TInclude
